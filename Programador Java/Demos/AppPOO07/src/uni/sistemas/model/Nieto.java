/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;


public class Nieto extends Hijo{
    //constructor
    public Nieto() {
       // super();
        System.out.println("Atletico de Madrid es nieto del Real");
    }
    //metodo
    @Override
    public void Mensaje(){
        super.Mensaje();
        System.out.println("Al dia el Atletico sera Campeon !");
    }
    
    
}
