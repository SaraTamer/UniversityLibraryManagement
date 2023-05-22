import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aoption extends JFrame implements ActionListener {
    private JButton editAccountButton;
    private JButton addBookButton;
    private JButton editBookButton;
    private JButton deleteStudentButton;
    private JButton statisticsButton;

    Aoption(){
        setTitle("Admin Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        getContentPane().setBackground(new Color(238,210,186,255));

        JLabel titleLabel = new JLabel("Admin Functionalities:");
        titleLabel.setBounds(50, 10, 200, 20);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

        // Create buttons
        editAccountButton = new JButton("Edit Account Info");
        addBookButton = new JButton("Add Book");
        editBookButton = new JButton("Edit Book Details");
        statisticsButton = new JButton("Report");
        deleteStudentButton = new JButton("Delete a Student");

        // Set button positions
        editAccountButton.setBounds(50, 30, 200, 30);
        addBookButton.setBounds(50, 70, 200, 30);
        editBookButton.setBounds(50, 110, 200, 30);
        statisticsButton.setBounds(50, 150, 200, 30);
        deleteStudentButton.setBounds(50, 190, 200, 30);



        Color btncolor = new Color(173, 147, 124);
        addBookButton.setBackground(btncolor);
        editAccountButton.setBackground(btncolor);
        editBookButton.setBackground(btncolor);
        statisticsButton.setBackground(btncolor);
        deleteStudentButton.setBackground(btncolor);

        addBookButton.setBorderPainted(false);
        addBookButton.setFocusPainted(false);
        editAccountButton.setBorderPainted(false);
        editAccountButton.setFocusPainted(false);
        editBookButton.setBorderPainted(false);
        editBookButton.setFocusPainted(false);
        statisticsButton.setBorderPainted(false);
        statisticsButton.setFocusPainted(false);
        deleteStudentButton.setBorderPainted(false);
        deleteStudentButton.setFocusPainted(false);
        
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


        // Set icon for the JFrame
        ImageIcon icon = new ImageIcon("logo.png");
        setIconImage(icon.getImage());
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
