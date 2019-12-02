/*
 * Created by JFormDesigner on Mon Dec 02 00:01:24 MST 2019
 */

package Views;

import java.awt.*;
import javax.swing.*;

/**
 * @author Mauricio
 */
public class viewInforme extends JPanel {
    public viewInforme() {
        initComponents();
    }

    public JButton getBtn_home() {
        return btn_home;
    }

    public JTable getT_informes() {
        return t_informes;
    }

    public JButton getBtn_actualizar() {
        return btn_actualizar;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        btn_home = new JButton();
        scrollPane1 = new JScrollPane();
        t_informes = new JTable();
        btn_actualizar = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {174};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 134, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

        //---- btn_home ----
        btn_home.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\home.png"));
        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setFocusable(false);
        add(btn_home, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 50));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(t_informes);
        }
        add(scrollPane1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- btn_actualizar ----
        btn_actualizar.setFocusable(false);
        btn_actualizar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\reloadIcon.png"));
        btn_actualizar.setPreferredSize(new Dimension(30, 30));
        btn_actualizar.setMaximumSize(new Dimension(30, 30));
        btn_actualizar.setMinimumSize(new Dimension(30, 30));
        add(btn_actualizar, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JButton btn_home;
    private JScrollPane scrollPane1;
    private JTable t_informes;
    private JButton btn_actualizar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
