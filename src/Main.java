import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Authentication i = new Authentication();
        RegistrationSystem register = new RegistrationSystem();
        register.studentSignUp();
//        register.adminSignUp();
//        Student stud = new Student(2,"Aya","Ali","cairo","s1","0100","female","IS",9,"123");
//        i.InsertStudent(stud);
//        stud.editName(1,"sjfdjf");

//        InsertUser(1, "sara" , "tamer", "cairo", "haram", "012222222", "female", "it");
    }
}