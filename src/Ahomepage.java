import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ahomepage extends JFrame {
    private JButton signupButton;
    private JButton logInButton;

    public Ahomepage() {
        setTitle("Admin Homepage");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        signupButton = new JButton("Sign In");
        logInButton = new JButton("Log In");

        signupButton.setFont(new Font("Arial", Font.PLAIN, 20));
        logInButton.setFont(new Font("Arial", Font.PLAIN, 20));

        signupButton.setPreferredSize(new Dimension(200, 60));
        logInButton.setPreferredSize(new Dimension(200, 60));

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your sign in logic here
                AsignUp asignUp = new AsignUp();
                asignUp.setVisible(true);
                dispose();
            }
        });

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your log in logic here
                Alogin alogin = new Alogin();
                alogin.setVisible(true);
                dispose(); // Close the login form
            }
        });

        getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Add some vertical spacing

        JPanel signupPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        signupPanel.add(signupButton);
        getContentPane().add(signupPanel, gbc);

        gbc.gridy = 1;

        JPanel logInPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        logInPanel.add(logInButton);
        getContentPane().add(logInPanel, gbc);

        setVisible(true);
    }
    
}
