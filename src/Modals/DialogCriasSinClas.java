/*
 * Created by JFormDesigner on Tue Oct 29 21:52:26 MST 2019
 */

package Modals;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class DialogCriasSinClas extends JDialog {
    public DialogCriasSinClas() {
        initComponents();
        this.setTitle("Crias no clasificadas");
    }

    public JTable getTabla() {
        return tabla;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane = new JScrollPane();
        tabla = new JTable();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPane ========
        {
            scrollPane.setPreferredSize(new Dimension(30, 200));
            scrollPane.setViewportView(tabla);
        }
        contentPane.add(scrollPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane;
    private JTable tabla;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
