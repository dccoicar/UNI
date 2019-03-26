package uni.sistemas.entity;

public class Pedido {

//atributos
    private String proveedor;
    private double importe;
    private double impuesto;
    private double total;

//constructor
    public Pedido() {

    }

    //metodos de encapsulacion:  get y set   
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}//the en class
