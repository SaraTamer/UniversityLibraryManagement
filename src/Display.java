import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Display {
    public void viewAllBooks() {
        String query = "SELECT * FROM book AS b, author AS a WHERE b.ISBN = a.ISBN";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add(String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s",
                "ISBN", "Title", "Category", "Language", "Edition", "Publishing Year", "Author"));

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("b.ISBN");
                String title = resultSet.getString("b.Title");
                String category = resultSet.getString("b.Category");
                String language = resultSet.getString("b.Language");
                String edition = resultSet.getString("b.Edition");
                String publishingYear = resultSet.getString("b.PublishingYear");
                String author = resultSet.getString("a.Name");

                String bookInfo = String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s",
                        id, title, category, language, edition, publishingYear, author);
                bookList.add(bookInfo);
            }
        } catch (SQLException e) {
            System.out.println("Error executing SQL query: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        for (String bookInfo : bookList) {
            System.out.println(bookInfo);
        }
    }
    public void searchByTitle(String title) throws SQLException {
        String query = "SELECT * FROM book as b, author as a WHERE b.ISBN = a.ISBN and title = ?";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add(String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s" ,
                "ISBN", "Title", "Category", "Language", "Edition", "Publishing Year" , "Author" ));

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, title);  // Set the title parameter in the query
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ISBN");
                String category = resultSet.getString("Category");
                String language = resultSet.getString("Languge");
                String edition = resultSet.getString("Edition");
                String publishingYear = resultSet.getString("PublisingYear");
                String author = resultSet.getString("Name");

                String bookInfo = String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s",
                        id, title, category, language, edition, publishingYear, author);
                bookList.add(bookInfo);
            }
        } catch (Exception e) {
            System.out.println("com.Models.user.searchByTitle(): " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        for (String bookInfo : bookList) {
            System.out.println(bookInfo);
        }
    }
    public void searchByISBN(int ISBN) throws SQLException {
        String query = "SELECT * FROM book as b, author as a WHERE b.ISBN = a.ISBN and b.isbn = ?";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add(String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s" ,
                "ISBN", "Title", "Category", "Language", "Edition", "Publishing Year" , "Author" ));

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, ISBN);  // Set the title parameter in the query
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                String title = resultSet.getString("Title");
                String category = resultSet.getString("Category");
                String language = resultSet.getString("Languge");
                String edition = resultSet.getString("Edition");
                String publishingYear = resultSet.getString("PublisingYear");
                String author = resultSet.getString("Name");

                String bookInfo = String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s",
                        ISBN, title, category, language, edition, publishingYear, author);
                bookList.add(bookInfo);
            }
        } catch (Exception e) {
            System.out.println("com.Models.user.searchByTitle(): " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        for (String bookInfo : bookList) {
            System.out.println(bookInfo);
        }
    }
    public void searchByCategory(String category) throws SQLException {
        String query = "SELECT * FROM book as b, author as a WHERE b.ISBN = a.ISBN and category = ?";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add(String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s" ,
                "ISBN", "Title", "Category", "Language", "Edition", "Publishing Year" , "Author" ));

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, category);  // Set the title parameter in the query
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int ISBN = resultSet.getInt("ISBN");
                String title = resultSet.getString("Title");
                String language = resultSet.getString("Languge");
                String edition = resultSet.getString("Edition");
                String publishingYear = resultSet.getString("PublisingYear");
                String author = resultSet.getString("Name");

                String bookInfo = String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s",
                        ISBN, title, category, language, edition, publishingYear, author);
                bookList.add(bookInfo);
            }
        } catch (Exception e) {
            System.out.println("com.Models.user.searchByTitle(): " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        for (String bookInfo : bookList) {
            System.out.println(bookInfo);
        }
    }
    public void searchByAuthor(String author) throws SQLException {
        String query = "SELECT * FROM book as b, author as a WHERE b.ISBN = a.ISBN and name = ?";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add(String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s" ,
                "ISBN", "Title", "Category", "Language", "Edition", "Publishing Year" , "Author" ));

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, author);  // Set the title parameter in the query
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int ISBN = resultSet.getInt("ISBN");
                String title = resultSet.getString("Title");
                String category = resultSet.getString("Category");
                String language = resultSet.getString("Languge");
                String edition = resultSet.getString("Edition");
                String publishingYear = resultSet.getString("PublisingYear");

                String bookInfo = String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s",
                        ISBN, title, category, language, edition, publishingYear, author);
                bookList.add(bookInfo);
            }
        } catch (Exception e) {
            System.out.println("com.Models.user.searchByTitle(): " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        for (String bookInfo : bookList) {
            System.out.println(bookInfo);
        }
    }
    public void searchByYear(String year) throws SQLException {
        String query = "SELECT * FROM book as b, author as a WHERE b.ISBN = a.ISBN and publisingYear = ?";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add(String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s" ,
                "ISBN", "Title", "Category", "Language", "Edition", "Publishing Year" , "Author" ));

        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, year);  // Set the title parameter in the query
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int ISBN = resultSet.getInt("ISBN");
                String title = resultSet.getString("Title");
                String category = resultSet.getString("Category");
                String language = resultSet.getString("Languge");
                String edition = resultSet.getString("Edition");
                String author = resultSet.getString("name");

                String bookInfo = String.format("%-10s | %-20s | %-20s | %-10s | %-7s | %-20s | %s",
                        ISBN, title, category, language, edition, year, author);
                bookList.add(bookInfo);
            }
        } catch (Exception e) {
            System.out.println("com.Models.user.searchByTitle(): " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing database resources: " + e.getMessage());
            }
        }

        for (String bookInfo : bookList) {
            System.out.println(bookInfo);
        }
    }

}
