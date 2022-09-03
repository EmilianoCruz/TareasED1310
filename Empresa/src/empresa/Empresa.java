/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import ico.fes.acme.ManipulacionCSV;

/**
 *
 * @author emycr
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ManipulacionCSV ep = new ManipulacionCSV();
        ep.leerArchivos("C:\\Users\\emycr\\Documents\\ED1310\\junio.dat");
    }
    
}
