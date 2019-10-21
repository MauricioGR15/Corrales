/*
 * Created by JFormDesigner on Sat Oct 05 14:00:26 MDT 2019
 */

package Views;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mauricio Garcia Rubio
 */
public class viewCrias extends JPanel {

    private String months[];
    private int days[];
    private String dietas[];
    private int year=0;

    public viewCrias() {
        initComponents();

        months = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        dietas = new String[]{"Heno de alfalfa","Ensilaje","Pasto","Maíz"};
        cbYears();
        cbMonths();
        cbDays();
        cbDietas();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        tf_idCria = new JTextField();
        label2 = new JLabel();
        cb_fechaL_year = new JComboBox();
        cb_fechaL_month = new JComboBox();
        cb_fechaL_day = new JComboBox();
        label3 = new JLabel();
        r_riesgo = new JRadioButton();
        r_enferma = new JRadioButton();
        r_saludable = new JRadioButton();
        label9 = new JLabel();
        tf_noCorral = new JTextField();
        label8 = new JLabel();
        cb_dieta = new JComboBox();
        btn_registrarCrias = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
        swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border
        .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog"
        ,java.awt.Font.BOLD,12),java.awt.Color.red), getBorder
        ())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
        .beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException
        ();}});
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 75, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("ID Ternera:");
        label1.setFont(new Font("Century Gothic", label1.getFont().getStyle(), label1.getFont().getSize()));
        add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_idCria ----
        tf_idCria.setColumns(10);
        tf_idCria.setFont(new Font("Century Gothic", tf_idCria.getFont().getStyle(), tf_idCria.getFont().getSize()));
        add(tf_idCria, new GridBagConstraints(1, 0, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("Fecha de llegada:");
        label2.setFont(new Font("Century Gothic", label2.getFont().getStyle(), label2.getFont().getSize()));
        add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_fechaL_year ----
        cb_fechaL_year.setFont(new Font("Century Gothic", cb_fechaL_year.getFont().getStyle(), cb_fechaL_year.getFont().getSize()));
        add(cb_fechaL_year, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_fechaL_month ----
        cb_fechaL_month.setFont(new Font("Century Gothic", cb_fechaL_month.getFont().getStyle(), cb_fechaL_month.getFont().getSize()));
        add(cb_fechaL_month, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_fechaL_day ----
        cb_fechaL_day.setFont(new Font("Century Gothic", cb_fechaL_day.getFont().getStyle(), cb_fechaL_day.getFont().getSize()));
        add(cb_fechaL_day, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label3 ----
        label3.setText("Salud ternera:");
        label3.setFont(new Font("Century Gothic", label3.getFont().getStyle(), label3.getFont().getSize()));
        add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- r_riesgo ----
        r_riesgo.setText("En riesgo");
        r_riesgo.setFont(new Font("Century Gothic", r_riesgo.getFont().getStyle(), r_riesgo.getFont().getSize()));
        add(r_riesgo, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- r_enferma ----
        r_enferma.setText("Enferma");
        r_enferma.setFont(new Font("Century Gothic", r_enferma.getFont().getStyle(), r_enferma.getFont().getSize()));
        add(r_enferma, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- r_saludable ----
        r_saludable.setText("Saludable");
        r_saludable.setSelected(true);
        r_saludable.setFont(new Font("Century Gothic", r_saludable.getFont().getStyle(), r_saludable.getFont().getSize()));
        add(r_saludable, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label9 ----
        label9.setText("No de corral:");
        label9.setFont(new Font("Century Gothic", label9.getFont().getStyle(), label9.getFont().getSize()));
        add(label9, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_noCorral ----
        tf_noCorral.setColumns(10);
        tf_noCorral.setFont(new Font("Century Gothic", tf_noCorral.getFont().getStyle(), tf_noCorral.getFont().getSize()));
        add(tf_noCorral, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label8 ----
        label8.setText("Dieta:");
        label8.setFont(new Font("Century Gothic", label8.getFont().getStyle(), label8.getFont().getSize()));
        add(label8, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        add(cb_dieta, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- btn_registrarCrias ----
        btn_registrarCrias.setText("Registrar");
        btn_registrarCrias.setFont(new Font("Century Gothic", btn_registrarCrias.getFont().getStyle(), btn_registrarCrias.getFont().getSize()));
        add(btn_registrarCrias, new GridBagConstraints(1, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

        //---- group ----
        var group = new ButtonGroup();
        group.add(r_riesgo);
        group.add(r_enferma);
        group.add(r_saludable);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField tf_idCria;
    private JLabel label2;
    private JComboBox cb_fechaL_year;
    private JComboBox cb_fechaL_month;
    private JComboBox cb_fechaL_day;
    private JLabel label3;
    private JRadioButton r_riesgo;
    private JRadioButton r_enferma;
    private JRadioButton r_saludable;
    private JLabel label9;
    private JTextField tf_noCorral;
    private JLabel label8;
    private JComboBox cb_dieta;
    private JButton btn_registrarCrias;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public void cbYears(){
        cb_fechaL_year.removeAllItems();
        cb_fechaL_year.addItem("AÑO");
        for(int i=2012; i<2100; i++)
            cb_fechaL_year.addItem(i);
    }

    public void cbMonths(){
        cb_fechaL_month.removeAllItems();
        cb_fechaL_month.addItem("MES");
        for (int i = 0; i< months.length; i++)
            cb_fechaL_month.addItem(months[i]);
    }

    public void cbDays(){
        cb_fechaL_day.removeAllItems();
        cb_fechaL_day.addItem("DÍA");
        if(cb_fechaL_year.getSelectedIndex() == 0 || cb_fechaL_month.getSelectedIndex() == 0)
            return;
        year = (int) cb_fechaL_year.getSelectedItem();
        for(int i = 1; i<=days[cb_fechaL_month.getSelectedIndex()-1]; i++)
            cb_fechaL_day.addItem(i);
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
            cb_fechaL_day.addItem(29);
    }

    public void cbDietas(){
        cb_dieta.addItem("Seleccione");
        for (int i = 0; i < dietas.length; i++)
            cb_dieta.addItem(dietas[i]);

    }


    public JTextField getTf_idCria() {
        return tf_idCria;
    }

    public JComboBox getCb_fechaL_year() {
        return cb_fechaL_year;
    }

    public JComboBox getCb_fechaL_month() {
        return cb_fechaL_month;
    }

    public JComboBox getCb_fechaL_day() {
        return cb_fechaL_day;
    }

    public JRadioButton getR_riesgo() {
        return r_riesgo;
    }

    public JRadioButton getR_enferma() {
        return r_enferma;
    }

    public JRadioButton getR_saludable() {
        return r_saludable;
    }

    public JButton getBtn_registrarCrias() {
        return btn_registrarCrias;
    }

    public JTextField getTf_noCorral() {
        return tf_noCorral;
    }

    public JComboBox getCb_dieta() {
        return cb_dieta;
    }


}
