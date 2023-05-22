import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Astatistics extends JFrame {

    private JTable table;

    public Astatistics() {
        setTitle("Statistics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(900, 800));

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(scrollPane);
        pack();

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
    }

/*    public static void main(String[] args)
    {
        Astatistics statistics = new Astatistics();
        statistics.setVisible(true);
    }*/
}
