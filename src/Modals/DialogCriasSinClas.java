/*
 * Created by JFormDesigner on Tue Oct 29 21:52:26 MST 2019
 */

package Modals;

import Support.Routines;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class DialogCriasSinClas extends JDialog {
    public DialogCriasSinClas() {
        this.setTitle("Crias no clasificadas");
        initComponents();
    }

    public JTable getTabla() {
        return tabla;
    }

    public JButton getBtn_actualizar() {
        return btn_actualizar;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        scrollPane = new JScrollPane();
        tabla = new JTable();
        btn_actualizar = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(30, 60));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPane ========
        {
            scrollPane.setPreferredSize(new Dimension(45, 120));
            scrollPane.setMinimumSize(new Dimension(45, 100));
            scrollPane.setViewportView(tabla);
        }
        contentPane.add(scrollPane, BorderLayout.CENTER);

        //---- btn_actualizar ----
        btn_actualizar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\reloadIcon.png"));
        btn_actualizar.setMinimumSize(new Dimension(40, 30));
        btn_actualizar.setPreferredSize(new Dimension(40, 30));
        contentPane.add(btn_actualizar, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JScrollPane scrollPane;
    private JTable tabla;
    private JButton btn_actualizar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
