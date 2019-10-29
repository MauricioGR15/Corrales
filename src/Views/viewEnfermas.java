/*
 * Created by JFormDesigner on Mon Oct 28 22:49:42 MST 2019
 */

package Views;

import java.awt.*;
import javax.swing.*;

public class viewEnfermas extends JPanel {
    public viewEnfermas() {
        initComponents();
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label2 = new JLabel();
        scrollPane = new JScrollPane();
        t_enfermas = new JTable();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label2 ----
        label2.setText("Crias enfermas y en riesgo");
        add(label2, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== scrollPane ========
        {
            scrollPane.setMinimumSize(new Dimension(400, 300));

            //---- t_enfermas ----
            t_enfermas.setMinimumSize(new Dimension(150, 150));
            t_enfermas.setPreferredSize(new Dimension(300, 300));
            t_enfermas.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            scrollPane.setViewportView(t_enfermas);
        }
        add(scrollPane, new GridBagConstraints(0, 1, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label2;
    private JScrollPane scrollPane;
    private JTable t_enfermas;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JTable getT_enfermas() {
        return t_enfermas;
    }
}
