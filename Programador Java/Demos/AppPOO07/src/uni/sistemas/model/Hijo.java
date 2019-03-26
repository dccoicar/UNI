
package uni.sistemas.model;


public class Hijo extends Padre{
    //constructor
    public Hijo() {
        super();
        System.out.println("La Juve es el hijo del Real Madrid");
    }
   //metodo
    @Override
    public void Mensaje(){
        //nombre="juan Perez";
        //fecha="10/06/2017";
        System.out.println("Fecha: "+fecha);
        System.out.println("Barcelona tambien es el hijo del Real");
    }
    
    
}
