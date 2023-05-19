import java.sql.Connection;
import java.sql.PreparedStatement;

public class Book {

    private int ISBN;
    private String title;
    private String Category;
    private String language;
    private String Edition;
    private String publishingYear;
    public Book(){

    }
    public void Book(int ISBN,String title,String Category,String language,String Edition,String publishingYear){
        this.ISBN = ISBN;
        this.title = title;
        this.Category = Category;
        this.language = language;
        this.Edition = Edition;
        this.publishingYear = publishingYear;
    }
    //add new book to the database table book
    public void addNewBook(int ISBN,String title,String Category,String languge,String Edition,String publisingYear){
        String query = "insert into book values(?,?,?,?,?,?)";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, ISBN);
            ps.setString(2, title);
            ps.setString(3, Category);
            ps.setString(4, languge);
            ps.setString(5, Edition);
            ps.setString(6, publisingYear);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("com.Models.user.Insertuser()" + e.getMessage());
        }

    }
    //Update book information in the database table book
    //update book title
    public void updateBookTitle(int ISBN,String title){
        String query  = "update book set title = ? where ISBN = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, title);
            ps.setInt(2, ISBN);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("com.Models.user.Insertuser()" + e.getMessage());
        }
    }
    //update book Category
    public void updateBookCategory(int ISBN,String Category){
        String query  = "update book set Category = ? where ISBN = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, Category);
            ps.setInt(2, ISBN);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("com.Models.user.Insertuser()" + e.getMessage());
        }
    }
    //update book language
    public void updateBookLanguage(int ISBN,String Language){
        String query  = "update book set language = ? where ISBN = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, Language);
            ps.setInt(2, ISBN);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("com.Models.user.Insertuser()" + e.getMessage());
        }
    }
    //update book Edition
    public void updateBookEdition(int ISBN,String Edition){
        String query  = "update book set Edition = ? where ISBN = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, Edition);
            ps.setInt(2, ISBN);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("com.Models.user.Insertuser()" + e.getMessage());
        }
    }
    //update book publisingYear
    public void updateBookPublisingYear(int ISBN,String publishingYear){
        String query  = "update book set publishingYear = ? where ISBN = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, publishingYear);
            ps.setInt(2, ISBN);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("com.Models.user.Insertuser()" + e.getMessage());
        }
    }



}
