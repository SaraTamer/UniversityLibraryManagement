import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AEditBook extends JFrame {
    private JLabel searchLabel = new JLabel("Book ISBN:");
    private JButton searchButton = new JButton("Search");
    private JTextField searchISBNTextField = new JTextField();
    private JLabel bookTitleLabel = new JLabel("Book Title:");
    private JTextField bookTitleTextField = new JTextField();

    private JLabel categoryLabel = new JLabel("Category:");
    private JTextField categoryTextField = new JTextField();
    private JLabel languageLabel = new JLabel("Language:");
    private JTextField languageTextField = new JTextField();
    private JLabel editionLabel = new JLabel("Edition:");
    private JTextField editionTextField = new JTextField();
    private JLabel publishingYearLabel = new JLabel("<html>Publishing<br>Year:</html>");
    private JTextField publishingYearTextField = new JTextField();
    private JButton addBookButton = new JButton("Edit Book");

    public AEditBook() {
        setTitle("Edit Book");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10, 5, 10, 5);

        // Add searchLabel
        contentPanel.add(searchLabel, gbc);

        // Add searchISBNTextField
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        searchISBNTextField.setPreferredSize(new Dimension(200, 24));

        contentPanel.add(searchISBNTextField, gbc);

        // Add searchButton
        gbc.gridx = 2;
        contentPanel.add(searchButton, gbc);


        // Add bookTitleLabel
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        contentPanel.add(bookTitleLabel, gbc);
        // Add bookTitleTextField
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        contentPanel.add(bookTitleTextField, gbc);

        // Add categoryLabel
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        contentPanel.add(categoryLabel, gbc);

        // Add categoryTextField
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        contentPanel.add(categoryTextField, gbc);

        // Add languageLabel
        gbc.gridx = 0;
        gbc.gridy = 3;
        contentPanel.add(languageLabel, gbc);

        // Add languageTextField
        gbc.gridx = 1;
        gbc.gridy = 3;
        contentPanel.add(languageTextField, gbc);

        // Add editionLabel
        gbc.gridx = 0;
        gbc.gridy = 4;
        contentPanel.add(editionLabel, gbc);

        // Add editionTextField
        gbc.gridx = 1;
        gbc.gridy = 4;
        contentPanel.add(editionTextField, gbc);

        // Add publishingYearLabel
        gbc.gridx = 0;
        gbc.gridy = 5;
        contentPanel.add(publishingYearLabel, gbc);

        // Add publishingYearTextField
        gbc.gridx = 1;
        gbc.gridy = 5;
        contentPanel.add(publishingYearTextField, gbc);

        // Add addBookButton
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPanel.add(addBookButton, gbc);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(contentPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AEditBook::new);
    }
}
