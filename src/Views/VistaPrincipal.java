/*
 * Created by JFormDesigner on Sat Oct 05 19:12:45 MDT 2019
 */

package Views;

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class VistaPrincipal extends JFrame {

    private viewCorrales pnl_corrales;
    private viewCrias pnl_crias;

    public VistaPrincipal() {

        try{

            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        setTitle("Terneras");
//        setSize(500,500);
//        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initContent();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        tabbed = new JTabbedPane();

        //======== this =======
        var contentP = getContentPane();
        contentP.setLayout(new BorderLayout());
        contentP.add(tabbed, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }



    private void initContent(){
        tabbed.add("CORRALES",pnl_corrales = new viewCorrales());
        tabbed.add("CRIAS",pnl_crias = new viewCrias());
    }

    public viewCorrales getPnl_corrales() {
        return pnl_corrales;
    }

    public viewCrias getPnl_crias() {
        return pnl_crias;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTabbedPane tabbed;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}