package c.s.integ.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



import org.springframework.jdbc.core.RowCallbackHandler;

import java.util.logging.Logger;

//RowCallbackHandler is stateful
public class HtmlTableCallbackHandler implements RowCallbackHandler {
    
    Logger log = Logger.getLogger(HtmlTableCallbackHandler.class.getName());

    int columnCount = 0;        //need to get the actual column count
    int rowNum = 0;

    String tablehtml = "";

    @Override
    public void processRow(ResultSet rs) throws SQLException {

        log.info("Processing row " + rowNum);

        if(rowNum == 0){

            tablehtml += "<tr>";

            ResultSetMetaData rsmd = rs.getMetaData();
            columnCount = rsmd.getColumnCount();
            log.info("Number of columns : " + columnCount);
            
            for (int i = 1; i <= columnCount; i++) {  
                tablehtml += "<th>" + rsmd.getColumnName(i) + "</th>";
                }       

            //rowNum++;

            tablehtml += "</tr>";

            }
        else{

            tablehtml += "</tr>";

            for (int i = 1; i <= columnCount; i++) {  
                tablehtml += "<td>" + rs.getString(i)  + "</td>";
                }
            tablehtml += "</tr>";

            }

        rowNum ++;
        }
            
    public String getTablehtml(){
        
        return "<table border=\"1\">" + tablehtml + "</table>";

        }

  }