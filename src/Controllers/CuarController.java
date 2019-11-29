package Controllers;

import Models.Modelo;
import Support.Routines;
import Views.viewCuarentenas;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;

public class CuarController implements ActionListener, KeyListener, FocusListener {

    private viewCuarentenas view;
    private Modelo model;
    private Border original;

    public CuarController(viewCuarentenas pnl_tratamientos, Modelo model) {
        this.view = pnl_tratamientos;
        this.model = model;
        original = view.getTf_idCria().getBorder();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }





    @Override
    public void focusGained(FocusEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        aux.selectAll();
    }

    @Override
    public void focusLost(FocusEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        Routines.borderCheck(aux, original);

    }

    @Override
    public void keyTyped(KeyEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        Routines.soundAlert(evt, aux, 10);
        Routines.onlyNumbers(evt,aux);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
