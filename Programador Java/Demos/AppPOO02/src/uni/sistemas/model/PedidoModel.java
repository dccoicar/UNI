package uni.sistemas.model;

import uni.sistemas.entity.Pedido;
import uni.sistemas.util.Constante;

public class PedidoModel {

    //metodo para procesar datos    
    public void ProcesarDatos(Pedido pe) {
        //calcular impuesto y total
        double igv = pe.getImporte() * Constante.IGV;
        double tot = pe.getImporte() + igv;

        //encapsular
        pe.setImpuesto(igv);
        pe.setTotal(tot);
    }

}//the end class
