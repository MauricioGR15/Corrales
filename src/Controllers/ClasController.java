package Controllers;

import Models.Modelo;
import Support.Rut;
import Views.MainFrame;
import Views.viewClasificaciones;
import Views.viewPrincipal;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClasController implements ActionListener, FocusListener, ItemListener, KeyListener, ChangeListener {

    private Modelo model;
    private viewClasificaciones view;
    private Border original;
    private String[] columnas = {"ID Cria"};

    public ClasController(viewClasificaciones view, Modelo model){
        this.model = model;
        this.view = view;
        hazEscuchadores();
        original = view.getTf_idCria().getBorder();
    }


    private void hazEscuchadores(){
        view.getBtn_buscar().addActionListener(this);
        view.getBtn_clasificar().addActionListener(this);
        view.getBtn_sinClas().addActionListener(this);
        view.getDialog().getBtn_actualizar().addActionListener(this);
        view.getBtn_home().addActionListener(this);

        view.getTf_idCria().addKeyListener(this);

        view.getSld_grasa().addChangeListener(this);
        view.getSld_peso().addChangeListener(this);

        view.getTf_idCria().addFocusListener(this);

        view.getCb_colorMusc().addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        JButton btn = (JButton) evt.getSource();
        if(btn == view.getDialog().getBtn_actualizar()){
            onClicSinClas();
            return;
        }

        if (btn == view.getBtn_buscar()) {
            onClicBuscar();
            return;
        }
        if (btn == view.getBtn_clasificar()) {
            onClicClasificar();
            return;
        }
        if (btn == view.getBtn_sinClas()) {
            onClicSinClas();
            return;
        }
        if (btn == view.getBtn_home()){
            Rut.goPanel(viewPrincipal.parent,view.getViewP());
            return;
        }


    }

    private void onClicSinClas(){
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
        try{
            ResultSet rs = model.select_CriasNoClasificadas();
            String [] registros = new String[columnas.length];
            while ((rs.next())){
                registros[0] = rs.getInt("cria_id")+"";
                dtm.addRow(registros);
            }
            view.getDialog().getTabla().setModel(dtm);
            view.getDialog().setVisible(true);
        }catch (SQLException e){
        }
    }

    private  void onClicClasificar(){
        short peso = (short) view.getSld_peso().getValue();
        short cantGrasa = (short) view.getSld_grasa().getValue();
        if(!checkComboColor()){
            return;
        }
        String colorM = (String) view.getCb_colorMusc().getSelectedItem();
        int grasaC = (int) view.getSpinnerGraCob().getValue();
        int criaID = Integer.parseInt(view.getTf_idCria().getText());
        int res = 0;
        try {
            ResultSet rs = model.pa_insertClasificaciones(criaID,peso,colorM,cantGrasa,(short)grasaC,probSV());
            rs.next();
            res = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            view.getMessage(res);
        }

        view.resetComponents();
        view.getTf_idCria().requestFocus();
    }

    private void onClicBuscar(){

        ResultSet rs;
        int idCria = Integer.parseInt(view.getTf_idCria().getText());
        try {
            rs = model.select_CriasSinClas(idCria);
            if(rs.next()){
//                int cria_id = rs.getInt("cria_id");
                int corral_no = rs.getInt("corral_no");
                String cria_salud = rs.getString("cria_salud");

                view.getTf_corral().setText(corral_no + "");
                view.getTf_salud().setText(cria_salud);
            }
            else
                Rut.msgError("Este ID no ha sido registrado");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    private boolean checkComboColor(){
        if(view.getCb_colorMusc().getSelectedIndex() == 0){
            Rut.msgError("Seleccione una opcion válida en color de músculo");
            return false;
        }
        return true;
    }

    private int probSV(){
        double ran = Math.random();
        if(ran <=0.025) //Mala
            return 1;
        else if (ran >0.025 && ran <= 0.70) //Buena
            return 2;
        else
            return 3;   //Excelente
    }

    @Override
    public void focusGained(FocusEvent evt) {
        JTextField aux = (JTextField)evt.getSource();
        aux.selectAll();
    }

    @Override
    public void focusLost(FocusEvent evt) {
        JTextField aux = (JTextField)evt.getSource();
        Rut.borderCheck(aux,original);
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
            Rut.soundAlert(evt, aux, 10);
            Rut.onlyNumbers(evt,aux);
        }
        else{
            Rut.soundAlert(evt,aux,5);
            Rut.onlyNumbers(evt,aux);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent evt) {
        if(evt.getSource() == view.getSld_peso()){
            view.getLbl_peso().setText(view.getSld_peso().getValue() + "");
            return;
        }

        else{
            view.getLbl_grasa().setText(view.getSld_grasa().getValue()+ "");
        }


    }
}
