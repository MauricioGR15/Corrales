/*
 * Created by JFormDesigner on Tue Oct 29 22:10:20 MST 2019
 */

package Modals;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class DialogClasificadas extends JDialog {
    public DialogClasificadas() {
        initComponents();
        this.setTitle("Crias clasificadas sin procesar");
    }

    public JTable getTable() {
        return table;
    }

    public JButton getBtn_actualizar() {
        return btn_actualizar;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        scrollPane = new JScrollPane();
        table = new JTable();
        btn_actualizar = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(30, 40));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPane ========
        {
            scrollPane.setPreferredSize(new Dimension(275, 200));
            scrollPane.setMinimumSize(new Dimension(275, 200));
            scrollPane.setViewportView(table);
        }
        contentPane.add(scrollPane, BorderLayout.CENTER);

        //---- btn_actualizar ----
        btn_actualizar.setMaximumSize(new Dimension(40, 30));
        btn_actualizar.setMinimumSize(new Dimension(40, 30));
        btn_actualizar.setPreferredSize(new Dimension(40, 30));
        btn_actualizar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\reloadIcon.png"));
        btn_actualizar.setSelectedIcon(null);
        contentPane.add(btn_actualizar, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JScrollPane scrollPane;
    private JTable table;
    private JButton btn_actualizar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
