import java.sql.*;

public class DogQueries {
    public static final String DBASE_URL
            = "jdbc:mysql://localhost:3306/dog?user=root&password=mysqlpassword";

    private static Connection connection;
//    private PreparedStatement selectDogById;
//    private PreparedStatement insertNewDog;
//    private PreparedStatement updateADog;
//    private PreparedStatement deleteADog;
    
    public static Connection getConnection() {
        try{
            return connection == null ? DriverManager.getConnection(DBASE_URL) : connection ;
        } catch(SQLException e) {
            System.out.println("Connection Failed!");
            return null;
        }
    }
    
}
