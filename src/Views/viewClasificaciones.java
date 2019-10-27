/*
 * Created by JFormDesigner on Sat Oct 26 10:59:29 MDT 2019
 */

package Views;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class viewClasificaciones extends JPanel {


    private String colorM[] = {"Rojo vivo","Muy rojo","Rojo claro"};
    private SpinnerModel spinnerModel;



    public viewClasificaciones() {
        spinnerModel = new SpinnerNumberModel(1,0,3,1);
        initComponents();
        fillSpinner();
        cbColorM();

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




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
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
        tf_peso = new JTextField();
        label8 = new JLabel();
        tf_cantGra = new JTextField();
        label9 = new JLabel();
        cb_colorMusc = new JComboBox();
        label4 = new JLabel();
        spinnerGraCob = new JSpinner();
        btn_clasificar = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
        . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing
        .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
        Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
        ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
        public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName (
        ) ) )throw new RuntimeException( ) ;} } );
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label2 ----
        label2.setText("Ingrese el ID de una cria para clasificarla");
        label2.setFont(new Font("Century Gothic", Font.BOLD, 12));
        add(label2, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label1 ----
        label1.setText("ID:");
        label1.setHorizontalAlignment(SwingConstants.RIGHT);
        label1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label1, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_idCria ----
        tf_idCria.setColumns(10);
        tf_idCria.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(tf_idCria, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label3 ----
        label3.setText("Corral:");
        label3.setHorizontalAlignment(SwingConstants.RIGHT);
        label3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_corral ----
        tf_corral.setColumns(10);
        tf_corral.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(tf_corral, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label5 ----
        label5.setText("Salud:");
        label5.setHorizontalAlignment(SwingConstants.RIGHT);
        label5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label5, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_salud ----
        tf_salud.setColumns(15);
        tf_salud.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(tf_salud, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- btn_buscar ----
        btn_buscar.setText("Buscar");
        btn_buscar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(btn_buscar, new GridBagConstraints(0, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label6 ----
        label6.setText("CLASIFICACION");
        label6.setFont(new Font("Century Gothic", Font.BOLD, 12));
        add(label6, new GridBagConstraints(0, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label7 ----
        label7.setText("Peso:");
        label7.setHorizontalAlignment(SwingConstants.RIGHT);
        label7.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label7, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_peso ----
        tf_peso.setColumns(5);
        tf_peso.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(tf_peso, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label8 ----
        label8.setText("Cantidad de grasa (Kg):");
        label8.setHorizontalAlignment(SwingConstants.RIGHT);
        label8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label8, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_cantGra ----
        tf_cantGra.setColumns(5);
        tf_cantGra.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(tf_cantGra, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label9 ----
        label9.setText("Color de m\u00fasculo:");
        label9.setHorizontalAlignment(SwingConstants.RIGHT);
        label9.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label9, new GridBagConstraints(0, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cb_colorMusc ----
        cb_colorMusc.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(cb_colorMusc, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label4 ----
        label4.setText("Grasa de cobertura:");
        label4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label4, new GridBagConstraints(0, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- spinnerGraCob ----
        spinnerGraCob.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(spinnerGraCob, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- btn_clasificar ----
        btn_clasificar.setText("Clasificar");
        btn_clasificar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(btn_clasificar, new GridBagConstraints(0, 11, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
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
    private JTextField tf_peso;
    private JLabel label8;
    private JTextField tf_cantGra;
    private JLabel label9;
    private JComboBox cb_colorMusc;
    private JLabel label4;
    private JSpinner spinnerGraCob;
    private JButton btn_clasificar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
