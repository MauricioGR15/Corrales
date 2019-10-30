package Controllers;

import Support.Routines;
import Models.Modelo;
import Views.viewCorrales;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.sql.SQLException;

public class CorralController implements ActionListener, FocusListener, ItemListener, KeyListener{

    private viewCorrales view;
    private Modelo model;
    private Routines rut;
    private byte type;
    private Border original;

    public CorralController(viewCorrales view, Modelo model){
        this.view = view;
        this.model = model;
        rut = new Routines();
        hazEscuchadores();
        original = view.getTf_capacity().getBorder();
    }

    public void hazEscuchadores(){
        view.getTf_capacity().addFocusListener(this);
        view.getTf_noCorral().addFocusListener(this);
        view.getCb_type().addItemListener(this);
        view.getBtn_regCorral().addActionListener(this);

        view.getTf_noCorral().addKeyListener(this);
        view.getTf_capacity().addKeyListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent evt) {

        if(view.getTf_noCorral().getText().isEmpty() || view.getTf_capacity().getText().isEmpty()){
            rut.msgError("Hay campos vacíos");
            return;
        }

        if(evt.getSource() == view.getBtn_regCorral()){
            int idCorral = Integer.parseInt(view.getTf_noCorral().getText());
            int cap = Integer.parseInt(view.getTf_capacity().getText());
            if(checkType()){
                byte t = type;
                try {
                    model.sp_insertCorrales(idCorral,t,cap);
                } catch (SQLException e) {
                    rut.msgError("El corral con ID '" + idCorral  + "' ya existe");
                    view.resetComponents();
                    return;
                }
                view.resetComponents();
                rut.msgExito();
            }
        }
    }

    private boolean checkType(){
        if(view.getCb_type().getSelectedIndex() == 0){
            rut.msgError("Seleccione una opcion válida en tipo de corral");
            return false;
        }
        else{
            if(view.getCb_type().getSelectedItem() == "Saludables")
                type = 1;
            else
                type = 0;
            return true;
        }
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
