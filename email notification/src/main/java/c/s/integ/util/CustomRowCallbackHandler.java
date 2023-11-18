package c.s.integ.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

//RowCallbackHandler is stateful
public class CustomRowCallbackHandler implements RowCallbackHandler {
  
    //private StringBuilder sb = new StringBuilder();
    int count = 0;
    
    @Override
    public void processRow(ResultSet rs) throws SQLException {
        count++;        
        }
    
    public int getRowCount(){
        return count;
        }

  }