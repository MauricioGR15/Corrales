/*
 * Created by JFormDesigner on Sat Oct 26 10:59:29 MDT 2019
 */

package Views;

import Modals.DialogCriasSinClas;
import Support.Routines;

import java.awt.*;
import javax.swing.*;

/**
 * @author Mauricio Garcia
 */
public class viewClasificaciones extends JPanel {


    private String colorM[] = {"Rojo vivo","Rojo pardo","Rojo purpura"};
    private SpinnerModel spinnerModel;
    private DialogCriasSinClas dialog;



    public viewClasificaciones() {
        spinnerModel = new SpinnerNumberModel(1,0,3,1);
        initComponents();
        fillSpinner();
        cbColorM();
        dialog = new DialogCriasSinClas();
        lbl_grasa.setText(sld_grasa.getValue()+"");
        lbl_peso.setText(sld_peso.getValue()+"");
    }

    public void getMessage(int x){
        switch (x){
            case 0: Routines.msgError("Error al momento de clasificar"); return;
            default: Routines.msgExito(); return;
        }
    }

    private void fillSpinner(){
        spinnerGraCob.setModel(spinnerModel);
        ((JSpinner.DefaultEditor)spinnerGraCob.getEditor()).getTextField().setEnabled(false);
    }

    private void cbColorM(){
        cb_colorMusc.addItem("Seleccione");
        for (int i=0; i<colorM.length; i++)
            cb_colorMusc.addItem(colorM[i]);
    }

    public void resetComponents(){
        sld_peso.setValue(250);
        sld_grasa.setValue(25);
        cb_colorMusc.setSelectedIndex(0);
        tf_idCria.setText("0");
        tf_corral.setText("");
        tf_salud.setText("");
    }

    public JSlider getSld_peso() {
        return sld_peso;
    }

    public JSlider getSld_grasa() {
        return sld_grasa;
    }

    public JLabel getLbl_peso() {
        return lbl_peso;
    }

    public JLabel getLbl_grasa() {
        return lbl_grasa;
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JLabel label2;
    private JLabel label1;
    private JTextField tf_idCria;
    private JLabel label3;
    private JTextField tf_corral;
    private JLabel label5;
    private JTextField tf_salud;
    private JButton btn_buscar;
    private JLabel label6;
    private JLabel label7;
    private JSlider sld_peso;
    private JLabel lbl_peso;
    private JLabel label8;
    private JSlider sld_grasa;
    private JLabel lbl_grasa;
    private JLabel label9;
    private JComboBox cb_colorMusc;
    private JLabel label4;
    private JSpinner spinnerGraCob;
    private JButton btn_sinClas;
    private JButton btn_clasificar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        label2 = new JLabel();
        label1 = new JLabel();
        tf_idCria = new JTextField();
        label3 = new JLabel();
        tf_corral = new JTextField();
        label5 = new JLabel();
        tf_salud = new JTextField();
        btn_buscar = new JButton();
        label6 = new JLabel();
        label7 = new JLabel();
        sld_peso = new JSlider();
        lbl_peso = new JLabel();
        label8 = new JLabel();
        sld_grasa = new JSlider();
        lbl_grasa = new JLabel();
        label9 = new JLabel();
        cb_colorMusc = new JComboBox();
        label4 = new JLabel();
        spinnerGraCob = new JSpinner();
        btn_sinClas = new JButton();
        btn_clasificar = new JButton();

        //======== this ========
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {183, 174, 40};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label2 ----
        label2.setText("Ingrese el ID de una cria para clasificarla");
        label2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label2, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- label1 ----
        label1.setText("ID:");
        label1.setHorizontalAlignment(SwingConstants.RIGHT);
        label1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label1, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- tf_idCria ----
        tf_idCria.setColumns(10);
        tf_idCria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        tf_idCria.setText("0");
        add(tf_idCria, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- label3 ----
        label3.setText("Corral:");
        label3.setHorizontalAlignment(SwingConstants.RIGHT);
        label3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- tf_corral ----
        tf_corral.setColumns(10);
        tf_corral.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        tf_corral.setEditable(false);
        add(tf_corral, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- label5 ----
        label5.setText("Salud:");
        label5.setHorizontalAlignment(SwingConstants.RIGHT);
        label5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label5, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- tf_salud ----
        tf_salud.setColumns(10);
        tf_salud.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        tf_salud.setEditable(false);
        add(tf_salud, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- btn_buscar ----
        btn_buscar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        btn_buscar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\searchIcon.png"));
        btn_buscar.setPreferredSize(new Dimension(35, 30));
        add(btn_buscar, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- label6 ----
        label6.setText("CLASIFICACION");
        label6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label6, new GridBagConstraints(0, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- label7 ----
        label7.setText("Peso:");
        label7.setHorizontalAlignment(SwingConstants.RIGHT);
        label7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label7, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- sld_peso ----
        sld_peso.setMaximum(300);
        sld_peso.setMinimum(40);
        sld_peso.setMajorTickSpacing(25);
        sld_peso.setMinorTickSpacing(5);
        sld_peso.setValue(125);
        sld_peso.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(sld_peso, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- lbl_peso ----
        lbl_peso.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(lbl_peso, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label8 ----
        label8.setText("Cantidad de grasa (%):");
        label8.setHorizontalAlignment(SwingConstants.RIGHT);
        label8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label8, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- sld_grasa ----
        sld_grasa.setMajorTickSpacing(20);
        sld_grasa.setMinorTickSpacing(2);
        sld_grasa.setValue(10);
        sld_grasa.setMaximum(40);
        sld_grasa.setMinimum(2);
        sld_grasa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(sld_grasa, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- lbl_grasa ----
        lbl_grasa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(lbl_grasa, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label9 ----
        label9.setText("Color de m\u00fasculo:");
        label9.setHorizontalAlignment(SwingConstants.RIGHT);
        label9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label9, new GridBagConstraints(0, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- cb_colorMusc ----
        cb_colorMusc.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(cb_colorMusc, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- label4 ----
        label4.setText("Grasa de cobertura:");
        label4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label4, new GridBagConstraints(0, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- spinnerGraCob ----
        spinnerGraCob.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(spinnerGraCob, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- btn_sinClas ----
        btn_sinClas.setText("Crias sin clasificar");
        btn_sinClas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(btn_sinClas, new GridBagConstraints(0, 11, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 8), 0, 0));

        //---- btn_clasificar ----
        btn_clasificar.setText("Clasificar");
        btn_clasificar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(btn_clasificar, new GridBagConstraints(1, 11, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 10, 8), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public DialogCriasSinClas getDialog(){return dialog;}

    public JTextField getTf_idCria() {
        return tf_idCria;
    }

    public JTextField getTf_corral() {
        return tf_corral;
    }

    public JTextField getTf_salud() {
        return tf_salud;
    }

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public JComboBox getCb_colorMusc() {
        return cb_colorMusc;
    }

    public JSpinner getSpinnerGraCob() {
        return spinnerGraCob;
    }

    public JButton getBtn_clasificar() {
        return btn_clasificar;
    }

    public JButton getBtn_sinClas() {
        return btn_sinClas;
    }

}
