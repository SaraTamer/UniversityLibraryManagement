import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame {
    private JButton adminButton;
    private JButton studentButton;

    public Homepage() {
        setTitle("University Library System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JLabel welcomeLabel = new JLabel("Welcome! \n Are you Admin or Student?");
        welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));

        adminButton = new JButton("Admin");
        studentButton = new JButton("Student");
        adminButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        studentButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        adminButton.setPreferredSize(new Dimension(150, 50));
        studentButton.setPreferredSize(new Dimension(150, 50));

        Color babyBlueColor = new Color(137, 207, 240);
        adminButton.setBackground(babyBlueColor);
        studentButton.setBackground(babyBlueColor);

        adminButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Ahomepage adminHomePage = new Ahomepage();
                adminHomePage.setVisible(true);
                dispose();
            }
        });

        studentButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Shomepage studentHomePage = new Shomepage();
                studentHomePage.setVisible(true);
                dispose();
            }
        });

        getContentPane().setLayout(new BorderLayout());

        JPanel welcomePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        welcomePanel.add(welcomeLabel);
        getContentPane().add(welcomePanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0); // Add some vertical spacing
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(adminButton, gbc);

        gbc.gridy = 1;
        buttonPanel.add(studentButton, gbc);

        getContentPane().add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Homepage::new);
    }

}
