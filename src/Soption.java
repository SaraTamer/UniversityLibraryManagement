import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Soption extends JFrame implements ActionListener {

    private JButton editAccountButton;
    private JButton displayBookButton;

    Soption() {
        setTitle("Students Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        getContentPane().setBackground(new Color(238,210,186,255));

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

        Color btncolor = new Color(173, 147, 124);
        editAccountButton.setBackground(btncolor);
        displayBookButton.setBackground(btncolor);

        editAccountButton.setBorderPainted(false);
        editAccountButton.setFocusPainted(false);
        displayBookButton.setBorderPainted(false);
        displayBookButton.setFocusPainted(false);


        // Add buttons to the frame
        add(editAccountButton);
        add(displayBookButton);
        // Add action listeners to the buttons
        editAccountButton.addActionListener(this);
        displayBookButton.addActionListener(this);

        // Set icon for the JFrame
        ImageIcon icon = new ImageIcon("logo.png");
        setIconImage(icon.getImage());

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
