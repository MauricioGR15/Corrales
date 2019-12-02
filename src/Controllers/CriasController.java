package Controllers;

import Support.Rut;
import Models.Modelo;
import Views.viewCrias;
import Views.viewPrincipal;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CriasController implements ActionListener, FocusListener, ItemListener, KeyListener{

    private Modelo model;
    private viewCrias view;
    private Rut rut;
    private final String columnas[] = {"ID Cria","Llegada","Salud","No. Corral"};
    private Border original;
    private boolean health = true;

    public CriasController(viewCrias view, Modelo model){
        this.model = model;
        this.view = view;
        rut = new Rut();
        hazEscuchadores();
        llenarCorrales();
        llenarDietas();
        original = view.getTf_idCria().getBorder();
    }

    public void hazEscuchadores(){
        view.getBtn_registrarCrias().addActionListener(this);
        view.getBtn_home().addActionListener(this);
        view.getBtn_consultar().addActionListener(this);
        view.getDialogCrias().getBtn_actualizar().addActionListener(this);

        view.getR_enferma().addActionListener(this);
        view.getR_saludable().addActionListener(this);

        view.getTf_idCria().addFocusListener(this);

        view.getTf_idCria().addKeyListener(this);
    }

    private void llenarDietas(){
        view.getCb_dieta().removeAllItems();
        view.getCb_dieta().addItem("--Seleccione--");
        try {
            ResultSet rs;
            if(!health)
                rs = model.select_dietasEspeciales();
            else
                rs = model.select_dietasNormales();

            while(rs.next()){
                view.getCb_dieta().addItem(rs.getString("dieta_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void llenarCorrales(){
        view.getCb_corrales().removeAllItems();
        view.getCb_corrales().addItem("--Seleccione--");
        try {
            ResultSet rs;
            if(health)
                rs = model.select_corralesSanos();
            else
                rs = model.select_corralesNoSanos();

            while (rs.next())
                view.getCb_corrales().addItem(rs.getInt(1)+"");
        }catch (SQLException e){

        }
    }



    @Override
    public void actionPerformed(ActionEvent evt) {

        if(evt.getSource() == view.getBtn_home()){
            Rut.goPanel(viewPrincipal.parent, view.getViewP());
        }

        if(evt.getSource() == view.getDialogCrias().getBtn_actualizar()){
            onClicConsultar();
            return;
        }

        if(evt.getSource() instanceof JRadioButton){
            if(view.getR_enferma().isSelected())
                health = false;
            else
                health = true;
            llenarCorrales();
            llenarDietas();
            return;
        }

        if(evt.getSource() == view.getBtn_registrarCrias()) {
            onClicRegistrar();
            return;
        }
        if(evt.getSource() == view.getBtn_consultar()){
            onClicConsultar();
        }
    }

    public void onClicConsultar(){
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
        String [] registros = new String [columnas.length];

        try {
            ResultSet rs = model.select_VistaCrias();
            while(rs.next()){
                registros[0] = rs.getInt("cria_id") + "";
                registros[1] = rs.getString("cria_fechaL");
                registros[2] = rs.getString("cria_salud");
                registros[3] = rs.getInt("corral_no") + "";
                dtm.addRow(registros);
            }
            view.getDialogCrias().getT_crias().setModel(dtm);
            view.getDialogCrias().setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void onClicRegistrar(){
        if (view.getDp_fechaL().getText().isEmpty()) {
            rut.msgError("No seleccionó una fecha válida");
            return;
        }

        if(view.getCb_corrales().getSelectedIndex()==0){
            rut.msgError("Seleccione un corral");
            return;
        }

        if(view.getCb_dieta().getSelectedIndex()==0){
            rut.msgError("Seleccione una dieta");
            return;
        }

        int idTernera = Integer.parseInt(view.getTf_idCria().getText());
        String date = view.getDp_fechaL().getDate().toString();
        boolean salud = health;
        int noCorral = Integer.parseInt(view.getCb_corrales().getSelectedItem().toString());
        String dieta = view.getCb_dieta().getSelectedItem().toString();
        int res = 0;

        try {
            ResultSet rs = model.pa_insertCrias(idTernera,date,salud,noCorral,dieta);
            if(rs.next()) {
                res = rs.getInt(1);
                System.out.println("Result set: " + res);
            }
        } catch (SQLException e) {
            
        } finally {
            view.getMessage(res);
            view.resetComponents();
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
