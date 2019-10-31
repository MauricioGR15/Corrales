package Controllers;

import Modals.DialogCrias;
import Support.Routines;
import Models.Modelo;
import Views.viewCrias;
import com.github.lgooddatepicker.components.DatePickerSettings;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CriasController implements ActionListener, FocusListener, ItemListener, KeyListener{

    private Modelo model;
    private viewCrias view;
    private  Routines rut;
    private final String columnas[] = {"ID Cria","Llegada","Salida","Salud","No Corral","ID Dieta"};
    private char salud[] = {'S','E'};
    private Border original;

    public CriasController(viewCrias view, Modelo model){
        this.model = model;
        this.view = view;
        rut = new Routines();
        hazEscuchadores();
        llenarDietas();
        original = view.getTf_idCria().getBorder();
    }

    public void hazEscuchadores(){
        view.getBtn_registrarCrias().addActionListener(this);
        view.getBtn_consultar().addActionListener(this);

        view.getR_enferma().addActionListener(this);
        view.getR_saludable().addActionListener(this);

        view.getTf_idCria().addFocusListener(this);
        view.getTf_noCorral().addFocusListener(this);

        view.getTf_idCria().addKeyListener(this);
        view.getTf_noCorral().addKeyListener(this);

    }

    public void llenarDietas(){
        view.getCb_dieta().addItem("Seleccione");
        try {
            ResultSet rs = model.select_dietas();
            while(rs.next()){
                view.getCb_dieta().addItem(rs.getString("dieta_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent evt) {
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
                registros[2] = rut.procesada(rs.getString("cria_fechaS"));
                registros[3] = rut.convertSalud(rs.getString("cria_salud").charAt(0));
                registros[4] = rs.getInt("corral_no")+"";
                registros[5] = rs.getString("dieta_id");
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

            if(view.getCb_dieta().getSelectedIndex()==0){
                rut.msgError("Seleccione una dieta");
                return;
            }

            int idTernera = Integer.parseInt(view.getTf_idCria().getText());
            String date = view.getDp_fechaL().getDate().toString();
            char s = salud[checkRadio()];
            int noCorral = Integer.parseInt(view.getTf_noCorral().getText());
            String dieta = view.getCb_dieta().getSelectedItem().toString();

            try {
                if(!checkCorral(noCorral)){
                    rut.msgError("Una cría enferma no puede estar en un corral de crías sanas");
                    return;
                }
                model.insertCrias(idTernera,s,date,noCorral,dieta);
                model.sp_insertMovimientos(idTernera,noCorral,date);
            } catch (SQLException e) {
                e.printStackTrace();
                rut.msgError("Error al insertar");
                view.resetComponents();
                return;
            }

            view.resetComponents();
            rut.msgExito();
    }


    public boolean checkCorral(int corralNo) throws SQLException {
        ResultSet rs = model.sp_select_noCorral(corralNo);
        if(rs.next()){
            boolean b = rs.getBoolean("corral_tipo");
            if(b && view.getR_saludable().isSelected())
                return true;
            else if(!b && view.getR_enferma().isSelected())
                return true;
        }
        return false;
    }

    public int checkRadio(){
        if (view.getR_saludable().isSelected()) return 0;
        else return 1;
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
