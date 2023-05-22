import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Alogin extends JFrame {
    private JLabel IDText = new JLabel("ID");
    private JFormattedTextField IDTextField = new JFormattedTextField();
    private JLabel PassText = new JLabel("Password");
    private JFormattedTextField PassTextField = new JFormattedTextField();

    private JButton submit = new JButton("Log in");

    public Alogin() throws SQLException {
        setTitle("Log in");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 800);
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

        Color babyBlueColor = new Color(137, 207, 240);
        submit.setBackground(babyBlueColor);

        // Use a BorderLayout for the main content pane
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);

        setVisible(true);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    registerButtonClicked();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }

    private void registerButtonClicked() throws SQLException {
        String ID= IDTextField.getText();
        String password = PassTextField.getText();
        loginSystem s = new loginSystem();

        if (s.AisAuthenticated(ID,password)) {
            Aoption OptionPage = new Aoption();
            OptionPage.setVisible(true);
            dispose();
            return;
        }
        JOptionPane.showMessageDialog(this, "Invalid email or password! Please try again", "Error", JOptionPane.ERROR_MESSAGE);


}
    public static void main(String[] args) throws SQLException {
        new Alogin();
    }

}


