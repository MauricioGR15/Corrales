/*
 * Created by JFormDesigner on Mon Oct 28 18:55:53 MST 2019
 */

package Views;

import java.awt.*;
import javax.swing.*;

import Modals.DialogClasificadas;
import com.github.lgooddatepicker.components.*;

/**
 * @author unknown
 */
public class viewProcesar extends JPanel {

    private DialogClasificadas clasificadas;

    public viewProcesar() {
        initComponents();
        clasificadas = new DialogClasificadas();
    }

    public JButton getBtn_clas() {
        return btn_clas;
    }

    public JButton getButton1() {
        return button1;
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        tf_idCria = new JTextField();
        btn_Buscar = new JButton();
        label2 = new JLabel();
        tf_noCorral = new JTextField();
        label3 = new JLabel();
        tf_fechaL = new JTextField();
        label4 = new JLabel();
        tf_salud = new JTextField();
        label5 = new JLabel();
        tf_grasaCob = new JTextField();
        label6 = new JLabel();
        dp_fechaS = new DatePicker();
        button1 = new JButton();
        btn_procesar = new JButton();
        btn_clas = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
        . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder
        . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .
        awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) )
        ;  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
        ;
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("ID cr\u00eda:");
        label1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_idCria ----
        tf_idCria.setColumns(10);
        tf_idCria.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        tf_idCria.setText("0");
        add(tf_idCria, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- btn_Buscar ----
        btn_Buscar.setText("Buscar");
        btn_Buscar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(btn_Buscar, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("No. Corral:");
        label2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label2, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_noCorral ----
        tf_noCorral.setColumns(10);
        tf_noCorral.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        tf_noCorral.setEditable(false);
        add(tf_noCorral, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("Fecha de Llegada:");
        label3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label3, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_fechaL ----
        tf_fechaL.setColumns(10);
        tf_fechaL.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        tf_fechaL.setEditable(false);
        add(tf_fechaL, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText("Salud:");
        label4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label4, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_salud ----
        tf_salud.setColumns(10);
        tf_salud.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        tf_salud.setEditable(false);
        add(tf_salud, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label5 ----
        label5.setText("Grasa de cobertura:");
        label5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label5, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- tf_grasaCob ----
        tf_grasaCob.setColumns(5);
        tf_grasaCob.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        tf_grasaCob.setEditable(false);
        add(tf_grasaCob, new GridBagConstraints(1, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label6 ----
        label6.setText("Fecha de Salida:");
        label6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label6, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(dp_fechaS, new GridBagConstraints(1, 8, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("Sacrificar");
        button1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(button1, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- btn_procesar ----
        btn_procesar.setText("Procesar");
        btn_procesar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(btn_procesar, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- btn_clas ----
        btn_clas.setText("Crias clasificadas");
        btn_clas.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(btn_clas, new GridBagConstraints(1, 10, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 5), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField tf_idCria;
    private JButton btn_Buscar;
    private JLabel label2;
    private JTextField tf_noCorral;
    private JLabel label3;
    private JTextField tf_fechaL;
    private JLabel label4;
    private JTextField tf_salud;
    private JLabel label5;
    private JTextField tf_grasaCob;
    private JLabel label6;
    private DatePicker dp_fechaS;
    private JButton button1;
    private JButton btn_procesar;
    private JButton btn_clas;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public DialogClasificadas getClasificadas(){return  clasificadas;}

    public JTextField getTf_idCria() {
        return tf_idCria;
    }

    public JButton getBtn_Buscar() {
        return btn_Buscar;
    }

    public JTextField getTf_noCorral() {
        return tf_noCorral;
    }

    public JTextField getTf_fechaL() {
        return tf_fechaL;
    }

    public JTextField getTf_salud() {
        return tf_salud;
    }

    public JTextField getTf_grasaCob() {
        return tf_grasaCob;
    }

    public DatePicker getDp_fechaS() {
        return dp_fechaS;
    }

    public JButton getBtn_procesar() {
        return btn_procesar;
    }

}
