/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

import ADT_Pila.StackADT;

/**
 *
 * @author emycr
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StackADT<String> n= new StackADT<>(); 
        System.out.println("Agregando elementos al stack:");
        n.push("EMILIANO");
        n.push("Sofia");
        n.push("JOSE");
        System.out.println(n.toString()); 
        System.out.println("Consultando el peek del stack:");
        n.peek();
        System.out.println("Borrando el tope del stack:");
        String datoBorrado= n.pop();
        System.out.print(n.toString());
        System.out.println("Elemento borrado: "+datoBorrado);
        System.out.println("\nNúmero de elementos del stack: "+n.length());
        System.out.println("\n¿La pila está vacía?\n"+n.isEmpty());
    }
    
}
