import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Map;

public class Astatistics extends JFrame {

    private JTable statisticsTable;
    private JTable studentTable;
    private JTable publishingTable;
    private JButton returnButton = new JButton("Return to Options Menu");

    public Astatistics() {
        setTitle("Statistics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        statisticsTable = new JTable();
        studentTable = new JTable();
        publishingTable = new JTable();

        JScrollPane statisticsScrollPane = new JScrollPane(statisticsTable);
        JScrollPane studentScrollPane = new JScrollPane(studentTable);
        JScrollPane publishingScrollPane = new JScrollPane(publishingTable);

        panel.add(Box.createVerticalGlue());
        panel.add(statisticsScrollPane);
        panel.add(Box.createVerticalGlue());
        panel.add(studentScrollPane);
        panel.add(Box.createVerticalGlue());
        panel.add(publishingScrollPane);
        panel.add(Box.createVerticalGlue());

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(returnButton, BorderLayout.SOUTH);
        getContentPane().add(panel, BorderLayout.CENTER);

        pack();
        Color babyBlueColor = new Color(137, 207, 240);
        returnButton.setBackground(babyBlueColor);

        // Get the statistics data
        int numBooks = Statistics.noOfBooks();
        int numStudents = Statistics.noOfStudents();
        int numAdmins = Statistics.noOfAdmins();
        Map<String, Integer> studentCountMap = Statistics.countStudentsByDepartment();
        Map<String, Integer> bookCountMap = Statistics.countBooksByPublishingYear();

        // Create the statistics table model
        DefaultTableModel statisticsTableModel = new DefaultTableModel(
                new Object[][]{
                        {"Number of Books", numBooks},
                        {"Number of Students", numStudents},
                        {"Number of Admins", numAdmins}
                },
                new Object[]{"Statistic", "Value"}
        );
        statisticsTable.setModel(statisticsTableModel);

        // Create the student table model
        DefaultTableModel studentTableModel = new DefaultTableModel(
                new Object[]{"Department", "Number of Students"},
                0
        );
        for (Map.Entry<String, Integer> entry : studentCountMap.entrySet()) {
            String department = entry.getKey();
            int count = entry.getValue();
            studentTableModel.addRow(new Object[]{department, count});
        }
        studentTable.setModel(studentTableModel);

        // Create the publishing table model
        DefaultTableModel publishingTableModel = new DefaultTableModel(
                new Object[]{"Publishing Year", "Book Count"},
                0
        );
        for (Map.Entry<String, Integer> entry : bookCountMap.entrySet()) {
            String publishingYear = entry.getKey();
            int bookCount = entry.getValue();
            publishingTableModel.addRow(new Object[]{publishingYear, bookCount});
        }
        publishingTable.setModel(publishingTableModel);

        returnButton.addActionListener(e -> {
            // Handle the action when returnButton is clicked
            Aoption OptionPage = new Aoption();
            OptionPage.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        Astatistics statistics = new Astatistics();
        statistics.setVisible(true);
    }
}
