package uni.sistemas.controller;

import uni.sistemas.entity.Empleado;
import uni.sistemas.model.EmpleadoModel;

public class EmpleadoController {

    //variable de instancia

    EmpleadoModel model;

    //constructor
    public EmpleadoController() {
        model = new EmpleadoModel();
    }

    public void CalcularSueldo(Empleado e) {
        model.ProcesarDatos(e);
    }

}
