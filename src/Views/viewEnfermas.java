/*
 * Created by JFormDesigner on Mon Oct 28 22:49:42 MST 2019
 */

package Views;

import java.awt.*;
import javax.swing.*;

public class viewEnfermas extends JPanel {

    private viewPrincipal viewP;

    public viewEnfermas(viewPrincipal viewP) {
        initComponents();
        this.viewP = viewP;
    }

    public viewPrincipal getViewP(){
        return viewP;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public JButton getBtn_home() {
        return btn_home;
    }

    public JButton getBtn_actualizar() {
        return btn_actualizar;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        btn_home = new JButton();
        label2 = new JLabel();
        scrollPane = new JScrollPane();
        t_enfermas = new JTable();
        btn_actualizar = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(477, 400));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- btn_home ----
        btn_home.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\home.png"));
        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setFocusable(false);
        add(btn_home, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 50));

        //---- label2 ----
        label2.setText("Grasa de cobertura 2");
        label2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //======== scrollPane ========
        {
            scrollPane.setMinimumSize(new Dimension(400, 300));

            //---- t_enfermas ----
            t_enfermas.setMinimumSize(new Dimension(150, 150));
            t_enfermas.setPreferredSize(new Dimension(300, 300));
            t_enfermas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
            scrollPane.setViewportView(t_enfermas);
        }
        add(scrollPane, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- btn_actualizar ----
        btn_actualizar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\reloadIcon.png"));
        btn_actualizar.setPreferredSize(new Dimension(35, 30));
        btn_actualizar.setMinimumSize(new Dimension(35, 31));
        btn_actualizar.setFocusable(false);
        add(btn_actualizar, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JButton btn_home;
    private JLabel label2;
    private JScrollPane scrollPane;
    private JTable t_enfermas;
    private JButton btn_actualizar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JTable getT_enfermas() {
        return t_enfermas;
    }
}
