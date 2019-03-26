/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.service;

/**
 *
 * @author Alumno
 */
public interface IProcesar<T> {

    //definir metodos genericos
    T Sumar(T a, T b);

    T Restar(T a, T b);

    T Multiplicar(T a, T b);

    T Dividir(T a, T b);
}
