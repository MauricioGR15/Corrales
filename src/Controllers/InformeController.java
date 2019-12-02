package Controllers;

import Models.Modelo;
import Support.Rut;
import Views.viewInforme;
import Views.viewPrincipal;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InformeController implements ActionListener {

    private viewInforme view;
    private Modelo model;
    private String columnas[] = {"Cría ID","Llegada a CT","Grasa Cobertura","Cuarentena","Movimientos","Días"};


    public InformeController (viewInforme view, Modelo model){
        this.view = view;
        this.model = model;

        view.getBtn_actualizar().addActionListener(this);
        view.getBtn_home().addActionListener(this);
        fillTable();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == view.getBtn_home()){
            Rut.goPanel(viewPrincipal.parent, view.getViewP());
            return;
        }

        if(evt.getSource() == view.getBtn_actualizar()){
            fillTable();
            return;
        }
    }

    private void fillTable(){

        DefaultTableModel tableModel = new DefaultTableModel(null,columnas);
        String registros[] = new String[columnas.length];
        try {
            ResultSet rs = model.select_informe();
            while(rs.next()){
                registros[0] = rs.getInt(1) + "";
                registros[1] = rs.getString(2);
                registros[2] = rs.getInt(3)+"";
                registros[3] = rs.getInt(4)+"";
                registros[4] = rs.getInt(5)+"";
                registros[5] = rs.getString(6);
                tableModel.addRow(registros);
            }
            view.getT_informes().setModel(tableModel);
        }catch (SQLException e){e.printStackTrace();}

    }
}
