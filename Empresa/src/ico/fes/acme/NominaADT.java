/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.acme;

import ADTS.Arreglo;
import java.io.BufferedReader;
import java.io.FileReader;



/**
 *
 * @author Cabrera
 */
public class NominaADT {
    String nombreEmpresa;
    Arreglo<Empleado> nomina;
    String rutaArchivo;

    public NominaADT(String ruta) {
        this.rutaArchivo=ruta;
        int contador = 0 ;
        BufferedReader bufferReader = null; 
        
        try {
            bufferReader =new BufferedReader(new FileReader("C:\\\\Users\\\\emycr\\\\Documents\\\\ED1310\\\\junio.dat"));
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
       
    }
    
    
    
    
}
