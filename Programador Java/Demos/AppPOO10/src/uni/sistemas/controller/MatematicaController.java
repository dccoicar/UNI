package uni.sistemas.controller;

import uni.sistemas.model.Matematica;

public class MatematicaController {

    Matematica mat = new Matematica();

    public double Operacion(double a, double b, int opcion) {
        double res = 0;
        switch (opcion) {
            case 1:
                res = mat.Sumar(a, b);
                break;
            case 2:
                res = mat.Restar(a, b);
                break;
            case 3:
                res = mat.Multiplicar(a, b);
                break;
            case 4:
                res = mat.Dividir(a, b);
                break;
        }
        return res;
    }
}
