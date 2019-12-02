/*
 * Created by JFormDesigner on Mon Nov 25 18:01:22 MST 2019
 */

package Views;

import java.awt.*;
import javax.swing.*;

import Support.Rut;
import com.github.lgooddatepicker.components.*;

/**
 * @author Mauricio
 */
public class viewCuarentenas extends JPanel {

    private viewPrincipal viewP;

    public viewCuarentenas(viewPrincipal viewP) {
        initComponents();
        this.viewP = viewP;

    }

    public void getMessage(int x){
        switch (x){
            case 1:
                Rut.msgError("La fecha ingresada es menor que cuando llegó la cría a su actual corral"); return;
            case 2:
                Rut.msgError("Error en el proceso"); return;
            case 3:
                Rut.msgExito();
        }
    }


    public viewPrincipal getViewP(){
        return viewP;
    }

    public JTable getT_enfermas() {
        return t_enfermas;
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

    public JButton getBtn_home() {
        return btn_home;
    }

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public DatePicker getDp_fechaIni() {
        return dp_fechaIni;
    }

    public JButton getBtn_mover() {
        return btn_mover;
    }

    public JTextField getTf_idCria() {
        return tf_idCria;
    }

    public JButton getBtn_actualizar() {
        return btn_actualizar;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        btn_home = new JButton();
        label1 = new JLabel();
        btn_actualizar = new JButton();
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
        btn_mover = new JButton();

        //======== this ========
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
        swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border
        .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067"
        ,java.awt.Font.BOLD,12),java.awt.Color.red), getBorder
        ())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
        .beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException
        ();}});
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {189, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 164, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- btn_home ----
        btn_home.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\home.png"));
        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setFocusable(false);
        add(btn_home, new GridBagConstraints(0, 0, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 0), 0, 50));

        //---- label1 ----
        label1.setText("Cr\u00edas enfermas");
        label1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label1, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- btn_actualizar ----
        btn_actualizar.setFocusable(false);
        btn_actualizar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\reloadIcon.png"));
        btn_actualizar.setPreferredSize(new Dimension(30, 30));
        btn_actualizar.setMaximumSize(new Dimension(30, 30));
        btn_actualizar.setMinimumSize(new Dimension(30, 30));
        add(btn_actualizar, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 8, 0), 0, 0));

        //======== scrollPane1 ========
        {
            scrollPane1.setPreferredSize(new Dimension(500, 300));
            scrollPane1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));

            //---- t_enfermas ----
            t_enfermas.setMinimumSize(new Dimension(300, 200));
            t_enfermas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
            scrollPane1.setViewportView(t_enfermas);
        }
        add(scrollPane1, new GridBagConstraints(0, 2, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 8, 0), 0, 0));

        //---- label5 ----
        label5.setText("Movimientos de corrales");
        label5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label5, new GridBagConstraints(0, 3, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 0), 0, 0));

        //---- label2 ----
        label2.setText("ID Cr\u00eda:");
        label2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label2, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- tf_idCria ----
        tf_idCria.setColumns(10);
        add(tf_idCria, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- btn_buscar ----
        btn_buscar.setMaximumSize(new Dimension(35, 30));
        btn_buscar.setMinimumSize(new Dimension(30, 25));
        btn_buscar.setPreferredSize(new Dimension(35, 26));
        btn_buscar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\searchIcon.png"));
        btn_buscar.setFocusable(false);
        add(btn_buscar, new GridBagConstraints(3, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- label3 ----
        label3.setText("Nuevo corral:");
        label3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label3, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- cb_nvoCorral ----
        cb_nvoCorral.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(cb_nvoCorral, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- label4 ----
        label4.setText("Nueva dieta:");
        label4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label4, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- cb_nvaDieta ----
        cb_nvaDieta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(cb_nvaDieta, new GridBagConstraints(1, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- label7 ----
        label7.setText("Fecha de movimiento:");
        label7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label7, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- dp_fechaMov ----
        dp_fechaMov.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(dp_fechaMov, new GridBagConstraints(1, 7, 4, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- label6 ----
        label6.setText("Inicio de enfermedad:");
        label6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        add(label6, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- dp_fechaIni ----
        dp_fechaIni.setEnabled(false);
        add(dp_fechaIni, new GridBagConstraints(1, 8, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 8, 10), 0, 0));

        //---- btn_mover ----
        btn_mover.setText("Mover");
        btn_mover.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        btn_mover.setFocusable(false);
        add(btn_mover, new GridBagConstraints(0, 9, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 8, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JButton btn_home;
    private JLabel label1;
    private JButton btn_actualizar;
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
    private JButton btn_mover;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
