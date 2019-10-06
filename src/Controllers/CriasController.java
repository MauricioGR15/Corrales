package Controllers;

import Models.Modelo;
import Views.viewCorrales;
import Views.viewCrias;

public class CriasController {

    Modelo model;
    viewCrias view;

    public CriasController(viewCrias view, Modelo model){
        this.model = model;
        this.view = view;
    }
}
