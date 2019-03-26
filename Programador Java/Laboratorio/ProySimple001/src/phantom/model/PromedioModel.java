package phantom.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import phantom.entity.Promedio;

public class PromedioModel {

    public void ProcesarDatos(Promedio promAlu) {
        double minimo;
        double promPracticas = 0;
        /*Linea de codigo que ayuda a guardar varios números en un conjunto
         Y luego se procede a sacar el menor o mayor número de ese conjunto
         en esre caso se desea extraer el menor número del conjunto de numeros*/
        Set<Double> hs = new HashSet<Double>();
        hs.add(promAlu.getPractica1());
        hs.add(promAlu.getPractica2());
        hs.add(promAlu.getPractica3());
        hs.add(promAlu.getPractica4());

        minimo = Collections.min(hs);

        promPracticas = (promAlu.getPractica1() + promAlu.getPractica2() + promAlu.getPractica3() + promAlu.getPractica4() - minimo) / 3;

        promAlu.setPromedio(promPracticas * 0.25 + promAlu.getEparcial() * 0.25 + promAlu.getEfinal() * 0.50);

    }//the en metod ProcesarDatos

}//the en class
