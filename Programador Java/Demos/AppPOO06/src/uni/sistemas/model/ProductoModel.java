package uni.sistemas.model;

import uni.sistemas.entity.Producto;

public class ProductoModel {
    //variable de instancia de la clase Producto
    Producto pro;
    public static int cont = 0;
    
    //constructor
    public ProductoModel() {
        pro = new Producto();
    }

    // metodos para procesar datos de objeto producto
    public void registrar(Producto p) {
        cont++;
        p.setId("PR00" + cont);
        pro = p;
    }

    public Producto consultar() {
        return pro;
    }

    public void modificarStock(int tipo, int cant) {
        switch (tipo) {
            case 1: // aumento
                pro.setStock(pro.getStock() + cant);
                break;
            case 0: // disminuir
                pro.setStock(pro.getStock() - cant);
                break;
        }
    }

    public void modificarPrecio(int tipo, double tasa) {
        switch (tipo) {
            case 1: // aumento
                pro.setPrecio(pro.getPrecio() + pro.getPrecio() * tasa / 100);
                break;
            case 0: // disminuir
                pro.setPrecio(pro.getPrecio() - pro.getPrecio() * tasa / 100);
                break;
        }
    }

}
