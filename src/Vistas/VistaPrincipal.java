/*
 * Created by JFormDesigner on Sat Oct 05 19:12:45 MDT 2019
 */

package Vistas;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class VistaPrincipal extends JFrame {

    private pnlCorrales pnl_corrales;
    private pnlCrias pnl_crias;

    public VistaPrincipal() {
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

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(tabbed, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }



    private void initContent(){
        tabbed.add("CORRALES",pnl_corrales = new pnlCorrales());
        tabbed.add("CRIAS",pnl_crias = new pnlCrias());
    }

    public pnlCorrales getPnl_corrales() {
        return pnl_corrales;
    }

    public pnlCrias getPnl_crias() {
        return pnl_crias;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTabbedPane tabbed;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
