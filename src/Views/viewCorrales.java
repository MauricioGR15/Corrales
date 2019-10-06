/*
 * Created by JFormDesigner on Sat Oct 05 13:01:56 MDT 2019
 */

package Views;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class pnlCorrales extends JPanel {
    public pnlCorrales() {
        initComponents();
        cbType();
    }

    public JTextField getTf_noCorral() {
        return tf_noCorral;
    }

    public JComboBox getCb_type() {
        return cb_type;
    }

    public JTextField getTf_capacity() {
        return tf_capacity;
    }

    public JButton getBtn_regCorral() {
        return btn_regCorral;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        tf_noCorral = new JTextField();
        label2 = new JLabel();
        cb_type = new JComboBox();
        label3 = new JLabel();
        tf_capacity = new JTextField();
        btn_regCorral = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
        .border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder
        .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.
        awt.Font.BOLD,12),java.awt.Color.red), getBorder()))
        ; addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}})
        ;
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("Numero de corral:");
        label1.setFont(new Font("Century Gothic", label1.getFont().getStyle(), label1.getFont().getSize()));
        add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 6, 5), 0, 0));

        //---- tf_noCorral ----
        tf_noCorral.setColumns(10);
        tf_noCorral.setFont(new Font("Century Gothic", tf_noCorral.getFont().getStyle(), tf_noCorral.getFont().getSize()));
        add(tf_noCorral, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 6, 0), 0, 0));

        //---- label2 ----
        label2.setText("Tipo de corral:");
        label2.setFont(new Font("Century Gothic", label2.getFont().getStyle(), label2.getFont().getSize()));
        add(label2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 6, 5), 0, 0));

        //---- cb_type ----
        cb_type.setFont(new Font("Century Gothic", cb_type.getFont().getStyle(), cb_type.getFont().getSize()));
        add(cb_type, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 6, 0), 0, 0));

        //---- label3 ----
        label3.setText("Capacidad (max. 5000):");
        label3.setFont(new Font("Century Gothic", label3.getFont().getStyle(), label3.getFont().getSize()));
        add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 6, 5), 0, 0));

        //---- tf_capacity ----
        tf_capacity.setColumns(5);
        tf_capacity.setFont(new Font("Century Gothic", tf_capacity.getFont().getStyle(), tf_capacity.getFont().getSize()));
        add(tf_capacity, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 6, 0), 0, 0));

        //---- btn_regCorral ----
        btn_regCorral.setText("Registrar");
        btn_regCorral.setMaximumSize(new Dimension(40, 24));
        btn_regCorral.setMinimumSize(new Dimension(40, 24));
        btn_regCorral.setFont(new Font("Century Gothic", btn_regCorral.getFont().getStyle(), btn_regCorral.getFont().getSize()));
        add(btn_regCorral, new GridBagConstraints(0, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField tf_noCorral;
    private JLabel label2;
    private JComboBox cb_type;
    private JLabel label3;
    private JTextField tf_capacity;
    private JButton btn_regCorral;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void cbType(){
        cb_type.addItem("Seleccione");
        cb_type.addItem("Saludables");
        cb_type.addItem("Enfermas");
    }

}
