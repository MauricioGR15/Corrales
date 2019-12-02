package Controllers;

import Models.Modelo;
import Support.Rut;
import Views.viewEnfermas;
import Views.viewPrincipal;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnfermasController implements ActionListener {

    private Modelo model;
    private viewEnfermas view;
    private Rut rut;
    private final String columnas[] = {"ID Cría", "Sensor ID", "Ubicación", "Signo vital","Salud"};
    private final String signosV[] = {"Mala","Buena","Excelente"};

    public EnfermasController(viewEnfermas view, Modelo model){
        this.view = view;
        this.model = model;
        rut = new Rut();
        fillTable();
        hazEscuchadores();
    }

    private  void hazEscuchadores(){
        view.getBtn_home().addActionListener(this);
        view.getBtn_actualizar();
    }


    public void fillTable(){

        DefaultTableModel tableModel = new DefaultTableModel(null,columnas);
        String [] registros = new String [columnas.length];
        try{
            ResultSet rs = model.select_infoGC2();
            while(rs.next()){
                registros[0] = rs.getInt("cria_id") + "";
                registros[1] = rs.getInt(2)+"";
                registros[2] = rs.getString(3);
                registros[3] = signosV[rs.getInt(4)-1];
                registros[4] = rs.getBoolean(5)?"Saludable":"Enferma";
                tableModel.addRow(registros);
            }
            view.getT_enfermas().setModel(tableModel);
        }catch (SQLException e){
            e.getMessage();
        }
    }


    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == view.getBtn_home()){
            Rut.goPanel(viewPrincipal.parent, view.getViewP());
            return;
        }

        if(evt.getSource() == view.getBtn_actualizar()){
            fillTable();
        }
    }
}
