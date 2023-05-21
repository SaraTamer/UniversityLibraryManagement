import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aoption extends JFrame implements ActionListener {
    private JButton editAccountButton;
    private JButton addBookButton;
    private JButton editBookButton;

    Aoption(){
        setTitle("Admin Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create buttons
        editAccountButton = new JButton("Edit Account Info");
        addBookButton = new JButton("Add Book");
        editBookButton = new JButton("Edit Book Details");

        // Set button positions
        editAccountButton.setBounds(50, 30, 200, 30);
        addBookButton.setBounds(50, 70, 200, 30);
        editBookButton.setBounds(50, 110, 200, 30);

        // Add buttons to the frame
        add(editAccountButton);
        add(addBookButton);
        add(editBookButton);
        // Add action listeners to the buttons
        editAccountButton.addActionListener(this);
        addBookButton.addActionListener(this);
        editBookButton.addActionListener(this);

        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editAccountButton) {
            // Call the function to edit account info
            editAccountInfo();
        } else if (e.getSource() == addBookButton) {
            // Call the function to add a book
            Book.addNewBook();
        } else if (e.getSource() == editBookButton) {
            // Call the function to edit book details
            editBookDetails();
        }
    }

    public static void main(String[] args) {
        new Aoption();
    }
}
