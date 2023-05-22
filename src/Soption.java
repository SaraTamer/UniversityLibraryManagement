import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Soption extends JFrame implements ActionListener {

    private JButton editAccountButton;
    private JButton displayBookButton;
    Soption(){
        setTitle("Students Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JLabel titleLabel = new JLabel("Student Functionalities:");
        titleLabel.setBounds(50, 10, 200, 20);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

        // Create buttons
        editAccountButton = new JButton("Edit Account Info");
        displayBookButton = new JButton("Browsing Books");

        // Set button positions
        editAccountButton.setBounds(50, 30, 200, 30);
        displayBookButton.setBounds(50, 70, 200, 30);

        Color babyBlueColor = new Color(137, 207, 240);
        editAccountButton.setBackground(babyBlueColor);
        displayBookButton.setBackground(babyBlueColor);

        // Add buttons to the frame
        add(editAccountButton);
        add(displayBookButton);
        // Add action listeners to the buttons
        editAccountButton.addActionListener(this);
        displayBookButton.addActionListener(this);

        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editAccountButton) {
            SEditAcc editPage = new SEditAcc();
            editPage.setVisible(true);
            dispose();
        } else if (e.getSource() == displayBookButton) {
            browsingBooks browsePage = new browsingBooks();
            browsePage.setVisible(true);
            dispose();
        }
    }

    public static void main(String[] args) {
        new Soption();
    }
}
