/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author emycr
 */
public class ADTArray<E>{
    private int tamanio; 
    private int index; 
    private String elemento; 
    private int longitud=0; 
    
    private final Object[] arreglo; 

    public ADTArray(int ta) {
        arreglo = new Object[ta]; 
        longitud=+ta;   
        
    }

    
    public void limpiar(E e){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= e;
        }
    } 

    public void setElemento(int indice, E elemento ) {
       try{
        arreglo[indice] = elemento; 
       }catch(Exception e){
           System.out.println(e);
       }        
      
    }

    public E getElemento(int indice) {
        @SuppressWarnings("unchecked")
	final E elemento = (E)arreglo[indice];
	return elemento;
    }
    
    public int getLongitud(){
        return longitud; 
        
    }

    @Override
	public String toString() {
		return Arrays.toString(arreglo);
	}
    
   
    
    
    
}
