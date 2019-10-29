/*
 * Created by JFormDesigner on Sat Oct 05 14:00:26 MDT 2019
 */

package Views;

import javax.swing.*;
import java.awt.*;
import com.github.lgooddatepicker.components.*;

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
        dietas = new String[]{"Heno de alfalfa","Ensilaje","Pasto","Maíz"};
        cbDietas();
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        tf_idCria = new JTextField();
        label2 = new JLabel();
        dp_fechaL = new DatePicker();
        label3 = new JLabel();
        r_saludable = new JRadioButton();
        r_enferma = new JRadioButton();
        r_riesgo = new JRadioButton();
        label9 = new JLabel();
        tf_noCorral = new JTextField();
        label8 = new JLabel();
        cb_dieta = new JComboBox();
        btn_registrarCrias = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
        Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );
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
        tf_idCria.setText("0");
        add(tf_idCria, new GridBagConstraints(1, 0, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("Fecha de llegada:");
        label2.setFont(new Font("Century Gothic", label2.getFont().getStyle(), label2.getFont().getSize()));
        add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        add(dp_fechaL, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
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
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- r_enferma ----
        r_enferma.setText("Enferma");
        r_enferma.setFont(new Font("Century Gothic", r_enferma.getFont().getStyle(), r_enferma.getFont().getSize()));
        add(r_enferma, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- r_riesgo ----
        r_riesgo.setText("En riesgo");
        r_riesgo.setFont(new Font("Century Gothic", r_riesgo.getFont().getStyle(), r_riesgo.getFont().getSize()));
        add(r_riesgo, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
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
        tf_noCorral.setText("0");
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
    private DatePicker dp_fechaL;
    private JLabel label3;
    private JRadioButton r_saludable;
    private JRadioButton r_enferma;
    private JRadioButton r_riesgo;
    private JLabel label9;
    private JTextField tf_noCorral;
    private JLabel label8;
    private JComboBox cb_dieta;
    private JButton btn_registrarCrias;
    // JFormDesigner - End of variables declaration  //GEN-END:variables




    public void cbDietas(){
        cb_dieta.addItem("Seleccione");
        for (int i = 0; i < dietas.length; i++)
            cb_dieta.addItem(dietas[i]);

    }

    public void resetComponents(){
        tf_idCria.setText("");
        tf_noCorral.setText("");
        cb_dieta.setSelectedIndex(0);
    }

    public JTextField getTf_idCria() {
        return tf_idCria;
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

    public DatePicker getDp_fechaL() {
        return dp_fechaL;
    }


}
