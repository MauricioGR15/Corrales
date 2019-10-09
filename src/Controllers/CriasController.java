package Controllers;

import Models.Modelo;
import Views.viewCrias;

import java.awt.event.*;

public class CriasController implements ActionListener, FocusListener, ItemListener {

    Modelo model;
    viewCrias view;

    public CriasController(viewCrias view, Modelo model){
        this.model = model;
        this.view = view;
        hazEscuchadores();
    }

    public void hazEscuchadores(){
        view.getBtn_registrarCrias().addActionListener(this);

        view.getCb_fechaL_day().addItemListener(this);
        view.getCb_fechaL_month().addItemListener(this);
        view.getCb_fechaL_year().addItemListener(this);

        view.getR_enferma().addActionListener(this);
        view.getR_riesgo().addActionListener(this);
        view.getR_saludable().addActionListener(this);


        view.getTf_idCria().addFocusListener(this);

    }






    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Si entra");
    }

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Entra");
    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent evt) {
        if(evt.getStateChange()!=ItemEvent.SELECTED)
            return;
        if(evt.getSource() == view.getCb_fechaL_month()){
            view.cbDays();
            return;
        }


    }
}
