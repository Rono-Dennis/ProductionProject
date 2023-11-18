// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
 
// public class DBConnection {
 
//   private  Connection con;
 
//   public DBConnection(){
//     con = getDBConnection();
//     }

//   public Connection getDBConnection() throws ClassNotFoundException, SQLException {
//     Class.forName("com.mysql.jdbc.Driver");
//     return DriverManager.getConnection("jdbc:mysql://localhost:6666/jcg", "root", "password");
//     }
 
//   public int executeQuery(String query) throws ClassNotFoundException, SQLException {
//     return dbConnection.createStatement().executeUpdate(query);
//   }
// }