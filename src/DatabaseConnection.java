import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://192.168.1.47:1433;database=UniversityLibraryManagement;encrypt=true;trustservercertificate=true";
    private static final String UserName = "LibraryAdmin";
    private static final String password = "13579";
    private static Connection connection = null;
    public static Connection getConnection()
    {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(URL, UserName, password);
            if(connection == null)
            {
                System.out.println("the connection is null");
            }
            else{
                System.out.println("the connection is not null");
            }
        }
        catch (Exception e)
        {
            System.out.println("com.Models.DBConnection.getConnection()" + e.getMessage());
        }
        return connection;
    }
}

