import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/students";

        String username= "root";
        String password = "12345";

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            System.out.println("Connected to DB . ");
            System.out.println(connection);
        }
        catch(SQLException e){
            System.err.println("Connection failed: "+ e.getMessage());
        }

    }
}