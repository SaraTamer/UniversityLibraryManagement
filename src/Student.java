import java.sql.Connection;
import java.sql.PreparedStatement;
public class Student {
    String firstName;
    String lastName;
    String Street;
    String City;
    String phoneNum;
    String Gender;
    String Department;
    int ID;
    int ACC_ID;
    Student(int id,String fname,String lname,String city,String street,String PhoneNum,String gender,String dep,int AccID){
        firstName = fname;
        lastName = lname;
        Street = street;
        City = city;
        phoneNum = PhoneNum;
        Gender = gender;
        ID = id;
        ACC_ID = AccID;
        Department = dep;
    }
    public void editfName(int id, String newName)
    {
        String query = "update student set FirstName = ? where S_ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student first name updated successfully.");
            } else {
                System.out.println("No rows were affected. Student data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.user.updateStudent(): " + e.getMessage());
        }
    }
    public void editlName(int id, String newName)
    {
        String query = "update student set LastName = ? where S_ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student last name updated successfully.");
            } else {
                System.out.println("No rows were affected. Student data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.user.updateStudent(): " + e.getMessage());
        }
    }
    public void editCity(int id, String newCity)
    {
        String query = "update student set City = ? where S_ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newCity);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student city updated successfully.");
            } else {
                System.out.println("No rows were affected. Student data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.user.updateStudent(): " + e.getMessage());
        }
    }
    public void editPhone(int id, String newPhone)
    {
        String query = "update student set PhoneNumber = ? where S_ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newPhone);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student phone updated successfully.");
            } else {
                System.out.println("No rows were affected. Student data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.user.updateStudent(): " + e.getMessage());
        }
    }
    public void editStreet(int id, String newStreet)
    {
        String query = "update student set Street = ? where S_ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newStreet);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student street updated successfully.");
            } else {
                System.out.println("No rows were affected. Student data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.user.updateStudent(): " + e.getMessage());
        }
    }
    public void editDep(int id, String newDep)
    {
        String query = "update student set Department = ? where S_ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newDep);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student department updated successfully.");
            } else {
                System.out.println("No rows were affected. Student data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.user.updateStudent(): " + e.getMessage());
        }
    }

}

