package Controllers;

import Models.Modelo;
import Views.viewCorrales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class CorralController implements ActionListener, FocusListener, ItemListener{

    viewCorrales view;
    Modelo model;
    byte type;
    final String expresion = "[d]{9}";

    public CorralController(viewCorrales view, Modelo model){
        this.view = view;
        this.model = model;
        hazEscuchadores();
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
            }
        }
    }

    private boolean checkType(){
        if(view.getCb_type().getSelectedIndex() == 0){
            view.msgCombo();
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
        if(aux.getText().isEmpty()){
            aux.setBorder(BorderFactory.createLineBorder(Color.red));
            aux.requestFocus();
            return;
        }
        if(verifyExpression(aux.getText())){
            aux.transferFocus();
        }

    }

    public boolean verifyExpression(String cadena){
        Pattern pat = Pattern.compile(expresion);
        return pat.matcher(cadena).find();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("Cambio");
    }
}
