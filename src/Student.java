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

    Student(int id, String fname, String lname, String city, String street,
            String PhoneNum, String gender, String dep, int AccID, String pass) {
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
        public void setFirstName (String firstName){
            this.firstName = firstName;
        }
        public void setLastName (String lastName){
            this.lastName = lastName;
        }
        public void setStreet (String street){
            Street = street;
        }
        public void setCity (String city){
            City = city;
        }
        public void setPhoneNum (String phoneNum){
            this.phoneNum = phoneNum;
        }

        public void setID ( int ID){
            this.ID = ID;
        }
        public void setACC_ID ( int ACC_ID){
            this.ACC_ID = ACC_ID;
        }

        public void setDepartment (String department){
            Department = department;
        }

        public void setGender (String gender){
            Gender = gender;
        }
        public void setPassword (String password){
            Password = password;
        }

        //gitters
        public String getFirstName () {
            return firstName;
        }
        public String getLastName () {
            return lastName;
        }
        public String getStreet () {
            return Street;
        }
        public String getCity () {
            return City;
        }
        public String getPhoneNum () {
            return phoneNum;
        }

        public String getGender () {
            return Gender;
        }
        public String getDepartment () {
            return Department;
        }
        public String getPassword () {
            return Password;
        }
        public int getID () {
            return ID;
        }
        public int getACC_ID () {
            return ACC_ID;
        }


        public void editfName ( int id, String newName)
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
                    System.out.println("No rows were affected. Student first name not found or not modified.");
                }
            } catch (Exception e) {
                System.out.println("com.Models.Student.editfName(): " + e.getMessage());
            }
        }
        public void editlName ( int id, String newName)
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
                    System.out.println("No rows were affected. Student last name not found or not modified.");
                }
            } catch (Exception e) {
                System.out.println("com.Models.Student.editlName(): " + e.getMessage());
            }
        }
        public void editCity ( int id, String newCity)
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
                    System.out.println("No rows were affected. Student city not found or not modified.");
                }
            } catch (Exception e) {
                System.out.println("com.Models.Student.editCity(): " + e.getMessage());
            }
        }
        public void editPhone ( int id, String newPhone)
        {
            if(!RegistrationSystem.isValidPhoneNumber(newPhone))return;
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
                    System.out.println("No rows were affected. Student phone number not found or not modified.");
                }
            } catch (Exception e) {
                System.out.println("com.Models.Student.editPhone(): " + e.getMessage());
            }
        }
        public void editStreet ( int id, String newStreet)
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
                    System.out.println("No rows were affected. Student street not found or not modified.");
                }
            } catch (Exception e) {
                System.out.println("com.Models.Student.editStreet(): " + e.getMessage());
            }
        }
        public void editDep ( int id, String newDep)
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
                    System.out.println("No rows were affected. Student department not found or not modified.");
                }
            } catch (Exception e) {
                System.out.println("com.Models.Student.editDep(): " + e.getMessage());
            }
        }
    public void editPass ( int acc_id, String newPass)
    {
        if(!RegistrationSystem.isValidPassword(newPass))return;
        String query = "update account set Password = ? where ACC_ID = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newPass);
            ps.setInt(2, acc_id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student password updated successfully.");
            } else {
                System.out.println("No rows were affected. Student password not found or not modified.");
            }
        } catch (Exception e) {
            System.out.println("com.Models.Student.editPass(): " + e.getMessage());
        }
    }

}

