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

        JLabel titleLabel = new JLabel("Admin Functionalities:");
        titleLabel.setBounds(50, 10, 200, 20);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

        // Create buttons
        editAccountButton = new JButton("Edit Account Info");
        addBookButton = new JButton("Add Book");
        editBookButton = new JButton("Edit Book Details");

        // Set button positions
        editAccountButton.setBounds(50, 30, 200, 30);
        addBookButton.setBounds(50, 70, 200, 30);
        editBookButton.setBounds(50, 110, 200, 30);

        Color babyBlueColor = new Color(137, 207, 240);
        addBookButton.setBackground(babyBlueColor);
        editAccountButton.setBackground(babyBlueColor);
        editBookButton.setBackground(babyBlueColor);


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
            openAeditAccountForm();
        } else if (e.getSource() == addBookButton) {
            openAddBookForm();
        } else if (e.getSource() == editBookButton) {
            openEditBookForm();
        }
    }
    public void openAddBookForm() {
        AAddBook addBookForm = new AAddBook();
        dispose();
    }

    public void openAeditAccountForm() {
        AEditAcc editAccForm = new AEditAcc();
        dispose();
    }

    public void openEditBookForm() {
        AAddBook editBookForm = new AAddBook();
        dispose();
    }

    public static void main(String[] args) {
        new Aoption();
    }
}
