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
        ConjuntosADT <Integer> ejem3 = new ConjuntosADT<>();
        ConjuntosADT <Integer> ejem4 = new ConjuntosADT<>();
        ConjuntosADT<String> ejem5 = new ConjuntosADT<>(); 
        ConjuntosADT<String> ejem6 = new ConjuntosADT<>(); 
        ConjuntosADT<Integer> ejem1 = new ConjuntosADT<>(); 
        
        
        ejem5.Agregar("Emiliano");
        ejem5.Agregar("Emiliano");
        ejem5.Agregar("Sofia");
        ejem5.Agregar("Antonio");
        System.out.println("Conjunto 1:"+ejem5);
        System.out.println("La longitud del conjunto es:"+ejem5.Longitud());
        ejem5.Eliminar("Antonio");
        System.out.println("Eliminamos a Antonio del conjunto 1: "+ejem5);
        
        ejem6.Agregar("Emiliano");
        System.out.println("\nConjunto 2: "+ejem6+"\n");
        
        
        
        System.out.println("El conjunto 1 es igual al conjunto 2: "+ejem5.Equals(ejem6));
        System.out.println("El conjunto 1 contiene a Sofia: "+ejem5.Contiene("Sofia"));
        
        ejem3.Agregar(2);
        ejem3.Agregar(3);
        ejem3.Agregar(7);
        ejem3.Agregar(8);
        System.out.println("\nConjunto 4: "+ejem3);
        
        ejem4.Agregar(3);
        ejem4.Agregar(2);
        ejem4.Agregar(24);
        System.out.println("Conjunto 5:"+ejem4);
        
        
        ejem1.Agregar(3);
        ejem1.Agregar(2);
        System.out.println("Conjunto 6: "+ ejem1);
        System.out.println("\nEl conjunto 6 es subconjunto del conjunto 4: "+ejem1.SubConjunto(ejem3));
        
        ConjuntosADT<Integer> conjuntoint= ejem3.Interseccion(ejem4);
        System.out.println("La interseccion del conjunto 4 y el conjunto 5 es: "+conjuntoint);
        
        ConjuntosADT<Integer> conjuntodif= ejem3.Diferencia(ejem4); 
        System.out.println("La diferencia del conjunto 4 y el conjunto 5 es: "+conjuntodif);
        
        ejem3.Union(ejem4);
        System.out.println("La union del conjunto 4 y el conjunto 5 es: "+ejem3);

       
        
        
    }
    
}
