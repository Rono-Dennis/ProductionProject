package c.s.integ.util;

/**
* Allows streaming in the absence of persistent entity [this is used by vanilla sql]
**/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import c.s.integ.db.engine.model.DataUpdateSettings;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

// import com.smart.integ.model.Response;
// import com.smart.integ.Application;

import java.util.logging.Logger;

//RowCallbackHandler is stateful
public class DataUpdateCallbackHandler implements RowCallbackHandler {
    
    Logger log = Logger.getLogger(DataUpdateCallbackHandler.class.getName());
     
    int columnCount = 0;        //need to get the actual column count     
    int rowNum = 1;


    String destTable = "";      
    String[] rowIdentifiers;    //unique IDs   
    String updateType = "";     
    String updateCondition = "";

    //private List<Long> lsSuccess = new ArrayList<Long>(); 
    private List<Map<String,String>> lsSuccess = new ArrayList<Map<String,String>>();
    private List<Map<String,String>> lsFailed = new ArrayList<Map<String,String>>();

    Map<String,String> err;
    Map<String,String> pass;

    JdbcTemplate jdbcTemplate;
    DataUpdateSettings upd = null;

    ResultSetMetaData rsmd = null;

    public DataUpdateCallbackHandler(JdbcTemplate _jdbcTemplate, DataUpdateSettings _upd){
        this.jdbcTemplate = _jdbcTemplate;   
        this.upd = _upd;
        rowIdentifiers = upd.getRowIdentifiers().toUpperCase().split(",");
        updateCondition = upd.getUpdateCondition();
        destTable = upd.getDestTable();
        //updateType = upd.getUpdateType();
        updateType = "MERGE";
        }

