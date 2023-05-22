import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shomepage extends JFrame {
    private JButton signUpButton;
    private JButton logInButton;

    public Shomepage() {
        setTitle("Student Homepage");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        signUpButton = new JButton("Sign Up");
        logInButton = new JButton("Log In");

        signUpButton.setFont(new Font("Arial", Font.PLAIN, 20));
        logInButton.setFont(new Font("Arial", Font.PLAIN, 20));

        signUpButton.setPreferredSize(new Dimension(200, 60));
        logInButton.setPreferredSize(new Dimension(200, 60));

        Color babyBlueColor = new Color(137, 207, 240);
        signUpButton.setBackground(babyBlueColor);
        logInButton.setBackground(babyBlueColor);

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redirect to student sign up page
                SsignUp signUpPage = new SsignUp();
                signUpPage.setVisible(true);
                dispose(); // Close the student home page
            }
        });

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redirect to student login page
                Slogin loginPage = new Slogin();
                loginPage.setVisible(true);
                dispose();
            }
        });

        getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);

        JPanel signUpPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        signUpPanel.add(signUpButton);
        getContentPane().add(signUpPanel, gbc);

        gbc.gridy = 1;

        JPanel logInPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        logInPanel.add(logInButton);
        getContentPane().add(logInPanel, gbc);

        setVisible(true);
    }
}
