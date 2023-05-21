import javax.swing.*;
public class homepage extends JFrame {
    public homepage(){
        setTitle("University Library System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public static void main(String[] arg){
        new homepage();
    }

}
