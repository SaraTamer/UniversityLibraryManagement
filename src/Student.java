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
    String Password;
    int ID;
    int ACC_ID;

    Student(int id,String fname,String lname,String city,String street,
            String PhoneNum,String gender,String dep,int AccID,String pass){
        firstName = fname;
        lastName = lname;
        Street = street;
        City = city;
        phoneNum = PhoneNum;
        Gender = gender;
        ID = id;
        ACC_ID = AccID;
        Department = dep;
        Password = pass;
    }
    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setStreet(String street) {
        Street = street;
    }
    public void setCity(String city) {
        City = city;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setACC_ID(int ACC_ID) {
        this.ACC_ID = ACC_ID;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
    public void setPassword(String password) {
        Password = password;
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

    public String getGender() {
        return Gender;
    }
    public String getDepartment() {
        return Department;
    }
    public String getPassword() {
        return Password;
    }
    public int getID() {
        return ID;
    }
    public int getACC_ID() {
        return ACC_ID;
    }

    public void editName(int id, String newName)
    {
        String query = "update student set FirstName = ? where S_ID = ?";
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

