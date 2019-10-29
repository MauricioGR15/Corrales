package Controllers;

import Support.Routines;
import Models.Modelo;
import Views.viewCrias;
import com.github.lgooddatepicker.components.DatePickerSettings;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class CriasController implements ActionListener, FocusListener, ItemListener, KeyListener{

    private Modelo model;
    private viewCrias view;
    private  Routines rut;
    private String dietas[] = {"DIETA01","DIETA02","DIETA03","DIETA04","DIETA05"};
    private char salud[] = {'S','E','R'};
    private final String expr = "[0-9]{1,9}$";
    private Border original;

    public CriasController(viewCrias view, Modelo model){
        this.model = model;
        this.view = view;
        rut = new Routines();
        hazEscuchadores();
        original = view.getTf_idCria().getBorder();
//        view.getFechaL().setSe;
    }

    public void hazEscuchadores(){
        view.getBtn_registrarCrias().addActionListener(this);

        view.getR_enferma().addActionListener(this);
        view.getR_riesgo().addActionListener(this);
        view.getR_saludable().addActionListener(this);

        view.getTf_idCria().addFocusListener(this);
        view.getTf_noCorral().addFocusListener(this);

        view.getTf_idCria().addKeyListener(this);
        view.getTf_noCorral().addKeyListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent evt) {


//        String date = view.getDp_fechaL().getDate().toString();
//        System.out.println(date);

        if(evt.getSource() == view.getBtn_registrarCrias()){
            if (view.getDp_fechaL().getText().isEmpty()) {
                rut.msgError("No seleccionó una fecha válida");
                return;
            }

            int idTernera = Integer.parseInt(view.getTf_idCria().getText());
            String date = view.getDp_fechaL().getDate().toString();
            char s = salud[checkRadio()];
            int noCorral = Integer.parseInt(view.getTf_noCorral().getText());
            String dieta = dietas();

            try {
                model.insertCrias(idTernera,s,date,noCorral,dieta);
            } catch (SQLException e) {
                e.printStackTrace();
                rut.msgError("Error al insertar");
                view.resetComponents();
                return;
            }

            view.resetComponents();
            rut.msgExito();
        }
    }

    public int checkRadio(){
        if (view.getR_saludable().isSelected()) return 0;
        else if(view.getR_enferma().isSelected()) return 1;
        else return 2;
    }



    public boolean checkComboDietas(){
        return (view.getCb_dieta().getSelectedIndex() == 0);
    }

    public String dietas(){
        int d = view.getCb_dieta().getSelectedIndex();
        switch (d){
            case 0: break;
            case 1: return dietas[0];
            case 2: return dietas[1];
            case 3: return dietas[2];
            case 4: return dietas[3];
        }
        return"";
    }

    @Override
    public void focusGained(FocusEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        aux.selectAll();
    }

    @Override
    public void focusLost(FocusEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        rut.borderCheck(aux, original);

    }

    @Override
    public void itemStateChanged(ItemEvent evt) {
        if(evt.getStateChange()!=ItemEvent.SELECTED)
            return;

    }

    @Override
    public void keyTyped(KeyEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        rut.soundAlert(evt, aux, 10);
        rut.onlyNumbers(evt,aux);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
