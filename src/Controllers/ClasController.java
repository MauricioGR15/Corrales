package Controllers;

import Models.Modelo;
import Support.Routines;
import Views.viewClasificaciones;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class ClasController implements ActionListener, FocusListener, ItemListener, KeyListener{

    private final String expr = "[0-9]{1,9}$";
    private Modelo model;
    private viewClasificaciones view;
    private Routines rut;
    private Border original;

    public ClasController(viewClasificaciones view, Modelo model){
        this.model = model;
        this.view = view;
        rut = new Routines();
        hazEscuchadores();
        original = view.getTf_idCria().getBorder();
    }


    private void hazEscuchadores(){
        view.getBtn_buscar().addActionListener(this);
        view.getBtn_clasificar().addActionListener(this);
        view.getBtn_sinClas().addActionListener(this);

        view.getTf_idCria().addKeyListener(this);
        view.getTf_cantGra().addKeyListener(this);
        view.getTf_peso().addKeyListener(this);

        view.getTf_idCria().addFocusListener(this);
        view.getTf_cantGra().addFocusListener(this);
        view.getTf_peso().addFocusListener(this);

        view.getCb_colorMusc().addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {

    }

    @Override
    public void focusGained(FocusEvent evt) {
        JTextField aux = (JTextField)evt.getSource();
        aux.selectAll();
    }

    @Override
    public void focusLost(FocusEvent evt) {
        JTextField aux = (JTextField)evt.getSource();
        rut.borderCheck(aux,original);
    }

    @Override
    public void itemStateChanged(ItemEvent evt) {
        if(evt.getStateChange()!=ItemEvent.SELECTED)
            return;
    }

    @Override
    public void keyTyped(KeyEvent evt) {
        JTextField aux =(JTextField) evt.getSource();
        if(aux == view.getTf_idCria()) {
            rut.soundAlert(evt, aux, 10);
            rut.onlyNumbers(evt,aux);
        }
        else{
            rut.soundAlert(evt,aux,5);
            rut.onlyNumbers(evt,aux);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
