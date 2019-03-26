
package uni.sistema.controller;

import uni.sistema.model.Aritmetica;

public class AritmeticaController {
    //instancia de la clase Aritmetica    
    Aritmetica obj = new Aritmetica();
    
    
    public double Operacion(double n1, double n2, int opcion){
        //se crea una variable res del tipo double pra el resultado
        double res=0;
        
        switch (opcion) {
            case 1:
                 res= obj.Sumar(n1, n2);                
                break;
                
            case 2:
                 res= obj.Restar(n1, n2);                
                break;
            
            case 3:
                 res= obj.Multiplicar(n1, n2);                
                break;
            
            case 4:
                 res= obj.Dividir(n1, n2);                
                break;
                
            default:
                throw new AssertionError();
        }
        
        
        return res;
        
    }//fin de Operacion
            
            
    
}//the end class
