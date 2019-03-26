/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import uni.sistemas.entity.Alumno;
import uni.sistemas.service.ICrudDao;
import uni.sistemas.util.Constante;

/**
 *
 * @author Alumno
 */
public class AlumnoDaoMemory implements ICrudDao<Alumno> {
    //variables

    Alumno[] lista;
    static int cont = 0;
    static int n = 0;
    //constructor

    public AlumnoDaoMemory() {
        lista = new Alumno[Constante.MAXIMO];
    }

    //METODOS PARA LA PERSISTENCIA DE DATOS EN MEMORIA
    @Override
    public void create(Alumno o) {
        cont++;
        o.setId(cont);
        lista[n] = o; //aqui agrega el objeto alumno en el arreglo lista
        n++;
    }

    @Override
    public void update(Alumno o) {
        for (int i = 0; i < n; i++) {
            if (lista[i].getId() == o.getId()) {
                lista[i] = o; //aqui actualiza
                break;
            }
        }
    }

    @Override
    public void delete(Alumno o) {
        for (int i = 0; i < n; i++) {
            if (lista[i].getId() == o.getId()) {
                for (int j = i; j < n; j++) {
                    lista[j] = lista[j + 1];  //
                }
                n--;
                break;
            }
        }
    }

    @Override
    public Alumno findForId(int o) {
        for (int i = 0; i < n; i++) {
            if (lista[i].getId() == o) {
               return lista[i];
            }
        }
        return null;
    }

    @Override
    public Alumno[] readAll() {
        Alumno[] temp;
        if (n==Constante.MAXIMO) {
            temp=lista;
        }else{
          temp=new Alumno[n];
          System.arraycopy(lista, 0, temp, 0, n);
        }
      return temp;
    }

}
