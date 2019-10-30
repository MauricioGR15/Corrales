/*
 * Created by JFormDesigner on Tue Oct 29 20:31:12 MST 2019
 */

package Modals;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class DialogCrias extends JDialog {
    public DialogCrias() {
        initComponents();
        this.setTitle("Crias");
    }


    public JTable getT_crias() {
        return t_crias;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane = new JScrollPane();
        t_crias = new JTable();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPane ========
        {
            scrollPane.setMinimumSize(new Dimension(500, 300));
            scrollPane.setPreferredSize(new Dimension(550, 300));

            //---- t_crias ----
            t_crias.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            scrollPane.setViewportView(t_crias);
        }
        contentPane.add(scrollPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane;
    private JTable t_crias;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
