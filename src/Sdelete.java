import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Sdelete extends JFrame implements ActionListener  {

    private JButton deleteButton;
    private JTextField id ;
    private JButton returnButton ;

    Sdelete(){
        setTitle("Delete Student");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JLabel idLabel = new JLabel("Student ID:");
        id = new JTextField();
        deleteButton = new JButton("Delete");
        returnButton = new JButton("Return to Options Menu");

        idLabel.setBounds(50, 30, 100, 25);
        id.setBounds(160, 30, 200, 25);
        deleteButton.setBounds(50, 70, 100, 25);
        returnButton.setBounds(50, 110, 200, 25);


        Color babyBlueColor = new Color(137, 207, 240);
        deleteButton.setBackground(babyBlueColor);
        returnButton.setBackground(babyBlueColor);

        add(idLabel);
        add(id);
        add(deleteButton);
        add(returnButton);

        deleteButton.addActionListener(this);
        returnButton.addActionListener(this);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deleteButton ) {
            String deleteId = id.getText();
            Student student = new Student();
            student.deleteStudent(Integer.parseInt(String.valueOf(deleteId)));
            JOptionPane.showMessageDialog(this, "Student deleted successfully!");

            dispose();
        }else if(e.getSource() == returnButton){
            Aoption OptionPage = new Aoption();
            OptionPage.setVisible(true);
            dispose();
        }
    }
/*
    public static void main(String[] args) {
       new Sdelete();
    }
*/
}
