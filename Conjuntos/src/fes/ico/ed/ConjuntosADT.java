/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.ico.ed;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author emycr
 */
public class ConjuntosADT<T> implements Comparable<T> {

    int tamanio;
    //LinkedList<T> datos1;
    ArrayList<T> datos;

    public ConjuntosADT() {
//        this.tamanio = tam;
        datos = new ArrayList<T>();
//        datos1 = new LinkedList<T>();
    }

    public void Agregar(T temp) {

        if (this.datos.contains(temp)) {
            System.out.println("El elemento ya existe");
        } else {
            datos.add(temp);
            tamanio++;
        }
    }

    public void Eliminar(T valor) {
        T tmp = valor;
        if (this.datos.contains(tmp)) {
            this.datos.remove(tmp);
        } else {
            System.out.println("El elemento a eliminar no existe");
        }
    }

    public boolean Contiene(Object o) {
        return this.datos.contains(o);
    }

    public boolean Equals(ConjuntosADT t) {
        boolean tr = true;

        for (int i = 0; i < datos.size(); i++) {
            if (t.equals(datos)) {
                tr = true;
            } else {
                tr = false;
            }
             }
            return tr;
        }
    

    

    public void limpiar(T dato) {
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, dato);
        }
    }

    @Override
    public String toString() {
        String estado = "";
        String estado2 = "";
        estado += datos.toString();
        for (T dato : datos) {
            if (dato != null) {
                estado2 += "{" + estado + "}";
            }

        }
        return estado;
    }

//    public LinkedList<T> Intersección(LinkedList<T> prm, LinkedList<T> prms) {
//        Iterator<T> j;
//        Iterator<T> i;
//        LinkedList<T> listaIntersección = new LinkedList();
//        T elem1, elem2;
//        i = prm.iterator();
//        j = prms.iterator();
//
//        while (i.hasNext()) {
//            elem1 = i.next();
//            while (j.hasNext()) {
//                elem2 = j.next();
//                if (elem1.equals(elem2)) {
//                    listaIntersección.add(elem1);
//                }
//            }
//            j = prms.iterator();
//        }
//        return listaIntersección;
//    }

    public int Longitud() {
        return tamanio;
    }

    public void Union(ArrayList<T> t) {
        //ArrayList<T> t = new ArrayList<>();

        ArrayList<T> union = new ArrayList<>();
        union.addAll(datos);
        union.addAll(t);

        System.out.println(union);

    }

    public void Diferencia(ConjuntosADT t) {
        for (int i = 0; i < t.tamanio; i++) {
            if (t.equals(i)) {
                datos.remove(i);
            } else {
                datos.addAll(datos);
            }
        }
    }

    @Override
    public int compareTo(Object o) {

        return 8;
    }
}
