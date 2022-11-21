/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import ADTS.BoundedPriorityQueue;
import ADTS.queueADT;
import java.util.ArrayList;

/**
 *
 * @author emycr
 */
public class ColasAcotadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        BoundedPriorityQueue<String> p = new BoundedPriorityQueue<>(5);
        
        p.enqueue(0, "Emiliano");
        p.enqueue(0, "Andres");
        p.enqueue(1, "Andres");
        p.enqueue(2, "Sofia");
        p.enqueue(3, "Toño");
        p.enqueue(4, "Xenia");
        System.out.println(p);
        System.out.println("¿Está vacía? "+p.isEmpty());
        System.out.println("Largo de prioridad: "+p.lenght()+"\n");
        p.dequeue();
        System.out.println(p);
                
        }
    }
    

