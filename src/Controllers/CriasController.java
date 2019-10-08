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

        view.getCb_colorM().addItemListener(this);
        view.getCb_grasaC().addItemListener(this);
        view.getCb_fechaS_day().addItemListener(this);
        view.getCb_fechaS_month().addItemListener(this);
        view.getCb_fechaS_year().addItemListener(this);

        view.getR_enferma().addActionListener(this);
        view.getR_riesgo().addActionListener(this);
        view.getR_saludable().addActionListener(this);

        view.getTf_cantG().addFocusListener(this);
        view.getTf_idCria().addFocusListener(this);
        view.getTf_peso().addFocusListener(this);
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
    public void itemStateChanged(ItemEvent e) {

    }
}
