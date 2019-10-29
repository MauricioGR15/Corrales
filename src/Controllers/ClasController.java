package Controllers;

import Models.Modelo;
import Support.Routines;
import Views.viewClasificaciones;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        JButton btn = (JButton)evt.getSource();

        if(btn == view.getBtn_buscar()){
            onClicBuscar();
            return;
        }
        if(btn == view.getBtn_clasificar()){
            onClicClasificar();
        }


    }

    private  void onClicClasificar(){
        short peso = Short.parseShort(view.getTf_peso().getText());
        short cantGrasa = Short.parseShort(view.getTf_cantGra().getText());
        if(!checkComboColor()){
            return;
        }
        String colorM = (String) view.getCb_colorMusc().getSelectedItem();
        int grasaC = (int) view.getSpinnerGraCob().getValue();
        int criaID = Integer.parseInt(view.getTf_idCria().getText());

        try {
            model.sp_clasificacion(criaID,peso,colorM,cantGrasa,(short)grasaC);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        rut.msgExito();

        System.out.println(peso +"\t" + cantGrasa +"\t" + colorM + "\t" + grasaC);

    }

    private void onClicBuscar(){
        ResultSet rs = null;
        int idCria = Integer.parseInt(view.getTf_idCria().getText());
        try {
            rs = model.sp_selectCria(idCria);
            if(rs.next()){
                int cria_id = rs.getInt("cria_id");
                int corral_no = rs.getInt("corral_no");
                String cria_salud = rs.getString("cria_salud");
                System.out.println(cria_id + "......" + corral_no + "......" + cria_salud);

                view.getTf_corral().setText(corral_no + "");
                view.getTf_salud().setText(salud(cria_salud));
            }
            else
                rut.msgError("Este ID no ha sido registrado");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean checkComboColor(){
        if(view.getCb_colorMusc().getSelectedIndex() == 0){
            rut.msgError("Seleccione una opcion válida en color de músculo");
            return false;
        }
        return true;
    }

    private String salud(String c){
        if(c.equals("S"))
            return "Saludable";
        else if(c.equals("R"))
            return "En riesgo";
        else
            return "Enferma";
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
