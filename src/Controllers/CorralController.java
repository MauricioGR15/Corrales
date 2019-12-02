package Controllers;

import Support.Rut;
import Models.Modelo;
import Views.viewCorrales;
import Views.viewPrincipal;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CorralController implements ActionListener, FocusListener, ItemListener, KeyListener{

    private viewCorrales view;
    private Modelo model;
    private Rut rut;
    private Border original;
    private final String columnas [] = {"No Corral", "Tipo"};

    public CorralController(viewCorrales view, Modelo model){
        this.view = view;
        this.model = model;
        rut = new Rut();
        hazEscuchadores();
        llenarTabla();
        original = view.getTf_noCorral().getBorder();
    }

    public void hazEscuchadores(){
        view.getTf_noCorral().addFocusListener(this);
        view.getCb_type().addItemListener(this);
        view.getBtn_regCorral().addActionListener(this);
        view.getBtn_home().addActionListener(this);

        view.getTf_noCorral().addKeyListener(this);
    }

    private void llenarTabla(){
        DefaultTableModel tableModel = new DefaultTableModel(null,columnas);
        String registros[] = new String[columnas.length];
        try {
            ResultSet rs = model.select_corrales();
            while(rs.next()){
                registros[0] = rs.getInt(1) + "";
                registros[1] = (rs.getInt(2)) == 1?"Saludable":"Enfermas";
                tableModel.addRow(registros);
            }
            view.getT_corrales().setModel(tableModel);
        }catch (SQLException e){}
    }


    @Override
    public void actionPerformed(ActionEvent evt) {

        if(evt.getSource() == view.getBtn_home()){
            Rut.goPanel(viewPrincipal.parent, view.getViewP());
        }

        if(view.getTf_noCorral().getText().isEmpty() ){
            rut.msgError("Hay campos vacíos");
            return;
        }

        if(evt.getSource() == view.getBtn_regCorral()){
            int idCorral = Integer.parseInt(view.getTf_noCorral().getText());

            if(view.getCb_type().getSelectedIndex() == 0){
                rut.msgError("Seleccione una opcion válida en tipo de corral");
                return;
            }

            boolean t = checkType();
            int res;
            try {
                ResultSet rs = model.pa_insertCorrales(idCorral,t);
                rs.next();
                res = rs.getInt(1);
                view.getMessage(res);
                llenarTabla();
            } catch (SQLException e) { }
            finally {
                view.resetComponents();
            }

        }
    }

    private boolean checkType(){
            if(view.getCb_type().getSelectedItem() == "Saludables")
               return true;
            else
                return false;
    }

    @Override
    public void focusGained(FocusEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        aux.selectAll();
    }

    @Override
    public void focusLost(FocusEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        rut.borderCheck(aux,original);
    }

    @Override
    public void itemStateChanged(ItemEvent evt) {
        if(evt.getStateChange()!=ItemEvent.SELECTED)
            return;
    }

    @Override
    public void keyTyped(KeyEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        if(aux == view.getTf_noCorral()){
           rut.soundAlert(evt,aux,10);
           rut.onlyNumbers(evt,aux);
        }
        else {
            rut.soundAlert(evt, aux, 5);
            rut.onlyNumbers(evt, aux);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
