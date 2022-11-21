/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTS;

import java.util.ArrayList;

/**
 *
 * @author emycr
 * @param <T>
 *
 */
public class queueADT<T> {

    ArrayList<T> datos = new ArrayList<>();

    public queueADT() {
    }

    public boolean isEmpty() {
        return datos.size() == 0;
    }

    public int length() {
        return datos.size();
    }

    public void enqueue(T dato) {
        datos.add(dato);
    }

    public void dequeue() {
        datos.remove(0);
    }

    @Override
    public String toString() {
        String estado = "";
        for (T dato : datos) {
            estado += "->|" + dato + "|";
        }
        return estado;

    }

}
