/*
 * Created by JFormDesigner on Tue Oct 29 20:31:12 MST 2019
 */

package Modals;

import Support.Routines;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.RowSorter.SortKey;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

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

    public JButton getBtn_actualizar() {
        return btn_actualizar;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mauricio
        scrollPane = new JScrollPane();
        t_crias = new JTable();
        btn_actualizar = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(200, 200));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPane ========
        {
            scrollPane.setMinimumSize(new Dimension(350, 300));
            scrollPane.setPreferredSize(new Dimension(375, 300));

            //---- t_crias ----
            t_crias.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            scrollPane.setViewportView(t_crias);
        }
        contentPane.add(scrollPane, BorderLayout.CENTER);

        //---- btn_actualizar ----
        btn_actualizar.setMinimumSize(new Dimension(40, 30));
        btn_actualizar.setPreferredSize(new Dimension(40, 30));
        btn_actualizar.setIcon(new ImageIcon("C:\\Git\\Corrales\\Imgs\\reloadIcon.png"));
        contentPane.add(btn_actualizar, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mauricio
    private JScrollPane scrollPane;
    private JTable t_crias;
    private JButton btn_actualizar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
