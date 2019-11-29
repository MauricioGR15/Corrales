package Controllers;

import Models.Modelo;
import Support.Routines;
import Views.viewProcesar;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcesarController implements ActionListener, KeyListener, FocusListener {

    private String[] columnas = {"ID Cria","Llegada","Grasa cob","Salud"};
    private Modelo model;
    private viewProcesar view;
    private Routines rut;
    private Border original;

    public ProcesarController(viewProcesar view, Modelo model){
        this.model = model;
        this.view = view;
        rut = new Routines();
        hazEscuchadores();
        original = view.getTf_idCria().getBorder();
    }

    private void hazEscuchadores(){
        view.getTf_idCria().addFocusListener(this);
        view.getTf_idCria().addKeyListener(this);

        view.getBtn_Buscar().addActionListener(this);
        view.getBtn_procesar().addActionListener(this);
        view.getBtn_clas().addActionListener(this);
        view.getBtn_clas().addActionListener(this);
        view.getClasificadas().getBtn_actualizar().addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent evt) {

        JButton button = (JButton)evt.getSource();

        if(button == view.getClasificadas().getBtn_actualizar()){
            onClicClasificadas();
            return;
        }

        if(view.getTf_idCria().getText().isEmpty()) {
            rut.msgError("El ID de cría está vacío");
            return;
        }

        if(button == view.getBtn_Buscar()){
            onClicBuscar();
        }
        if(button == view.getBtn_procesar()){
            if(view.getDp_fechaS().getText().isEmpty()){
                rut.msgError("Seleccione una fecha válida");
                return;
            }
            onClicProcesar();
            return;
        }

        if(button == view.getBtn_sacrificar()){
            if(view.getDp_fechaS().getText().isEmpty()){
                rut.msgError("Seleccione una fecha válida");
                return;
            }
            onClicSacrificar();
            return;
        }

        if(button == view.getBtn_clas()){
            onClicClasificadas();
            return;
        }
    }

    private void onClicClasificadas(){
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
        String registros [] = new String[columnas.length];
        try{
            ResultSet rs = model.selectVistaCriasClasificadasSinProcesar();
            while(rs.next()){
                registros[0] = rs.getInt("cria_id")+"";
                registros[1] = rs.getString("cria_fechaL");
                registros[2] = rs.getInt("clas_grasCobertura")+"";
                registros[3] = rs.getString("cria_salud");
                dtm.addRow(registros);
            }
            view.getClasificadas().getTable().setModel(dtm);
            view.getClasificadas().setVisible(true);
        }catch (SQLException e){
            rut.msgError(e.getMessage());
        }
    }

    private void onClicProcesar(){
        int idCria = Integer.parseInt(view.getTf_idCria().getText());
        String fechaS = view.getDp_fechaS().getDate().toString();
        int res = 0;
        try{
            System.out.println(fechaS);
            ResultSet rs = model.pa_procesarCria(idCria,fechaS);
            rs.next();
            res = rs.getInt(1);
        }catch (SQLException e){
        }
        finally {
            view.getMessageProcesar(res);
        }
    }

    private void onClicSacrificar(){
        int idCria = Integer.parseInt(view.getTf_idCria().getText());
        String fechaS = view.getDp_fechaS().getDate().toString();
        int res = 0;
        try{
            ResultSet rs = model.pa_sacrificarCria(idCria,fechaS);
            rs.next();
            res = rs.getInt(1);
        } catch (SQLException e) { }
        finally{
            view.getMessageSacrificar(res);
        }
    }

    private void onClicBuscar(){
        ResultSet rs;
        int idCria = Integer.parseInt(view.getTf_idCria().getText());

        try{
            rs = model.pa_selectCriasClasificadas(idCria);
            if(rs.next()){
                int corralNo = rs.getInt("corral_no");
                String cria_fechaL = rs.getString("cria_fechaL");
                String cria_salud = rs.getString("cria_salud");
                int clas_grasaCob = rs.getInt("clas_grasCobertura");

                view.getTf_fechaL().setText(cria_fechaL);
                view.getTf_noCorral().setText(corralNo+"");
                view.getTf_salud().setText(cria_salud);
                view.getTf_grasaCob().setText(clas_grasaCob+"");
            }
            else
                rut.msgError("Este ID no ha sido registrado o no está clasificado");
        }catch(SQLException e){
            rut.msgError(e.getMessage());
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
