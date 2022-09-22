/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntos;

import fes.ico.ed.ConjuntosADT;
import java.time.temporal.Temporal;
import java.util.ArrayList;

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
        ConjuntosADT <Integer> ejem3 = new ConjuntosADT();
        ArrayList <Integer> ejem4 = new ArrayList<>();
        ConjuntosADT<String> ejem5 = new ConjuntosADT(); 
        ConjuntosADT<String> ejem6 = new ConjuntosADT(); 
        
        
        ejem5.Agregar("Emiliano");
        ejem5.Agregar("Emiliano");
        ejem5.Agregar("Sofia");
        System.out.println(ejem5);
        ejem6.Agregar("Emiliano");
        //ejem6.Agregar("Sofia");
        System.out.println(ejem5.Equals(ejem6));
        System.out.println("La longitud del conjunto es:"+ejem5.Longitud());
        System.out.println(ejem5.Contiene("Sofia"));
        System.out.println(ejem3.Contiene(10));
        ejem3.Agregar(2);
        ejem3.Agregar(2);
        System.out.println(ejem3.Contiene(2));
        ejem3.Agregar(7);
        System.out.println(ejem3);
        System.out.println(ejem4);
        ejem4.add(3);
        ejem4.add(2);
        ejem4.add(24);
        ejem3.Union(ejem4);
         
        
        
    }
    
}
