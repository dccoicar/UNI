package uni.sistemas.model;

import uni.sistemas.service.Figura;

public class Cuadrado extends Figura {

    //atributo
    double lado;
    //constructor

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //metodos polimorfos
    @Override
    public double Area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double Perimetro() {
        return lado * 4;
    }

}
