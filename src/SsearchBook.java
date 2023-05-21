import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class SsearchBook extends JFrame {
    private JTable table;
    private JComboBox<String> searchCriteriaComboBox;
    private JTextField searchTextField;
    private JButton searchButton;

    public SsearchBook() {
        setTitle("Search for a book");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create a panel for search components
        JPanel searchPanel = new JPanel();
        searchCriteriaComboBox = new JComboBox<>(new String[]{"ISBN", "Title", "Category", "Author", "Publishing Year"});
        searchTextField = new JTextField(20);
        searchButton = new JButton("Search");

        // Add components to the search panel
        searchPanel.add(searchCriteriaComboBox);
        searchPanel.add(searchTextField);
        searchPanel.add(searchButton);

        // Create a DefaultTableModel to store the table data
        DefaultTableModel tableModel = new DefaultTableModel();

        // Add column names to the table model
        tableModel.addColumn("ISBN");
        tableModel.addColumn("Title");
        tableModel.addColumn("Category");
        tableModel.addColumn("Language");
        tableModel.addColumn("Edition");
        tableModel.addColumn("Publishing Year");
        tableModel.addColumn("Author");

        // Create the JTable with the populated table model
        table = new JTable(tableModel);

        // Set the layout manager for the content pane
        getContentPane().setLayout(new BorderLayout());

        // Add the search panel to the content pane
        getContentPane().add(searchPanel, BorderLayout.NORTH);

        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane to the content pane
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Add ActionListener to the search button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchCriteria = (String) searchCriteriaComboBox.getSelectedItem();
                String searchTerm = searchTextField.getText();

                // Call the Display class method to search by the chosen criteria and get the result
                Display display = new Display();
                ArrayList<Book> searchResult = new ArrayList<>();

                try {
                    if (searchCriteria.equals("ISBN")) {
                        searchResult = display.searchByISBN(searchTerm);
                    } else if (searchCriteria.equals("Title")) {
                        searchResult = display.searchByTitle(searchTerm);
                    } else if (searchCriteria.equals("Category")) {
                        searchResult = display.searchByCategory(searchTerm);
                    } else if (searchCriteria.equals("Author")) {
                        searchResult = display.searchByAuthor(searchTerm);
                    } else if (searchCriteria.equals("Publishing Year")) {
                        searchResult = display.searchByYear(searchTerm);
                    }

                    // Clear the table
                    tableModel.setRowCount(0);

                    // Add row data to the table model
                    for (Book book : searchResult) {
                        Object[] rowData = {book.getISBN(), book.getTitle(), book.getCategory(), book.getLanguage(),
                                book.getEdition(), book.getPublishingYear(), book.getAuthor()};
                        tableModel.addRow(rowData);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                // Clear the table model
                tableModel.setRowCount(0);

                // Add row data to the table model
                for (Book book : searchResult) {
                    Object[] rowData = {book.getISBN(), book.getTitle(), book.getCategory(),
                            book.getLanguage(), book.getEdition(), book.getPublishingYear(), book.getAuthor()};
                    tableModel.addRow(rowData);
                }
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
       new SsearchBook();
    }
}
