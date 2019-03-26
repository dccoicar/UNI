package uni.sistemas.controller;

import uni.sistemas.model.Circulo;
import uni.sistemas.model.Cuadrado;
import uni.sistemas.service.Figura;
import uni.sistemas.util.Constante;

public class FiguraController {
    

    public static Figura getFigura(int tipo, double valor) {
         Figura obj=null;
        switch (tipo) {
            case Constante.CUADRADO:
                obj = new Cuadrado(valor);
                break;
            case Constante.CIRCULO:
                obj = new Circulo(valor);
                break;
                
        }
        return obj;
    }
}
