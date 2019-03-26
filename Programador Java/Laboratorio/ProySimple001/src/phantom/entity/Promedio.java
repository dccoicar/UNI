
package phantom.entity;

public class Promedio {
  

    private double practica1;
    private double practica2;
    private double practica3;
    private double practica4;
    private double eparcial;
    private double efinal;
    private double promedio;

    public Promedio() {
    }

    public double getPractica1() {
        return practica1;
    }

    public void setPractica1(double practica1) {
        this.practica1 = practica1;
    }

    public double getPractica2() {
        return practica2;
    }

    public void setPractica2(double practica2) {
        this.practica2 = practica2;
    }

    public double getPractica3() {
        return practica3;
    }

    public void setPractica3(double practica3) {
        this.practica3 = practica3;
    }

    public double getPractica4() {
        return practica4;
    }

    public void setPractica4(double practica4) {
        this.practica4 = practica4;
    }

    public double getEparcial() {
        return eparcial;
    }

    public void setEparcial(double eparcial) {
        this.eparcial = eparcial;
    }

    public double getEfinal() {
        return efinal;
    }

    public void setEfinal(double efinal) {
        this.efinal = efinal;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return this.promedio+"";
    }
    
    
    
    
    
}//the end class
