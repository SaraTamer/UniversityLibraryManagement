import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Book book = new Book();
//        book.addNewBook(1234567890, "CS", "CS", "English", "1", "2023");
//        book.addNewBook(1234544490, "Intro to CS", "CS", "English", "1", "2022");
        //Display display = new Display();
//        display.viewAllBooks();
//        display.searchByTitle("CS");
//        display.searchByISBN(1234544490);
//        display.searchByCategory("CS");
//        display.searchByAuthor("donham");
//        display.searchByAuthor("Satya Nadella");
//        display.searchByYear("2023");
        book.updateBookTitle(1234567890, "LM");
        book.updateBookCategory(1234567890, "IS");
        book.updateBookLanguage(1234567890, "french");
        book.updateBookEdition(1234567890, "8");
        book.updateBookPublisingYear(1234567890, "2009");
    }
}