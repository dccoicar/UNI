package uni.sistemas.controller;

import uni.sistemas.entity.Alumno;
import uni.sistemas.model.AlumnoDaoMemory;

public class AlumnoController {
    //variable

    AlumnoDaoMemory dao;

    //constructor
    public AlumnoController() {
        dao = new AlumnoDaoMemory();
    }

    //metodos de negocio
    public Alumno[] AlumnoListar() {
        return dao.readAll();
    }

    public Alumno AlumnoBuscar(int id) {
        return dao.findForId(id);
    }

    public String AlumnoProcesar(Alumno alu, int opcion) {
        String msj = "";
        switch (opcion) {
            case 1:
                dao.create(alu);
                msj = "Alumno registrado con exito!";
                break;
            case 2:
                dao.update(alu);
                msj = "Alumno actualizado con exito!";
                break;
            case 3:
                dao.delete(alu);
                msj = "Alumno eliminado con exito!";
                break;
        }
        return msj;
    }

}
