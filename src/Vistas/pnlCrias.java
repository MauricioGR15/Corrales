/*
 * Created by JFormDesigner on Sat Oct 05 14:00:26 MDT 2019
 */

package Vistas;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class pnlCrias extends JPanel {
    public pnlCrias() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        tf_idCria = new JTextField();
        label2 = new JLabel();
        cb_fechaS_day = new JComboBox();
        cb_fechaS_month = new JComboBox();
        cb_fechaS_year = new JComboBox();
        label3 = new JLabel();
        r_saludable = new JRadioButton();
        r_enferma = new JRadioButton();
        r_riesgo = new JRadioButton();
        label4 = new JLabel();
        tf_peso = new JTextField();
        label5 = new JLabel();
        tf_cantG = new JTextField();
        label6 = new JLabel();
        cb_colorM = new JComboBox();
        label7 = new JLabel();
        cb_grasaC = new JComboBox();
        btn_registrarCrias = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
        0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
        .BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
        red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
        beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 75, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("ID Ternera:");
        label1.setFont(new Font("Century Gothic", label1.getFont().getStyle(), label1.getFont().getSize()));
        add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_idCria ----
        tf_idCria.setColumns(10);
        tf_idCria.setFont(new Font("Century Gothic", tf_idCria.getFont().getStyle(), tf_idCria.getFont().getSize()));
        add(tf_idCria, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("Fecha de llegada:");
        label2.setFont(new Font("Century Gothic", label2.getFont().getStyle(), label2.getFont().getSize()));
        add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_fechaS_day ----
        cb_fechaS_day.setFont(new Font("Century Gothic", cb_fechaS_day.getFont().getStyle(), cb_fechaS_day.getFont().getSize()));
        add(cb_fechaS_day, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_fechaS_month ----
        cb_fechaS_month.setFont(new Font("Century Gothic", cb_fechaS_month.getFont().getStyle(), cb_fechaS_month.getFont().getSize()));
        add(cb_fechaS_month, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_fechaS_year ----
        cb_fechaS_year.setFont(new Font("Century Gothic", cb_fechaS_year.getFont().getStyle(), cb_fechaS_year.getFont().getSize()));
        add(cb_fechaS_year, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("Salud ternera:");
        label3.setFont(new Font("Century Gothic", label3.getFont().getStyle(), label3.getFont().getSize()));
        add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- r_saludable ----
        r_saludable.setText("Saludable");
        r_saludable.setSelected(true);
        r_saludable.setFont(new Font("Century Gothic", r_saludable.getFont().getStyle(), r_saludable.getFont().getSize()));
        add(r_saludable, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- r_enferma ----
        r_enferma.setText("Enferma");
        r_enferma.setFont(new Font("Century Gothic", r_enferma.getFont().getStyle(), r_enferma.getFont().getSize()));
        add(r_enferma, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- r_riesgo ----
        r_riesgo.setText("En riesgo");
        r_riesgo.setFont(new Font("Century Gothic", r_riesgo.getFont().getStyle(), r_riesgo.getFont().getSize()));
        add(r_riesgo, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText("Peso:");
        label4.setFont(new Font("Century Gothic", label4.getFont().getStyle(), label4.getFont().getSize()));
        add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_peso ----
        tf_peso.setColumns(5);
        tf_peso.setFont(new Font("Century Gothic", tf_peso.getFont().getStyle(), tf_peso.getFont().getSize()));
        add(tf_peso, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label5 ----
        label5.setText("Cantidad de grasa:");
        label5.setFont(new Font("Century Gothic", label5.getFont().getStyle(), label5.getFont().getSize()));
        add(label5, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_cantG ----
        tf_cantG.setColumns(5);
        tf_cantG.setFont(new Font("Century Gothic", tf_cantG.getFont().getStyle(), tf_cantG.getFont().getSize()));
        add(tf_cantG, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label6 ----
        label6.setText("Color de m\u00fasculo:");
        label6.setFont(new Font("Century Gothic", label6.getFont().getStyle(), label6.getFont().getSize()));
        add(label6, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_colorM ----
        cb_colorM.setFont(new Font("Century Gothic", cb_colorM.getFont().getStyle(), cb_colorM.getFont().getSize()));
        add(cb_colorM, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label7 ----
        label7.setText("Grasa de cobertura:");
        label7.setFont(new Font("Century Gothic", label7.getFont().getStyle(), label7.getFont().getSize()));
        add(label7, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_grasaC ----
        cb_grasaC.setFont(new Font("Century Gothic", cb_grasaC.getFont().getStyle(), cb_grasaC.getFont().getSize()));
        add(cb_grasaC, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- btn_registrarCrias ----
        btn_registrarCrias.setText("Registrar");
        btn_registrarCrias.setFont(new Font("Century Gothic", btn_registrarCrias.getFont().getStyle(), btn_registrarCrias.getFont().getSize()));
        add(btn_registrarCrias, new GridBagConstraints(1, 8, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

        //---- group ----
        var group = new ButtonGroup();
        group.add(r_saludable);
        group.add(r_enferma);
        group.add(r_riesgo);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField tf_idCria;
    private JLabel label2;
    private JComboBox cb_fechaS_day;
    private JComboBox cb_fechaS_month;
    private JComboBox cb_fechaS_year;
    private JLabel label3;
    private JRadioButton r_saludable;
    private JRadioButton r_enferma;
    private JRadioButton r_riesgo;
    private JLabel label4;
    private JTextField tf_peso;
    private JLabel label5;
    private JTextField tf_cantG;
    private JLabel label6;
    private JComboBox cb_colorM;
    private JLabel label7;
    private JComboBox cb_grasaC;
    private JButton btn_registrarCrias;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}