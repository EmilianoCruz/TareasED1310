/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import ADT.queueADT;

/**
 *
 * @author emycr
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        queueADT<String> pb = new queueADT(); 
        System.out.println(pb.length());
        pb.enqueue("Emiliano");
        pb.enqueue("Jose");
        pb.enqueue("Sofia");
        pb.enqueue("Andres");
        System.out.println("Cola:\n"+pb);
        System.out.println("\nLargo: "+pb.length());
        System.out.println("¿Está vacia?  "+pb.isEmpty());
        pb.dequeue();
        System.out.println("\nEliminando el  primero de la cola: \n"+pb);
       
    }
    
}
