import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class loginSystem {
    // Connection connection = null;
    PreparedStatement statement = null;
    ResultSet reqiredResult = null;

    public boolean adminLogin(String email, String password) throws SQLException {
        boolean isAuthenticated = false;
        if (isAuthenticated(email, password)) {
            System.out.println("Login successful!");
            System.out.println("Welcome to the University Library Management system!");
            isAuthenticated = true;
        } else {
            System.out.println("Invalid email or password! Please try again");
        }
        return isAuthenticated;
    }
    public boolean isAuthenticated(String email, String password) throws SQLException {
        try {
            String query = "SELECT * FROM Account WHERE Email = ? AND Password = ?";
            Connection connection = DatabaseConnection.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, password);
            // Execute the query
            reqiredResult = statement.executeQuery();
            // Check if the account exists in the database
            if (reqiredResult.next()) {
                return true;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void StudentLogin(Student student) {

    }
}
