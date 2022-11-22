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
    private int tamanio; 
    private Object[] arreglo ; 
    private queueADT<T> cola= new queueADT<>();
    private ArrayList<T> array; 
    int contador;
    
    public BoundedPriorityQueue(int niveles) {
       arreglo = new Object[niveles];
      // arreglo = new ArrayList(niveles);
        array = new ArrayList<>(5); 
    }
    
    public int lenght(){
        return arreglo.length;
    }
    
    public boolean isEmpty(){
        return arreglo.length == 0;
    }
    
    public void enqueue(int prioridad, T elemento ){
//        cola.enqueue(elemento);
//        arreglo[prioridad]=cola;
        if (array.get(prioridad)==null) {
              array.set(contador, elemento);
        }else{
            array.add(elemento);
        }
        
        
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
