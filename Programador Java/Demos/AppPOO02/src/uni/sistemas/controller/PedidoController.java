package uni.sistemas.controller;

import uni.sistemas.entity.Pedido;
import uni.sistemas.model.PedidoModel;

public class PedidoController {

    //variable de instancia
    PedidoModel model;

    //constructor
    public PedidoController() {
        model = new PedidoModel();
    }

    //metodo de negocio
    public String calcularPedido(Pedido x) {

        model.ProcesarDatos(x);
        //Construir boleta de pedido
        String boleta = "Proveedor     : " + x.getProveedor() + "\n"
                + "Importe       : " + x.getImporte() + "\n"
                + "Impuesto      : " + x.getImpuesto() + "\n"
                + "Total a Pagar : " + x.getTotal();

        return boleta;
    }

}//the end class
