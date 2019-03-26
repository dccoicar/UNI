
package uni.sistemas.entity;

public class Empleado {
    //atributos
    private String nombre;
    private int dias;
    private int horas;
    private double pago;
    private double total;
    private double renta;
    private double neto;
    
    //contructor
    public Empleado() {
    }

    //metodos de encapsulación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + "\nDias=" + dias + "\nHoras=" + horas + "\nPago=" + pago + "\nTotal=" + total + "\nRenta=" + renta + "\nNeto=" + neto;
    }
    
     
    
}
