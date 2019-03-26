package uni.sistemas.entity;

import java.util.Date;

public class Producto {

    //atributos
    private String id;
    private String nombre;
    private String categoria;
    private Date fecha;
    private double precio;
    private int stock;
    //constructor

    public Producto() {
        this.id = "PR001";
        this.nombre = "Cuzqueña heladita";
        this.categoria = "Bebidas";
        this.fecha = new Date();
        this.precio = 50;
        this.stock = 2;
    }

    public Producto(String nombre, String categoria, double precio, int stock) {
        this.id = "PR001";
        this.nombre = nombre;
        this.categoria = categoria;
        this.fecha = new Date();
        this.precio = precio;
        this.stock = stock;
    }

    //metodos de encapsulacion: get y set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
