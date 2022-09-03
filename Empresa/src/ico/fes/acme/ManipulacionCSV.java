/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.acme;

import ADTS.Arreglo;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author emycr
 */
public class ManipulacionCSV {
    
    private BufferedReader lector; 
    private String linea; 
    private String linea2; 
    private String partes[]= null;
    private String partes2[]=null;
    
    
    public void leerArchivos(String nombreArchivo){
        try{
            lector = new BufferedReader(new FileReader(nombreArchivo)); 
            while ((linea= lector.readLine())!= null) {
                partes= linea.split("\n");
                Arreglo<String> arr = new Arreglo(partes.length);
                partes2= linea.split(",");
                
                
                
                
               // partes2 = linea.split("");
                //imprimirLineas(); 
                System.out.println();
                 
            }
            lector.close();
            linea=null; 
            partes=null; 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, e);
        }
         
    }
    
        public void imprimirLineas(){
            for (int i = 0; i < partes.length; i++) {
                System.out.print(partes[i]+" | ");
                //System.out.print(partes2[i]+" / ");
                
            }
        }
    }
    

