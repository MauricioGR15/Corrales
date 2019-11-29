/*
 * Created by JFormDesigner on Sat Oct 05 19:12:45 MDT 2019
 */

package Views;

import com.bulenkov.darcula.DarculaLaf;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLookAndFeel;
import java.awt.*;

/**
 * @author unknown
 */
public class VistaPrincipal extends JFrame {

    private viewCorrales pnl_corrales;
    private viewCrias pnl_crias;
    private viewClasificaciones pnl_clas;
    private viewProcesar pnl_procesar;
    private viewEnfermas pnl_enfermas;
    private viewCuarentenas pnl_tratamientos;
    public VistaPrincipal() {

        try{
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            BasicLookAndFeel darcula = new DarculaLaf();
            UIManager.setLookAndFeel(darcula);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        setTitle("Terneras");

//        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initContent();
//        pack();
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(500,500));
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        tabbed = new JTabbedPane();

        //======== this ========
        setTitle("Corrales Ternero");
        setIconImage(new ImageIcon("C:\\Git\\Corrales\\Imgs\\cowIcon.png").getImage());
        setMinimumSize(new Dimension(650, 650));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== tabbed ========
        {
            tabbed.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
        }
        contentPane.add(tabbed, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }




    private void initContent(){
        tabbed.add("CORRALES",pnl_corrales = new viewCorrales());
        tabbed.add("CRIAS",pnl_crias = new viewCrias());
        tabbed.add("CLASIFICAR",pnl_clas = new viewClasificaciones());
        tabbed.add("PROCESAR",pnl_procesar = new viewProcesar());
        tabbed.add("ENFERMAS",pnl_enfermas = new viewEnfermas());
        tabbed.add("TRATAMIENTOS",pnl_tratamientos = new viewCuarentenas());
    }

    public viewCuarentenas getPnl_tratamientos() {
        return pnl_tratamientos;
    }

    public viewCorrales getPnl_corrales() {
        return pnl_corrales;
    }

    public viewCrias getPnl_crias() {
        return pnl_crias;
    }

    public viewClasificaciones getPnl_clas(){ return pnl_clas;}

    public viewProcesar getPnl_procesar(){return pnl_procesar;}

    public viewEnfermas getPnl_enfermas(){return  pnl_enfermas;}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JTabbedPane tabbed;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
