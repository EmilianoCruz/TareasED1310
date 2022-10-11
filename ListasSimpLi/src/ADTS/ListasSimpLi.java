/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADTS;

/**
 *
 * @author emycr
 */
public class ListasSimpLi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaLigadaADT<Integer> n = new ListaLigadaADT<>();
        n.agregarAlInicio(15);
        n.agregarAlInicio(16);
        n.agregarAlFinal(17);
        n.agregarAlFinal(20);
        
        
        n.transversal();
        System.out.println("Está vacía la lista: "+n.estaVacia());

        System.out.println("\nEliminando el primero:");
        n.eliminarElPrimero();
        n.transversal();
        //System.out.print("\n");
        System.out.println("La posicion del 17 es: "+n.buscar(17));

        System.out.println("\nAgregando un 10 despues del 15:");
        n.agregarDespuesDe(n.getNodo(), 10);
        n.transversal();

        System.out.println("\nTranseversal: ");
        n.transversal();
        System.out.println("\nEl tamaño de la lista es: " + n.getTamanio());
        System.out.println("\nElimiando la posición 2:");
        n.eliminar(2);
        n.transversal(); 
        
        System.out.println("Actualizando el valor 17 al 16: ");
        n.actualizar(n.getNodo().getSiguiente(), 16);
        n.transversal();
      
        System.out.println("\nEliminando el final: ");
        n.eliminarElFinal();
        n.transversal();

        
        
      
     
        

    }
}
