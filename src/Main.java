import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Student student = new Student();

        Authentication i = new Authentication();
        RegistrationSystem register = new RegistrationSystem();
//        register.studentSignUp();
//        register.adminSignUp();
        Student stud = new Student(2,"Aya","Ali","cairo","s1","0100","female","IS","123");
        i.InsertStudent(stud);
        Student s1 = new Student(11,"Ahmed","Ali","cairo","l4","0110","male","AI","173");
        i.InsertStudent(s1);
        s1.deleteStudent(7);
//        stud.editName(1,"sjfdjf");

//        InsertUser(1, "sara" , "tamer", "cairo", "haram", "012222222", "female", "it");

//        System.out.println(i.selection());Book book = new Book();

        Book book = new Book();
//        book.addNewBook(1234567890, "CS", "CS", "English", "1", "2023");
        book.deleteBook(1234567890);
//        book.addNewBook(1234544490, "Intro to CS", "CS", "English", "1", "2022");

//        Author author = new Author("Perry Donham", "English", 1234544490);
//        author.addAuthor();
//        Author author1 = new Author("Justin Zobel", "English", 1234567890);
//        author1.addAuthor();
//
//        book.updateBookTitle(1234567890, "LM");
//        book.updateBookCategory(1234567890, "IS");
//        book.updateBookLanguage(1234567890, "french");
//        book.updateBookEdition(1234567890, "8");
//        book.updateBookPublisingYear(1234567890, "2009");
//
//        Book book1 = new Book();
//        book1.addNewBook(1234567891, "How to make soup", "Kichen", "English", "1", "2023");
//        book1.updateBookTitle(1234567891, " soup");
//        book1.updateBookCategory(1234567891, "marketing");
//
//        Book book2 = new Book();
//        book2.addNewBook(1234567892, "How to make soup", "Kichen", "English", "1", "2023");
//        book2.addNewBook(1234567892, "How to make soup", "Kichen", "English", "1", "2021");


//        Display display = new Display();
//        display.viewAllBooks();
//        display.searchByTitle("CS");
//        display.searchByISBN(1234544490);
//        display.searchByCategory("CS");
//        display.searchByAuthor("donham");
//        display.searchByAuthor("Satya Nadella");
//        display.searchByYear("2023");



    }
}