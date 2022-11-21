/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTS;

import java.util.ArrayList;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author emycr
 * @param <T>
 */
public class BoundedPriorityQueue<T> {
    private ADTArray<T> array2;
    private int tamanio; 
    private Object[] arreglo ; 
    private queueADT<T> cola= new queueADT<>();
    private ArrayList<T> array;

    
    public BoundedPriorityQueue(int niveles) {
       arreglo = new Object[niveles];
    }
    
    public int lenght(){
        return arreglo.length;
    }
    
    public boolean isEmpty(){
        return arreglo.length == 0;
    }
    
    public void enqueue(int prioridad, T elemento ){
        cola.enqueue(elemento);
        arreglo[prioridad]= cola;
        
    }
    
    public void dequeue(){
        cola.dequeue();
    }
    
    
    
    
    @Override
    public String toString(){
        String edo="";
        for (int i = 0; i < arreglo.length; i++) {
            edo+="Elemento |"+i+"|"+arreglo[i]+"\n";
        }
        
        return edo;
    }
    
    
    
    
    
}
