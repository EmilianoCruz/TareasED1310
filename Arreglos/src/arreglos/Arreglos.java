/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;



/**
 *
 * @author emycr
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ADTArray ap= new ADTArray(5);
        ap.setElemento(0, "Sofia");
        System.out.println(ap);
        System.out.println(ap.getLongitud());
        ap.setElemento(1, "Emiliano");
        System.out.println(ap.getLongitud());
        System.out.println(ap.getElemento(0));
        System.out.println(ap);
        System.out.println(ap.getElemento(1));
        
       
       
        
    }
    
}
