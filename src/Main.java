import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Authentication i = new Authentication();
        i.InsertUser(1, "sara" , "tamer", "cairo", "haram", "012222222", "female", "it");
        Student stud = new Student(2,"Aya","Ali","cairo","s1","0100","female","IS",9);
        stud.editName(1,"SosoT");

    }
}