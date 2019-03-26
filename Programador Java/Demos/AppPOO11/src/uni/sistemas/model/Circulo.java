package uni.sistemas.model;

import uni.sistemas.service.Figura;

public class Circulo extends Figura {

    //atributo
    double radio;

    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //metodos polimorfos
    @Override
    public double Area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double Perimetro() {
        return 2 * Math.PI * radio;
    }

}
