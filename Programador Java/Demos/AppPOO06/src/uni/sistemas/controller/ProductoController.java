package uni.sistemas.controller;

import uni.sistemas.entity.Producto;
import uni.sistemas.model.ProductoModel;


public class ProductoController {

    //instanciar objeto de la clase ProductoModel
    static ProductoModel model = new ProductoModel();

    public static void productoRegistrar(Producto p) {
        model.registrar(p);
    }

    public static Producto productoConsultar() {
        return model.consultar();
    }

    public static void productoActualizaStock(int op, int cant) {
        model.modificarStock(op, cant);
    }

    public static void productoActualizaPrecio(int op, double tasa) {
        model.modificarPrecio(op, tasa);
    }

}
