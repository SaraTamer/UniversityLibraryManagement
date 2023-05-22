import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEditAcc extends JFrame implements ActionListener {
    private JTextField firstName;
    private JTextField lastName;
    private JTextField City;
    private JTextField Street;

    private JTextField phoneNum;
    private JTextField Role;
    private JTextField id ;
    private JTextField Password;
    private JButton saveButton;
    private JButton cancelButton;

   // private Admin admin;

    AEditAcc() {
       // this.admin = admin;
        setTitle("Edit Admin Account");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JLabel idLabel = new JLabel("ID:");
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("LastName:");
        JLabel cityLabel = new JLabel("City:");
        JLabel streetLabel = new JLabel("Street:");
        JLabel phoneNumLabel = new JLabel("phone Number:");
        JLabel RoleLabel = new JLabel("Role:");
        JLabel PasswordLabel = new JLabel("Password:");


        id = new JTextField(loginSystem.admin.getID());
        id.setEnabled(false);
        firstName = new JTextField(20);
        lastName = new JTextField(20);
        City = new JTextField(20);
        Street = new JTextField(20);
        phoneNum = new JTextField(20);
        Role = new JTextField(20);
        Password = new JTextField(20);



        saveButton = new JButton("Save");
        cancelButton = new JButton("Cancel");

        idLabel.setBounds(50, 30, 100, 25);
        id.setBounds(160, 30, 200, 25);
        firstNameLabel.setBounds(50, 70, 100, 25);
        firstName.setBounds(160, 70, 200, 25);
        lastNameLabel.setBounds(50, 110, 100, 25);
        lastName.setBounds(160, 110, 200, 25);
        cityLabel.setBounds(50, 150, 100, 25);
        City.setBounds(160, 150, 200, 25);
        streetLabel.setBounds(50, 190, 100, 25);
        Street.setBounds(160, 190, 200, 25);
        phoneNumLabel.setBounds(50, 230, 100, 25);
        phoneNum.setBounds(160, 230, 200, 25);
        RoleLabel.setBounds(50, 270, 100, 25);
        Role.setBounds(160, 270, 200, 25);
        PasswordLabel.setBounds(50, 310, 100, 25);
        Password.setBounds(160, 310, 200, 25);
        saveButton.setBounds(100, 360, 100, 30);
        cancelButton.setBounds(220, 360, 100, 30);


        Color babyBlueColor = new Color(137, 207, 240);
        saveButton.setBackground(babyBlueColor);
        cancelButton.setBackground(babyBlueColor);

        // Add labels, fields, and buttons to the frame
        add(idLabel);
        add(id);
        add(firstNameLabel);
        add(firstName);
        add(lastNameLabel);
        add(lastName);
        add(cityLabel);
        add(City);
        add(streetLabel);
        add(Street);
        add(phoneNumLabel);
        add(phoneNum);
        add(RoleLabel);
        add(Role);
        add(PasswordLabel);
        add(Password);

        add(saveButton);
        add(cancelButton);

        // Add action listeners to the buttons
        saveButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // Set layout and visibility
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent e){
            if (e.getSource() == saveButton) {
                String newFirstName = firstName.getText();
                String newLastName = lastName.getText();
                String newCity = City.getText();
                String newStreet = Street.getText();
                String newPhone = phoneNum.getText();
                String newRole = Role.getText();
                String newPassword = Password.getText();

                loginSystem.admin.editfName(Integer.parseInt(String.valueOf(id)), newFirstName);
                loginSystem.admin.editlName(Integer.parseInt(String.valueOf(id)), newLastName);
                loginSystem.admin.editCity(Integer.parseInt(String.valueOf(id)), newCity);
                loginSystem.admin.editStreet(Integer.parseInt(String.valueOf(id)), newStreet);
                loginSystem.admin.editPhone(Integer.parseInt(String.valueOf(id)), newPhone);
                loginSystem.admin.editRole(Integer.parseInt(String.valueOf(id)), newRole);
                loginSystem.admin.editPass(Integer.parseInt(String.valueOf(id)), newPassword);

                // Display a message dialog to inform the user about the successful update
                JOptionPane.showMessageDialog(this, "Account information updated successfully!");

                // Close the AdminEditAcc form
                dispose();
            } else if (e.getSource() == cancelButton) {
                Aoption aoption = new Aoption();
                aoption.setVisible(true);
                // Close the AdminEditAcc form without saving changes
                dispose();
            }

        }
        public static void main (String[]args){
            new AEditAcc();
        }

    }

