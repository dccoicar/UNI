/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.controller;

import uni.sistemas.model.Boleta;
import uni.sistemas.model.Factura;
import uni.sistemas.service.Comprobante;

/**
 *
 * @author Alumno
 */
public class ComprobanteController {

    public Comprobante getDocumento(int tipo) {
        Comprobante com = null;
        switch (tipo) {
            case 1: // crea objeto de la clase Boleta
                com = new Boleta();
                break;
            case 2: // crea objeto de la clase Factura
                com = new Factura();
                break;
        }
        return com;
    }
}
