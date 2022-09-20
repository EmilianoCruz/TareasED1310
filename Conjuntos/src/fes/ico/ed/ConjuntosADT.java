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
public class ConjuntosADT<T> implements Comparable<T>{
    int tamanio;
    ArrayList<T> datos;

    public ConjuntosADT(int tam) {
        this.tamanio = tam;
        datos = new ArrayList();
        for (int i = 0; i < this.tamanio; i++) {
            datos.add(null);
        }
    }
    
    public T getElemento(int indice) throws IndexOutOfBoundsException{
        return datos.get(indice);
    }
    
    public void setElemento(int indice, T dato)throws IndexOutOfBoundsException{
        this.datos.set(indice, dato);
    }

    public int getTamanio() {
        return tamanio;
    }
    
    public void Agregar(T temp){
        
        if (this.datos.contains(temp)) {
            System.out.println("El elemento ya existe");
        }else{
        datos.add(temp); 
        }
    }
    public void Eliminar(T temp){
             
        if (this.datos.contains(temp)) {
            this.datos.remove(temp); 
        }else{
            System.out.println("El elemento a eliminar no existe");
        }
    }
    
    
    public boolean Contiene(Object o){
       return this.datos.contains(o);
    }
    
    public boolean Equals(ConjuntosADT t){
        boolean tr= true;
        
        for (T dato : datos) {
            if (dato.equals(t)) {
                tr=true;
            }
        else{
                tr=false;
                }
        }
        return tr;
    }
            
            
    public void limpiar(T dato){
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, dato);
        }
    }
    
    @Override
    public String toString() {
        String estado = "";
        for (T dato : datos) {
            if(dato != null)
            estado += dato.toString() +"\n";
        }
        return estado;
    }

    @Override
    public int compareTo(T o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}