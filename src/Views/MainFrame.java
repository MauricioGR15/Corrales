package Views;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){

        ImageIcon icon = new ImageIcon("Imgs/cow50.png");
        setTitle("Corrales Ternero");
        setIconImage(icon.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600,600));
        setSize(600,600);
        setLocationRelativeTo(null);

        try{
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e){ }
    }

}
