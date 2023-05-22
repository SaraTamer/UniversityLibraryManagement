import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Statistics {

    public static int noOfBooks()
    {
        String query = "SELECT COUNT(*) AS totalBooks FROM book";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        int totalBooks = 0;

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();

            if (resultSet.next()) {
                totalBooks = resultSet.getInt("totalBooks");
            }
        } catch (Exception e) {
            System.out.println("com.Models.user.noOfBooks(): " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        return totalBooks;
    }

    public static int noOfStudents() {
        String query = "SELECT COUNT(*) AS totalStudents FROM student";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        int totalStudents = 0;

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();

            if (resultSet.next()) {
                totalStudents = resultSet.getInt("totalStudents");
            }
        } catch (Exception e) {
            System.out.println("com.Models.user.noOfStudents(): " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        return totalStudents;
    }

    public static int noOfAdmins() {
        String query = "SELECT COUNT(*) AS totalAdmins FROM admin";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        int totalAdmins = 0;

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();

            if (resultSet.next()) {
                totalAdmins = resultSet.getInt("totalAdmins");
            }
        } catch (Exception e) {
            System.out.println("com.Models.user.noOfAdmins(): " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        return totalAdmins;
    }

}
