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
        setSize(800, 600);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Student Functionalities:");
        titleLabel.setBounds(200, 200, 400, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(titleLabel);

        // Create buttons
        editAccountButton = new JButton("Edit Account Info");
        displayBookButton = new JButton("Browsing Books");

        // Set button positions
        editAccountButton.setBounds(300, 260, 200, 40);
        displayBookButton.setBounds(300, 320, 200, 40);
        Font buttonFont = new Font("Arial", Font.PLAIN, 18);
        editAccountButton.setFont(buttonFont);
        displayBookButton.setFont(buttonFont);

        Color babyBlueColor = new Color(137, 207, 240);
        editAccountButton.setBackground(babyBlueColor);
        displayBookButton.setBackground(babyBlueColor);

        // Add buttons to the panel
        panel.add(editAccountButton);
        panel.add(displayBookButton);

        // Calculate the center position
        int panelWidth = panel.getSize().width;
        int panelHeight = panel.getSize().height;
        int centerX = (getWidth() - panelWidth) / 2;
        int centerY = (getHeight() - panelHeight) / 2;

        // Set the panel position
        panel.setBounds(centerX, centerY, panelWidth, panelHeight);
        add(panel);

        // Add action listeners to the buttons
        editAccountButton.addActionListener(this);
        displayBookButton.addActionListener(this);

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
        Soption runProgram = new Soption();
    }
}
