import javax.swing.*;
import java.awt.*;

public class SsignUp extends JFrame {
    private JLabel fnameText = new JLabel("First Name");
    private JFormattedTextField fnameTextField = new JFormattedTextField();
    private JLabel lnameText = new JLabel("Last Name");
    private JFormattedTextField lnameTextField = new JFormattedTextField();

    private JLabel IDText = new JLabel( "ID");
    private JFormattedTextField IDTextField = new JFormattedTextField();

    private JLabel CityText = new JLabel( "City");
    private JFormattedTextField CityTextField = new JFormattedTextField();

    private JLabel StreetText = new JLabel( "Street");
    private JFormattedTextField StreetTextField = new JFormattedTextField();

    private JLabel PHText = new JLabel( "Phone");
    private JFormattedTextField PHTextField = new JFormattedTextField();
    private JLabel genderText = new JLabel( "Gender");
    private JFormattedTextField genderTextField = new JFormattedTextField();
    private JLabel depText = new JLabel( "Department");
    private JFormattedTextField depTextField = new JFormattedTextField();

    private JButton submit = new JButton("Sign Up");



    public SsignUp() {
        setTitle("Sign Up");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create a panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10); // Set the spacing between components

        // Set the preferred sizes and fonts for the labels and text fields
        Dimension labelSize = new Dimension(150, 50);
        Dimension textFieldSize = new Dimension(400, 30);
        Font labelFont = new Font("Arial", Font.BOLD, 20);

        fnameText.setPreferredSize(labelSize);
        fnameText.setFont(labelFont);
        fnameTextField.setPreferredSize(textFieldSize);

        lnameText.setPreferredSize(labelSize);
        lnameText.setFont(labelFont);
        lnameTextField.setPreferredSize(textFieldSize);

        IDText.setPreferredSize(labelSize);
        IDText.setFont(labelFont);
        IDTextField.setPreferredSize(textFieldSize);

        CityText.setPreferredSize(labelSize);
        CityText.setFont(labelFont);
        CityTextField.setPreferredSize(textFieldSize);

        StreetText.setPreferredSize(labelSize);
        StreetText.setFont(labelFont);
        StreetTextField.setPreferredSize(textFieldSize);

        PHText.setPreferredSize(labelSize);
        PHText.setFont(labelFont);
        PHTextField.setPreferredSize(textFieldSize);

        genderText.setPreferredSize(labelSize);
        genderText.setFont(labelFont);
        genderTextField.setPreferredSize(textFieldSize);

        depText.setPreferredSize(labelSize);
        depText.setFont(labelFont);
        depTextField.setPreferredSize(textFieldSize);

        submit.setPreferredSize(new Dimension(100, 30));



        // Add components to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(fnameText, gbc);

        gbc.gridx = 1;
        panel.add(fnameTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(lnameText, gbc);

        gbc.gridx = 1;
        panel.add(lnameTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(IDText, gbc);

        gbc.gridx = 1;
        panel.add(IDTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(CityText, gbc);

        gbc.gridx = 1;
        panel.add(CityTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(StreetText, gbc);

        gbc.gridx = 1;
        panel.add(StreetTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(PHText, gbc);

        gbc.gridx = 1;
        panel.add(PHTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(genderText, gbc);

        gbc.gridx = 1;
        panel.add(genderTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(depText, gbc);

        gbc.gridx = 1;
        panel.add(depTextField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 0, 0, 0); // Adjust spacing for the button
        gbc.gridwidth = 2;
        panel.add(submit, gbc);

        // Use a BorderLayout for the main content pane
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SsignUp();
    }
}
