/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntos;

import fes.ico.ed.ConjuntosADT;
import java.time.temporal.Temporal;

/**
 *
 * @author emycr
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConjuntosADT <Persona> ejem= new ConjuntosADT(2);
        ConjuntosADT<Persona> ejem2 = new ConjuntosADT(2);
        
        ejem.setElemento(0, new Persona("Emiliano", 12));
        ejem2.setElemento(0, new Persona("Emiliano", 12));
        //System.out.println(ejem);
        //System.out.println(ejem.getTamanio()); 
        Persona busqueda = new Persona("Emiliano", 12);
        //System.out.println(ejem.Contiene(busqueda));
        //System.out.println(ejem.Equals(ejem2));
        System.out.println(ejem.Equals(ejem2));
        
       
         
        
        
    }
    
}
