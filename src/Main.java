import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Authentication i = new Authentication();
        i.InsertUser(1, "sara" , "tamer", "cairo", "haram", "012222222", "female", "it");
    }
}