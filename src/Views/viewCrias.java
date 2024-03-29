/*
 * Created by JFormDesigner on Sat Oct 05 14:00:26 MDT 2019
 */

package Views;

import javax.swing.*;
import java.awt.*;

import Modals.DialogCrias;
import Support.Rut;
import com.github.lgooddatepicker.components.*;

/**
 * @author Mauricio Garcia Rubio
 */
public class viewCrias extends JPanel {

    private DialogCrias dialogCrias;

    private viewPrincipal viewP;

    public viewCrias(viewPrincipal viewP) {
        initComponents();
        this.viewP = viewP;
        dialogCrias = new DialogCrias();
    }

    public viewPrincipal getViewP(){
        return viewP;
    }

    public JComboBox getCb_corrales() {
        return cb_corrales;
    }

    public JButton getBtn_home() {
        return btn_home;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        btn_home = new JButton();
        label1 = new JLabel();
        tf_idCria = new JTextField();
        label2 = new JLabel();
        dp_fechaL = new DatePicker();
        label3 = new JLabel();
        r_saludable = new JRadioButton();
        r_enferma = new JRadioButton();
        label9 = new JLabel();
        cb_corrales = new JComboBox();
        label8 = new JLabel();
        cb_dieta = new JComboBox();
        btn_consultar = new JButton();
        btn_registrarCrias = new JButton();

        //======== this ========
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 101, 70};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- btn_home ----
        btn_home.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\home.png"));
        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setFocusable(false);
        add(btn_home, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 0), 0, 50));

        //---- label1 ----
        label1.setText("ID Ternera:");
        label1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- tf_idCria ----
        tf_idCria.setColumns(10);
        tf_idCria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        tf_idCria.setText("0");
        add(tf_idCria, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label2 ----
        label2.setText("Fecha de llegada:");
        label2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- dp_fechaL ----
        dp_fechaL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(dp_fechaL, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label3 ----
        label3.setText("Salud ternera:");
        label3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- r_saludable ----
        r_saludable.setText("Saludable");
        r_saludable.setSelected(true);
        r_saludable.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(r_saludable, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- r_enferma ----
        r_enferma.setText("Enferma");
        r_enferma.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(r_enferma, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label9 ----
        label9.setText("No de corral:");
        label9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label9, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- cb_corrales ----
        cb_corrales.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(cb_corrales, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label8 ----
        label8.setText("Dieta:");
        label8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label8, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- cb_dieta ----
        cb_dieta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(cb_dieta, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- btn_consultar ----
        btn_consultar.setText("Consultar");
        btn_consultar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        btn_consultar.setFocusable(false);
        add(btn_consultar, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 8), 0, 0));

        //---- btn_registrarCrias ----
        btn_registrarCrias.setText("Registrar");
        btn_registrarCrias.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        btn_registrarCrias.setFocusable(false);
        add(btn_registrarCrias, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- group ----
        var group = new ButtonGroup();
        group.add(r_saludable);
        group.add(r_enferma);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JButton btn_home;
    private JLabel label1;
    private JTextField tf_idCria;
    private JLabel label2;
    private DatePicker dp_fechaL;
    private JLabel label3;
    private JRadioButton r_saludable;
    private JRadioButton r_enferma;
    private JLabel label9;
    private JComboBox cb_corrales;
    private JLabel label8;
    private JComboBox cb_dieta;
    private JButton btn_consultar;
    private JButton btn_registrarCrias;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public void getMessage(int x){
        switch (x){
            case 0: Rut.msgError("El corral no existe"); return;
            case 1: Rut.msgError("El corral no concuerda con el estado de salud de la cría"); return;
            case 2: Rut.msgError("Error en la inserción"); return;
            case 4: JOptionPane.showMessageDialog(this,"Se registro una cría enferma");return;
            case 5: Rut.msgError("El corral alcanzó su máxima capacidad"); return;
            default: Rut.msgExito();
        }
    }

    public void resetComponents(){
        tf_idCria.setText("");
        cb_corrales.setSelectedIndex(0);
        cb_dieta.setSelectedIndex(0);
        dp_fechaL.setText("");
    }

    public JButton getBtn_consultar() {
        return btn_consultar;
    }

    public JTextField getTf_idCria() {
        return tf_idCria;
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

    public JComboBox getCb_dieta() {
        return cb_dieta;
    }

    public DatePicker getDp_fechaL() {
        return dp_fechaL;
    }

    public DialogCrias getDialogCrias(){return dialogCrias;}


}
