package Controllers;

import Support.Rut;
import Views.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class PrincipalController implements ActionListener{

    viewPrincipal view;
    MainFrame parent;

    public PrincipalController(viewPrincipal view){
        this.view = view;
        parent = view.parent;
        hazEscuchadores();
    }

    private void hazEscuchadores(){
        view.getBtn_clasificar().addActionListener(this);
        view.getBtn_corrales().addActionListener(this);
        view.getBtn_crias().addActionListener(this);
        view.getBtn_cuarentenas().addActionListener(this);
        view.getBtn_gc2().addActionListener(this);
        view.getBtn_info().addActionListener(this);
        view.getBtn_informes().addActionListener(this);
        view.getBtn_salir().addActionListener(this);
        view.getBtn_procesar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        JButton aux = (JButton) evt.getSource();

        if (aux == view.getBtn_clasificar()){
            Rut.goPanel(parent,view.getClas());
            return;
        }
        if(aux == view.getBtn_corrales()){
            Rut.goPanel(parent,view.getCorrales());
            return;
        }
        if(aux == view.getBtn_crias()){
            Rut.goPanel(parent, view.getCrias());
            return;
        }
        if(aux == view.getBtn_cuarentenas()){
            Rut.goPanel(parent, view.getCuarentenas());

            return;
        }
        if(aux == view.getBtn_gc2()){
            Rut.goPanel(parent,view.getEnfermas());
            return;
        }
        if(aux == view.getBtn_info()){
            return;
        }
        if(aux == view.getBtn_procesar()){
            Rut.goPanel(parent, view.getProcesar());
            return;
        }
        if(aux == view.getBtn_informes()){
            Rut.goPanel(parent,view.getInforme());
            return;
        }
        if(aux == view.getBtn_salir()) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                parent.dispatchEvent(new WindowEvent(parent, WindowEvent.WINDOW_CLOSING));
            }
        }

    }
}
