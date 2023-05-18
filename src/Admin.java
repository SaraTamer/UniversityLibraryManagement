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
