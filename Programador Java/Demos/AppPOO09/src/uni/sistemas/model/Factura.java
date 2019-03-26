package uni.sistemas.model;

import uni.sistemas.entity.Item;
import uni.sistemas.service.Comprobante;
import uni.sistemas.util.Constante;

public class Factura extends Comprobante {

    @Override
    public Item[] Documento(double total) {
        //calcular servicio y totalgeneral
        double consumo = total / (1 + Constante.IMPUESTO);
        double impuesto=total- consumo;
        double servicio = total * Constante.SERVICIO;
        double totalgeneral = total + servicio;
        // variable de tipo array
        Item[] doc = new Item[5];
        doc[0] = new Item("Consumo", consumo);
        doc[1] = new Item("IMpuesto", impuesto);
        doc[2] = new Item("Total", total);
        doc[3] = new Item("Servicio(10%)", servicio);
        doc[4] = new Item("Total General", totalgeneral);
        return doc;
    }

}
