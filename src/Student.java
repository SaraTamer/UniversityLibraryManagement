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
    public void editName(int id, String newName)
    {
        String query = "update testTable set name = ? where id = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student data updated successfully.");
            } else {
                System.out.println("No rows were affected. Student data not found or not modified.");
            }
        }
        catch (Exception e) {
            System.out.println("com.Models.user.updateStudent(): " + e.getMessage());
        }
    }

}

