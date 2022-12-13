/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

import java.util.Arrays;

/**
 *
 * @author emycr
 * @param <T>
 */
public class HashTableADT<T>{
    
    private String[] arreglo;
    private Object[] arreglo2;
    int tamanio, contador;

    public HashTableADT(int tamanio) {
        this.tamanio = tamanio;
        arreglo = new String[tamanio];
        arreglo2 = new String[tamanio];
//        Arrays.fill(arreglo, "-1");
    }

    public void Add(int key, String dato) {
        int indiceArreglo = key % tamanio;
        arreglo[indiceArreglo] = dato;

    }

    public String valueOf(int key) {
        int indiceArreglo = key % tamanio;
        return arreglo[indiceArreglo];
    }

    public void remove(int key) {
        int indiceArreglo = key % tamanio;
        arreglo[indiceArreglo] = null;
    }

    @Override
    public String toString() {
        String edo = "";
        for (int i = 0; i < arreglo.length; i++) {
            edo += "|-"+i+"-|";
        }
        edo += "\n";
        for (int i = 0; i < arreglo.length; i++) {
            edo += " " + arreglo[i] + " ";
        }
        return edo;

    }

}
