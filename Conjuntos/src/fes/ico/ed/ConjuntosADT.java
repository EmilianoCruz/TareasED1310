/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.ico.ed;

import java.util.ArrayList;


/**
 *
 * @author emycr
 */
public class ConjuntosADT<T> implements Comparable<T> {
    int tamanio;
    ArrayList<T> datos;

    public ConjuntosADT() {
        datos = new ArrayList<T>();
    }

    public int Longitud() {
        return tamanio;
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
        if (this.Longitud() != t.Longitud()) {
            return false;
        }
        for (T elemento : this.datos) {
            if (!t.Contiene(elemento)) {
                return false;
            }
        }
        return true;
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

    public void Union(ConjuntosADT<T> t) {
        for (T elemento : t.datos) {
            this.Agregar(elemento);
            
        }

    }
    
    public ConjuntosADT<T> Interseccion(ConjuntosADT<T> t){
        ConjuntosADT<T> aux = new ConjuntosADT<>(); 
        for (T dato : datos) {
            if (t.Contiene(dato)) {
                aux.Agregar(dato);
            }
        }
        return aux;
    }

    public boolean SubConjunto(ConjuntosADT<T> t){
        if (Longitud()> t.Longitud()) {
            return false; }
        for (T dato : datos) {
            if (!t.Contiene(dato)) {
                return false;
            }
        }
        return true;
    }
    public ConjuntosADT<T> Diferencia(ConjuntosADT t) {
        ConjuntosADT<T> aux= new ConjuntosADT<>(); 
        for (T dato : datos) {
            if(!t.Contiene(dato)){
                aux.Agregar(dato);
            }
        }
        for (T dato : datos) {
            if (!Contiene(dato)) {
                aux.Agregar(dato);
            }
        }
        return aux;
    }

    @Override
    public int compareTo(Object o) {

        return 8;
    }

}
