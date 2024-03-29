/*
 * Created by JFormDesigner on Sat Oct 05 13:01:56 MDT 2019
 */

package Views;

import Support.Rut;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class viewCorrales extends JPanel {

    private viewPrincipal viewP;

    public viewCorrales(viewPrincipal viewP) {
        initComponents();
        this.viewP = viewP;
        cbType();
    }

    public void getMessage(int x){
        switch (x){
            case 2:
                Rut.msgError("Error al insertar"); return;
            default:
                Rut.msgExito();
        }
    }

    public viewPrincipal getViewP(){
        return viewP;
    }

    public JComboBox getCb_type() {
        return cb_type;
    }

    public JButton getBtn_regCorral() {
        return btn_regCorral;
    }

    private void tf_noCorralActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    public JTable getT_corrales() {
        return t_corrales;
    }

    public JButton getBtn_home() {
        return btn_home;
    }

    public JTextField getTf_noCorral() {
        return tf_noCorral;
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        btn_home = new JButton();
        label1 = new JLabel();
        tf_noCorral = new JTextField();
        label2 = new JLabel();
        cb_type = new JComboBox();
        btn_regCorral = new JButton();
        scrollPane1 = new JScrollPane();
        t_corrales = new JTable();

        //======== this ========
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        setMinimumSize(new Dimension(600, 600));
        setPreferredSize(new Dimension(600, 600));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
        EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing
        . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
        java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
        { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )
        throw new RuntimeException( ) ;} } );
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 35, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- btn_home ----
        btn_home.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\home.png"));
        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setFocusable(false);
        add(btn_home, new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 50));

        //---- label1 ----
        label1.setText("Numero de corral:");
        label1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_noCorral ----
        tf_noCorral.setColumns(10);
        tf_noCorral.setText("0");
        tf_noCorral.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(tf_noCorral, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label2 ----
        label2.setText("Tipo de corral:");
        label2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_type ----
        cb_type.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(cb_type, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- btn_regCorral ----
        btn_regCorral.setText("Registrar");
        btn_regCorral.setMaximumSize(new Dimension(40, 24));
        btn_regCorral.setMinimumSize(new Dimension(40, 24));
        btn_regCorral.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        btn_regCorral.setFocusable(false);
        add(btn_regCorral, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //======== scrollPane1 ========
        {
            scrollPane1.setMinimumSize(new Dimension(200, 300));
            scrollPane1.setPreferredSize(new Dimension(150, 400));
            scrollPane1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));

            //---- t_corrales ----
            t_corrales.setRowSelectionAllowed(false);
            t_corrales.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
            scrollPane1.setViewportView(t_corrales);
        }
        add(scrollPane1, new GridBagConstraints(0, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JButton btn_home;
    private JLabel label1;
    private JTextField tf_noCorral;
    private JLabel label2;
    private JComboBox cb_type;
    private JButton btn_regCorral;
    private JScrollPane scrollPane1;
    private JTable t_corrales;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void cbType(){
        cb_type.addItem("Seleccione");
        cb_type.addItem("Saludables");
        cb_type.addItem("Enfermas");
    }

    public void resetComponents(){
        tf_noCorral.setText("");
        cb_type.setSelectedIndex(0);
    }


}
