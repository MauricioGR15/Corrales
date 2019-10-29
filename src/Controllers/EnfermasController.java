package Controllers;

import Models.Modelo;
import Support.Routines;
import Views.viewEnfermas;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnfermasController {

    private Modelo model;
    private viewEnfermas view;
    private Routines rut;
    private final String columnas[] = {"ID Cría", "No. Corral", "Salud", "Fecha llegada","Grasa cobertura"};

    public EnfermasController(viewEnfermas view, Modelo model){
        this.view = view;
        this.model = model;
        rut = new Routines();
        fillTable();
        view.getScrollPane().updateUI();
    }


    public void fillTable(){

        DefaultTableModel tableModel = new DefaultTableModel(null,columnas);
        String [] registros = new String [columnas.length];
        try{
            ResultSet rs = model.sp_selectCriasEnfermas();
            while(rs.next()){
                registros[0] = rs.getInt("cria_id") + "";
                registros[1] = rs.getInt("corral_no") + "";
                registros[2] = rut.salud(rs.getString("cria_salud"));
                registros[3] = rs.getString("cria_fechaL");
                registros[4] = rs.getInt("clas_grasCobertura") + "";
                tableModel.addRow(registros);
            }
            view.getT_enfermas().setModel(tableModel);
        }catch (SQLException e){
            e.getMessage();
        }


    }


}
