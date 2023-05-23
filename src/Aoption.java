import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Aoption extends JFrame implements ActionListener {
    private JButton editAccountButton;
    private JButton addBookButton;
    private JButton editBookButton;
    private JButton deleteStudentButton;
    private JButton statisticsButton;

    Aoption(){
        setTitle("Admin Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JLabel titleLabel = new JLabel("Admin Functionalities:");
        titleLabel.setBounds(200, 10, 400, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        add(titleLabel);

        // Create buttons
        editAccountButton = new JButton("Edit Account Info");
        addBookButton = new JButton("Add Book");
        editBookButton = new JButton("Edit Book Details");
        statisticsButton = new JButton("Report");
        deleteStudentButton = new JButton("Delete a Student");

        // Set button positions
        editAccountButton.setBounds(300, 80, 200, 40);
        addBookButton.setBounds(300, 140, 200, 40);
        editBookButton.setBounds(300, 200, 200, 40);
        statisticsButton.setBounds(300, 260, 200, 40);
        deleteStudentButton.setBounds(300, 320, 200, 40);



        Color babyBlueColor = new Color(137, 207, 240);
        addBookButton.setBackground(babyBlueColor);
        editAccountButton.setBackground(babyBlueColor);
        editBookButton.setBackground(babyBlueColor);
        statisticsButton.setBackground(babyBlueColor);
        deleteStudentButton.setBackground(babyBlueColor);

        // Add buttons to the frame
        add(editAccountButton);
        add(addBookButton);
        add(editBookButton);
        add(statisticsButton);
        add(deleteStudentButton);

        // Add action listeners to the buttons
        editAccountButton.addActionListener(this);
        addBookButton.addActionListener(this);
        editBookButton.addActionListener(this);
        statisticsButton.addActionListener(this);
        deleteStudentButton.addActionListener(this);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editAccountButton) {
            AEditAcc editPage = new AEditAcc();
            editPage.setVisible(true);
            dispose();
        } else if (e.getSource() == addBookButton) {
            AAddBook addPage = new AAddBook();
            addPage.setVisible(true);
            dispose();
        } else if (e.getSource() == editBookButton) {
            AEditBook editBookPage = new AEditBook();
            editBookPage.setVisible(true);
            dispose();
        } else if (e.getSource() == statisticsButton) {
            Astatistics stat = new Astatistics();
            stat.setVisible(true);
            dispose();
        }else if (e.getSource() == deleteStudentButton) {
            Sdelete delete = new Sdelete();
            delete.setVisible(true);
            dispose();
        }
    }
    public static void main(String[] args) {
        new Aoption();
    }

}
