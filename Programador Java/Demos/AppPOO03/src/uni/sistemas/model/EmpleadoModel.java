
package uni.sistemas.model;

import uni.sistemas.entity.Empleado;
import uni.sistemas.util.Constante;

public class EmpleadoModel {
    //metodos para procesar datos
    public void ProcesarDatos(Empleado emp){
        //calcular total,remta,neto
        emp.setRenta(0);
        emp.setTotal(emp.getDias()*emp.getHoras()*emp.getPago());
        if (emp.getTotal()>1500) {
            emp.setRenta(emp.getTotal()*Constante.RENTA);            
        }
        
        emp.setNeto(emp.getTotal()-emp.getRenta());
               
    }//the end ProcesarDatos
    
    
}
