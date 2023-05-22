import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Astatistics extends JFrame {

    private JTable table;
    private JButton returnButton = new JButton("Return to Options Menu");


    public Astatistics() {
        setTitle("Statistics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(900, 800));

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBackground(new Color(238,210,186,255));
        table.setBackground(new Color(238,210,186,255));

        getContentPane().add(returnButton, BorderLayout.SOUTH);
        getContentPane().add(scrollPane);
        pack();
        Color btncolor = new Color(173, 147, 124);
        returnButton.setBackground(btncolor);
        returnButton.setBorderPainted(false);
        returnButton.setFocusPainted(false);

        int numBooks = Statistics.noOfBooks();
        int numStudents = Statistics.noOfStudents();
        int numAdmins = Statistics.noOfAdmins();

        // Set icon for the JFrame
        ImageIcon icon = new ImageIcon("logo.png");
        setIconImage(icon.getImage());

        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{
                        {"Number of Books", numBooks},
                        {"Number of Students", numStudents},
                        {"Number of Admins", numAdmins}
                },
                new Object[]{"Statistic", "Value"}
        );

        table.setModel(model);
        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(154,118,82,255)); // Set the desired background color

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the action when returnButton is clicked
                Aoption OptionPage = new Aoption();
                OptionPage.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args)
    {
        Astatistics statistics = new Astatistics();
        statistics.setVisible(true);
    }
}
