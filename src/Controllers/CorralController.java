package Controllers;

import App.Routines;
import Models.Modelo;
import Views.viewCorrales;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.regex.Pattern;

import static App.Routines.*;

public class CorralController implements ActionListener, FocusListener, ItemListener, KeyListener{

    private viewCorrales view;
    private Modelo model;
    private Routines rut;
    private byte type;
    private final String []EXPRESIONES = new String[]{"[0-9]{1,9}$","[0-9]{1,5}$"};
    private int expr = 0;
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
    }


    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == view.getBtn_regCorral()){
            int idCorral = Integer.parseInt(view.getTf_noCorral().getText());
            int cap = Integer.parseInt(view.getTf_capacity().getText());
            if(checkType()){
                byte t = type;
                try {
                    model.sp_corrales(idCorral,t,cap);
                } catch (SQLException e) {
                    rut.msgError("Error al insertar");
                    e.printStackTrace();
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

        if(aux == view.getTf_capacity())
            expr = 1;
        else
            expr = 0;

        if(aux.getText().isEmpty() || !rut.verifyExpression(aux.getText(),EXPRESIONES[expr])
                || (aux == view.getTf_capacity() && aux.getText().length() > 5
                || aux == view.getTf_noCorral() && aux.getText().length() > 10)){
            aux.setBorder(BorderFactory.createLineBorder(Color.red));
            aux.requestFocus();
            return;
        }
        else{
            aux.setBorder(original);
            aux.transferFocus();
        }
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
           return;
        }
        if(aux == view.getTf_capacity())
            rut.soundAlert(evt,aux,5);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
