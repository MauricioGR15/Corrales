package Controllers;

import Models.Modelo;
import Views.viewCrias;

import java.awt.event.*;

public class CriasController implements ActionListener, FocusListener, ItemListener {

    Modelo model;
    viewCrias view;
    private String dietas[] = {"DIETA01","DIETA02","DIETA03","DIETA04","DIETA05"};
    private char salud[] = {'S','E','R'};

    public CriasController(viewCrias view, Modelo model){
        this.model = model;
        this.view = view;
        hazEscuchadores();
    }

    public void hazEscuchadores(){
        view.getBtn_registrarCrias().addActionListener(this);

        view.getCb_fechaL_day().addItemListener(this);
        view.getCb_fechaL_month().addItemListener(this);
        view.getCb_fechaL_year().addItemListener(this);

        view.getR_enferma().addActionListener(this);
        view.getR_riesgo().addActionListener(this);
        view.getR_saludable().addActionListener(this);

        view.getTf_idCria().addFocusListener(this);

    }


    public String buildDate(){
        String y = view.getCb_fechaL_year().getSelectedItem() + "";
        String m = view.getCb_fechaL_month().getSelectedIndex() + "";
        String d = view.getCb_fechaL_day().getSelectedItem() + "";
        return y + ((m.length()==1)?0+m:m) + ((d.length()==1)?0+d:d);
    }



    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == view.getBtn_registrarCrias()){
            System.out.println(buildDate());
            int idTernera = Integer.parseInt(view.getTf_idCria().getText());
            String date = buildDate();
            char s = salud[checkRadio()];
            int noCorral;
        }
    }

    public int checkRadio(){
        if (view.getR_saludable().isSelected()) return 0;
        else if(view.getR_enferma().isSelected()) return 1;
        else return 2;
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent evt) {
        if(evt.getStateChange()!=ItemEvent.SELECTED)
            return;
        //ComboBox Años
        if (evt.getSource() == view.getCb_fechaL_year()){
            view.cbMonths();
            return;
        }
        //ComboBox Meses
        if(evt.getSource() == view.getCb_fechaL_month()){
            view.cbDays();
            return;
        }
    }
}
