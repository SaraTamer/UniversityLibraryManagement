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

    Admin(String fname,String lname,String street,String city,String PhoneNum,String gender,int id,int AccID,String role){
        firstName = fname;
        lastName = lname;
        Street = street;
        City = city;
        phoneNum = PhoneNum;
        Gender = gender;
        ID = id;
        ACC_ID = AccID;
        Role = role;
    }

}