    @Override
    public void processRow(ResultSet rs) throws SQLException {

        log.info("Processing row " + rowNum);
        
        String colNames = "";
        String colValues = "";
        String updatePair = "";
        String identifierPair = "";
        String mergeSource = "";
        
    
        if(rowNum == 1){
            rsmd = rs.getMetaData();
            columnCount = rsmd.getColumnCount();
            //log.info("Number of columns : " + columnCount);
            //log.info("Number of identifies : " + rowIdentifiers.length);            
            }
        
        //1. COLUMN stuff
        int columnType = 0;
        String strTimestamp = "";
        String strDate = "";
        for (int i = 1; i <= columnCount; i++) {  
            colNames += "," + rsmd.getColumnName(i);
            columnType = rsmd.getColumnType(i);

            if(columnType == java.sql.Types.CHAR || columnType == java.sql.Types.VARCHAR || columnType == java.sql.Types.NVARCHAR){
                colValues += ", '" + rs.getString(i) + "'";
                updatePair += ", " + rsmd.getColumnName(i) + "='" + rs.getString(i) + "'";
                mergeSource += ", '" + rs.getString(i) + "' as " + rsmd.getColumnName(i);
                }
            else if(columnType == -101 || columnType == java.sql.Types.TIMESTAMP || columnType == java.sql.Types.TIMESTAMP_WITH_TIMEZONE){
                log.info("FOUND Timestamp : " + rs.getTimestamp(i) + " toString : " + rs.getTimestamp(i).toString());
            
                strTimestamp = " to_timestamp('" + rs.getTimestamp(i) + "','yyyy-mm-dd HH24:MI:SS.FF') ";

                colValues += ", " + strTimestamp + "";
                updatePair += ", " + rsmd.getColumnName(i) + "=" + strTimestamp + "";
                mergeSource += ", " + strTimestamp + " as " + rsmd.getColumnName(i);

                }
        
            else if(columnType == java.sql.Types.DATE ){
                strDate = " to_date('" + rs.getDate(i) + "','yyyy-mm-dd') ";

                colValues += ", " + strDate + "";
                updatePair += ", " + rsmd.getColumnName(i) + "=" + strDate + "";
                mergeSource += ", " + strDate + " as " + rsmd.getColumnName(i);

                }
            else{
                log.info("Not VARCHAR or NVARCHAR. Column Name = " + rsmd.getColumnName(i) + ", Column Type = " + rsmd.getColumnType(i) + ", Column Type Name = " + rsmd.getColumnTypeName(i));
                colValues += ", " +rs.getObject(i).toString() ;
                updatePair += ", " + rsmd.getColumnName(i) + "=" + rs.getObject(i).toString();
                mergeSource += ", " + rs.getObject(i).toString() + " as " + rsmd.getColumnName(i);
                }                
            }    
        colNames = colNames.substring(1);
        colValues = colValues.substring(1);
        updatePair = updatePair.substring(2);
        mergeSource = mergeSource.substring(2);
                            
        //2. UNIQUE identifiers
        for(int j=0; j< rowIdentifiers.length; j++){
            Object obj = rs.getObject(rowIdentifiers[j]);            
            if(obj instanceof String){
                identifierPair += " AND " + rowIdentifiers[j] + " = '" + rs.getString(rowIdentifiers[j]) + "'";
                }
            else{
                //log.info("Not String... obj is instanceof " + obj.getClass().getName());
                identifierPair += " AND " + rowIdentifiers[j] + " = " + rs.getString(rowIdentifiers[j]);
                }            
            }
        identifierPair = identifierPair.substring(5);
        //log.info("identifierPair = " + identifierPair);

        //3. EXECUTE UPDATES 
        //log.info("getUpdateType =" + updateType);

        if(updateType.equals("UPDATE")){
            //do the update here ....
            //log.info("DOING THE UPDATE...");

            String updSql = "UPDATE " + destTable 
                        + " SET " + updatePair 
                        + " WHERE " + identifierPair;
                        //+ " AND " + updateCondition.replace("WHERE" ," "); 
            
            log.info("UPDATE sql = " + updSql);     
            int n = jdbcTemplate.update(updSql);
            log.info("Updated " + n + " rows");

            }
        else if(updateType.equals("MERGE")){

            //a. JOIN / ON condition
            String mergeJoin = "";
            for (int h = 0; h < rowIdentifiers.length ; h++) {                  
                mergeJoin += " AND src." + rowIdentifiers[h] + "=" + "dest." + rowIdentifiers[h];
                }         
            mergeJoin = mergeJoin.substring(5);            
            
            //b. NEW values (excluding columns used in ON clause)
            String mrgUpd = "";
            String col = "";
            for (int i = 1; i <= columnCount; i++) {  
                col = rsmd.getColumnName(i);
                if(Arrays.stream(rowIdentifiers).anyMatch(col::equals)){    //if col is in the Join clause, skip it.
                    //log.info("NOT USING rowIdentifier column: " + col);
                    }
                else{
                    mrgUpd += ", dest." + col + "=" + "src." + col;
                    }
                }         
            mrgUpd = mrgUpd.substring(2);

            String mergeSql = "MERGE into " + destTable + " dest "  
                + " USING ("
                +       "SELECT " + mergeSource + " FROM dual "
                + " ) src"
                + " ON (" + mergeJoin + ")"
                + " WHEN MATCHED THEN UPDATE "
                + " SET " + mrgUpd 
                
                //+ " " + updateCondition //extra validation outside the identifier columns
                           
                + " WHEN NOT MATCHED THEN "
                + "     INSERT (" + colNames + ") "
                + "     VALUES (" + colValues + ") "
                + " ";

            //EXECUTE !!!
            log.info("mergeSql = " + mergeSql);
            int m = jdbcTemplate.update(mergeSql);
            log.info("Merged " + m + " rows");

            }     
               
        else{
            log.warning("UNKNOWN update_type:- " + updateType);
            }

        rowNum++;

        }
         
        
    
    public int getRowNum(){
        return rowNum;
    }
   

}