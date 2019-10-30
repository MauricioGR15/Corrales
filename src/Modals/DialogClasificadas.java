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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane = new JScrollPane();
        table = new JTable();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPane ========
        {
            scrollPane.setPreferredSize(new Dimension(350, 400));
            scrollPane.setViewportView(table);
        }
        contentPane.add(scrollPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane;
    private JTable table;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
