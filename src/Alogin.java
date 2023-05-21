import javax.swing.*;
import java.awt.*;

public class Alogin extends JFrame {
    private JLabel IDText = new JLabel("ID");
    private JFormattedTextField IDTextField = new JFormattedTextField();
    private JLabel PassText = new JLabel("Password");
    private JFormattedTextField PassTextField = new JFormattedTextField();

    private JButton submit = new JButton("Log in");

    public Alogin() {
        setTitle("Log in");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create a panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Set the spacing between components

        // Set the preferred sizes and fonts for the labels and text fields
        Dimension labelSize = new Dimension(150, 50);
        Dimension textFieldSize = new Dimension(400, 30);
        Font labelFont = new Font("Arial", Font.BOLD, 20);

        IDText.setPreferredSize(labelSize);
        IDText.setFont(labelFont);
        IDTextField.setPreferredSize(textFieldSize);

        PassText.setPreferredSize(labelSize);
        PassText.setFont(labelFont);
        PassTextField.setPreferredSize(textFieldSize);

        submit.setPreferredSize(new Dimension(100, 30));

        // Add components to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(IDText, gbc);

        gbc.gridx = 1;
        panel.add(IDTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(PassText, gbc);

        gbc.gridx = 1;
        panel.add(PassTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(submit, gbc);

        // Use a BorderLayout for the main content pane
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Slogin();
    }
}
