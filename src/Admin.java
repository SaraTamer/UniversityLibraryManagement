import java.sql.Connection;
import java.sql.PreparedStatement;

public class Admin {
    String firstName;
    String lastName;
    String Street;
    String City;
    String phoneNum;
    String Gender;
    String Role;
    int ID;
    int ACC_ID;
    String Password;

    Admin(String fname,String lname,String street,String city,String PhoneNum,String gender
            ,int id,int AccID,String role,String pass){
        firstName = fname;
        lastName = lname;
        Street = street;
        City = city;
        phoneNum = PhoneNum;
        Gender = gender;
        ID = id;
        ACC_ID = AccID;
        Role = role;
        Password = pass;
    }
    public void editfName(int id, String newName)
    {
        String query = "update Admin set FirstName = ? where ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Admin first name updated successfully.");
            } else {
                System.out.println("No rows were affected. Admin first name not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.Admin.editfName(): " + e.getMessage());
        }
    }
    public void editlName(int id, String newName)
    {
        String query = "update Admin set LastName = ? where ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Admin last name updated successfully.");
            } else {
                System.out.println("No rows were affected. Admin data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.Admin.editlName(): " + e.getMessage());
        }
    }
    public void editCity(int id, String newCity)
    {
        String query = "update Admin set City = ? where ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newCity);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Admin city updated successfully.");
            } else {
                System.out.println("No rows were affected. Admin data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.Admin.editCity(): " + e.getMessage());
        }
    }
    public void editPhone(int id, String newPhone)
    {
        String query = "update Admin set PhoneNum = ? where ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newPhone);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Admin phone updated successfully.");
            } else {
                System.out.println("No rows were affected. Admin data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.Admin.editPhone(): " + e.getMessage());
        }
    }
    public void editStreet(int id, String newStreet)
    {
        String query = "update Admin set Street = ? where ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newStreet);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Admin street updated successfully.");
            } else {
                System.out.println("No rows were affected. Admin data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.Admin.editStreet(): " + e.getMessage());
        }
    }
    public void editRole(int id, String newRole)
    {
        String query = "update Admin set Role = ? where ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newRole);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Admin role updated successfully.");
            } else {
                System.out.println("No rows were affected. Admin role not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.Admin.editRole(): " + e.getMessage());
        }
    }


    //gitters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return City;
    }
    public String getPhoneNum() {
        return phoneNum;
    }

    public int getID() {
        return ID;
    }
    public int getACC_ID() {
        return ACC_ID;
    }

    public String getGender() {
        return Gender;
    }
    public String getRole() {
        return Role;
    }
    public String getPassword() {
        return Password;
    }
}
