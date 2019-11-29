package Controllers;

import Models.Modelo;
import Support.Routines;
import Views.viewEnfermas;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnfermasController implements ActionListener {

    private Modelo model;
    private viewEnfermas view;
    private Routines rut;
    private final String columnas[] = {"ID Cría", "No. Corral", "Salud", "Llegada","Grasa Cob"};

    public EnfermasController(viewEnfermas view, Modelo model){
        this.view = view;
        this.model = model;
        rut = new Routines();
//        fillTable();
        hazEscuchadores();
    }

    private  void hazEscuchadores(){
        view.getBtn_actualizar().addActionListener(this);
    }


//    public void fillTable(){
//
//        DefaultTableModel tableModel = new DefaultTableModel(null,columnas);
//        String [] registros = new String [columnas.length];
//        try{
//            ResultSet rs = model.select_criasEnfermas();
//            while(rs.next()){
//                registros[0] = rs.getInt("cria_id") + "";
//                registros[1] = rs.getInt("corral_no") + "";
//                registros[2] = rut.salud(rs.getString("cria_salud"));
//                registros[3] = rs.getString("cria_fechaL");
//                registros[4] = rs.getInt("clas_grasCobertura") + "";
//                tableModel.addRow(registros);
//            }
//            view.getT_enfermas().setModel(tableModel);
//        }catch (SQLException e){
//            e.getMessage();
//        }
//
//
//    }


    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == view.getBtn_actualizar()){
//            fillTable();
            System.out.println("entra");
        }

    }
}
