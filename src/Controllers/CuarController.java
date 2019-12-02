package Controllers;

import Models.Modelo;
import Support.Rut;
import Views.viewCuarentenas;
import Views.viewPrincipal;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CuarController implements ActionListener, KeyListener, FocusListener {

    private String columnas[] = {"Cría ID", "Corral No.", "Dias enferma"};
    private viewCuarentenas view;
    private Modelo model;
    private Border original;
    private boolean flag = false;
    private boolean saludCria;

    public CuarController(viewCuarentenas pnl_tratamientos, Modelo model) {
        this.view = pnl_tratamientos;
        this.model = model;
        original = view.getTf_idCria().getBorder();
        hazEscuchadores();
        fillCombos(true);
        fillTable();
    }

    public void hazEscuchadores(){
        view.getBtn_home().addActionListener(this);
        view.getBtn_mover().addActionListener(this);
        view.getBtn_buscar().addActionListener(this);
        view.getBtn_actualizar().addActionListener(this);

        view.getTf_idCria().addKeyListener(this);
        view.getTf_idCria().addFocusListener(this);
    }

    public void fillCombos(boolean salud){
        ResultSet corrales;
        ResultSet dietas;
        view.getCb_nvoCorral().removeAllItems();
        view.getCb_nvaDieta().removeAllItems();
        view.getCb_nvaDieta().addItem("--Seleccione--");
        view.getCb_nvoCorral().addItem("--Seleccione");
        if(!flag){
            return;
        }
        else{
            try{
                if(!salud){
                    corrales = model.select_corralesSanos();
                    while (corrales.next())
                        view.getCb_nvoCorral().addItem(corrales.getInt(1)+"");
                    dietas = model.select_dietasNormales();
                    while (dietas.next())
                        view.getCb_nvaDieta().addItem(dietas.getString(1));

                }
                else{
                    corrales = model.select_corralesNoSanos();
                    while (corrales.next())
                        view.getCb_nvoCorral().addItem(corrales.getInt(1)+"");
                    dietas = model.select_dietasEspeciales();
                    while (dietas.next())
                        view.getCb_nvaDieta().addItem(dietas.getString(1));

                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }

    }


    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == view.getBtn_actualizar()){
            fillTable();
            return;
        }

        if(evt.getSource() == view.getBtn_home()){
            Rut.goPanel(viewPrincipal.parent, view.getViewP());
            return;
        }

        if(evt.getSource() == view.getBtn_buscar()){
            if(view.getTf_idCria().getText().isEmpty()){
                Rut.msgError("El campo Cría ID está vacío");
                return;
            }
            onClicVerifica();
            return;
        }

        if(evt.getSource() == view.getBtn_mover()){
            if(view.getTf_idCria().getText().isEmpty()){
                Rut.msgError("El campo Cría ID está vacío");
                return;
            }
            if(view.getCb_nvaDieta().getSelectedIndex() == 0 || view.getCb_nvoCorral().getSelectedIndex() == 0){
                Rut.msgError("Seleccione una nueva dieta o corral");
                return;
            }
            onClicMover();
        }

    }

    public void onClicMover(){
        int res = 0;
        if(view.getDp_fechaMov().toString().isEmpty())
            Rut.msgError("La fecha de movimiento está vacía");
        try{
            int id = Integer.parseInt(view.getTf_idCria().getText());
            String fechaMov = view.getDp_fechaMov().toString();
            int corralNuevo = Integer.parseInt(view.getCb_nvoCorral().getSelectedItem().toString());
            String dietaNueva = view.getCb_nvoCorral().getSelectedItem().toString();
            if(saludCria){
                if(view.getDp_fechaIni().toString().isEmpty())
                    Rut.msgError("La fecha de inicio de enfermedad está vacía");
                String fechaIniEnf = view.getDp_fechaIni().toString();
                ResultSet rs = model.pa_movimientosCorrales(id,corralNuevo,saludCria,dietaNueva,fechaMov,fechaIniEnf);
                rs.next();
                res = rs.getInt(1);
            }
            else{
                ResultSet rs = model.pa_movimientosCorrales(id,corralNuevo,false,dietaNueva,fechaMov,"20191201");
                rs.next();
                res = rs.getInt(1);
            }
        }catch(SQLException e){ e.printStackTrace();
        }
        finally {
            view.getMessage(res);
            view.getDp_fechaIni().setEnabled(false);
            view.getDp_fechaIni().clear();
            view.getDp_fechaMov().clear();
            flag = false;
            view.getTf_idCria().setText("0");
            view.getTf_idCria().setBorder(original);
            fillCombos(true);
        }
    }

    public void fillTable(){
        DefaultTableModel tableModel = new DefaultTableModel(null,columnas);
        String registros[] = new String[columnas.length];
        try {
            ResultSet rs = model.select_diasEnfermas();
            while(rs.next()){
                registros[0] = rs.getInt(1)+"";
                registros[1] = rs.getInt(2)+"";
                registros[2] = rs.getInt(3)+"";
                tableModel.addRow(registros);
            }
            view.getT_enfermas().setModel(tableModel);
        }catch (SQLException e){}
    }




    public void onClicVerifica(){
        try{
            int id = Integer.parseInt(view.getTf_idCria().getText());
            ResultSet rs = model.pa_selectCriaParaMover(id);
            if (rs.next()){
                view.getTf_idCria().setBorder(BorderFactory.createLineBorder(Color.green));
                boolean salud = rs.getBoolean(2);
                flag = true;
                System.out.println(flag);
                if(salud){
                    view.getDp_fechaIni().setEnabled(true);
                    saludCria = true;
                }
                else {
                    view.getDp_fechaIni().setEnabled(false);
                    saludCria = false;
                }
                fillCombos(saludCria);
            }else {
                Rut.msgError("El Id no existe");
                view.getTf_idCria().setBorder(original);
            }

        }catch (SQLException e){e.printStackTrace();}
    }





    @Override
    public void focusGained(FocusEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        aux.selectAll();
    }

    @Override
    public void focusLost(FocusEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        Rut.borderCheck(aux, original);

    }

    @Override
    public void keyTyped(KeyEvent evt) {
        JTextField aux = (JTextField) evt.getSource();
        Rut.soundAlert(evt, aux, 10);
        Rut.onlyNumbers(evt,aux);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
