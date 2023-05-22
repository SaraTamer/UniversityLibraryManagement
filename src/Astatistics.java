import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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

        getContentPane().add(returnButton, BorderLayout.SOUTH);
        getContentPane().add(scrollPane);
        pack();
        Color babyBlueColor = new Color(137, 207, 240);
        returnButton.setBackground(babyBlueColor);

        int numBooks = Statistics.noOfBooks();
        int numStudents = Statistics.noOfStudents();
        int numAdmins = Statistics.noOfAdmins();

        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{
                        {"Number of Books", numBooks},
                        {"Number of Students", numStudents},
                        {"Number of Admins", numAdmins}
                },
                new Object[]{"Statistic", "Value"}
        );

        table.setModel(model);

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
