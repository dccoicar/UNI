package phantom.controller;

import phantom.entity.Promedio;
import phantom.model.PromedioModel;

public class PromedioController {

    PromedioModel model;

    public PromedioController() {
        model = new PromedioModel();
    }

    public void CalcularPromedio(Promedio pro) {

        model.ProcesarDatos(pro);

    }//the end metod CalcularPromedio

}//the end class
