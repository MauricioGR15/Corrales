/*
 * Created by JFormDesigner on Mon Nov 25 18:01:22 MST 2019
 */

package Views;

import java.awt.*;
import javax.swing.*;
import com.github.lgooddatepicker.components.*;

/**
 * @author Mauricio
 */
public class viewCuarentenas extends JPanel {

    JButton regresar;

    public viewCuarentenas() {
        initComponents();
        regresar = new JButton(new ImageIcon("Imgs/back.png"));
        regresar.setLocation(500,10);
        add(regresar);
    }

    public JTable getT_enfermas() {
        return t_enfermas;
    }

    public JTextField getTf_idCria() {
        return tf_idCria;
    }

    public JComboBox getCb_nvoCorral() {
        return cb_nvoCorral;
    }

    public JComboBox getCb_nvaDieta() {
        return cb_nvaDieta;
    }

    public DatePicker getDp_fechaMov() {
        return dp_fechaMov;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        t_enfermas = new JTable();
        label5 = new JLabel();
        label2 = new JLabel();
        tf_idCria = new JTextField();
        btn_buscar = new JButton();
        label3 = new JLabel();
        cb_nvoCorral = new JComboBox();
        label4 = new JLabel();
        cb_nvaDieta = new JComboBox();
        label7 = new JLabel();
        dp_fechaMov = new DatePicker();
        label6 = new JLabel();
        dp_fechaIni = new DatePicker();

        //======== this ========
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
        . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing
        .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
        Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
        ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
        public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName (
        ) ) )throw new RuntimeException( ) ;} } );
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {214, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 164, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("Cr\u00edas enfermas");
        label1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label1, new GridBagConstraints(0, 0, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 0), 0, 0));

        //======== scrollPane1 ========
        {
            scrollPane1.setPreferredSize(new Dimension(500, 300));
            scrollPane1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));

            //---- t_enfermas ----
            t_enfermas.setCellSelectionEnabled(true);
            t_enfermas.setMinimumSize(new Dimension(300, 200));
            t_enfermas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
            scrollPane1.setViewportView(t_enfermas);
        }
        add(scrollPane1, new GridBagConstraints(0, 1, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 8, 0), 0, 0));

        //---- label5 ----
        label5.setText("Movimientos de corrales");
        label5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label5, new GridBagConstraints(0, 2, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 0), 0, 0));

        //---- label2 ----
        label2.setText("ID Cr\u00eda:");
        label2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label2, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- tf_idCria ----
        tf_idCria.setColumns(10);
        tf_idCria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(tf_idCria, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- btn_buscar ----
        btn_buscar.setMaximumSize(new Dimension(35, 30));
        btn_buscar.setMinimumSize(new Dimension(35, 30));
        btn_buscar.setPreferredSize(new Dimension(35, 30));
        btn_buscar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\searchIcon.png"));
        add(btn_buscar, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- label3 ----
        label3.setText("Nuevo corral:");
        label3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label3, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- cb_nvoCorral ----
        cb_nvoCorral.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(cb_nvoCorral, new GridBagConstraints(1, 4, 4, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 0), 0, 0));

        //---- label4 ----
        label4.setText("Nueva dieta:");
        label4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label4, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- cb_nvaDieta ----
        cb_nvaDieta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(cb_nvaDieta, new GridBagConstraints(1, 5, 4, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 0), 0, 0));

        //---- label7 ----
        label7.setText("Fecha de movimiento:");
        label7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label7, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- dp_fechaMov ----
        dp_fechaMov.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(dp_fechaMov, new GridBagConstraints(1, 6, 4, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 0), 0, 0));

        //---- label6 ----
        label6.setText("Inicio de enfermedad:");
        label6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label6, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));
        add(dp_fechaIni, new GridBagConstraints(1, 7, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 8, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTable t_enfermas;
    private JLabel label5;
    private JLabel label2;
    private JTextField tf_idCria;
    private JButton btn_buscar;
    private JLabel label3;
    private JComboBox cb_nvoCorral;
    private JLabel label4;
    private JComboBox cb_nvaDieta;
    private JLabel label7;
    private DatePicker dp_fechaMov;
    private JLabel label6;
    private DatePicker dp_fechaIni;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
