/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT_Pila;

import java.util.ArrayList;

/**
 *
 * @author emycr
 * @param <T>
 */
public class StackADT<T> {
    private ArrayList<T> datos = new ArrayList<>(); 
    private int tamanio; 

    public StackADT() {
        
    }
    
    public int length(){
        return datos.size(); 
    }
    
    public void push(T dato){
        datos.add(dato);
    }
   
    public boolean isEmpty(){
        return this.length()==0; 
    }
    
    public T pop(){
        T dato= datos.remove(datos.size()-1);
        return dato; 
    }
    
    public void peek(){
        System.out.println(datos.get(datos.size()-1));
    }

    @Override
    public String toString() {
        String edo="";
        for (int i = datos.size()-1; i >= 0; i--) {
            edo += "|"+datos.get(i)+"|\n";
            
        }return edo; 
    }
    
    
    

    
    
}
