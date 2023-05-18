import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Authentication {
    Connection connection = null;
    PreparedStatement ps = null;
    CallableStatement callableStatement = null;
    ResultSet resultSet = null;

    public void InsertUser(int id, String fName, String lName, String city, String street, String pNum, String gender, String dep) {
        String query = "insert into Student (S_ID,FirstName, LastName, City, Street, PhoneNumber, Gender, Department) values(?, ?, ?, ? , ? ,?, ? , ?)";
        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, fName);
            ps.setString(3, lName);
            ps.setString(4, city);
            ps.setString(5, street);
            ps.setString(6, pNum);
            ps.setString(7, gender);
            ps.setString(8, dep);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("com.Models.user.Insertuser()" + e.getMessage());
        }
    }
}
