package c.s.integ.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.jdbc.core.RowCallbackHandler;

import java.util.logging.Logger;

//RowCallbackHandler is stateful
public class CreateWorksheetCallbackHandler implements RowCallbackHandler {
    
    Logger log = Logger.getLogger(CreateWorksheetCallbackHandler.class.getName());

    XSSFWorkbook workbook = new XSSFWorkbook();            
    XSSFSheet worksheet = workbook.createSheet("LABS");        
    int columnCount = 0;        //need to get the actual column count
    int rowNum = 0;

    @Override
    public void processRow(ResultSet rs) throws SQLException {

        log.info("Processing row " + rowNum);

        if(rowNum == 0){
            ResultSetMetaData rsmd = rs.getMetaData();
            columnCount = rsmd.getColumnCount();
            log.info("Number of columns : " + columnCount);

            Row sHeader = worksheet.createRow(0);
            
            for (int i = 1; i <= columnCount; i++) {  
                sHeader.createCell(i).setCellValue(rsmd.getColumnName(i));
                }                
            rowNum++;
            }

        //log.info("processing row " + rowNum);

        Row row = worksheet.createRow(rowNum++);
        
        for (int i = 1; i <= columnCount; i++) {  
            Cell cel = row.createCell(i);
            cel.setCellValue(rs.getString(i));
            }

        }
            
    public XSSFWorkbook getWorkbook(){
        return workbook;
        }

  }