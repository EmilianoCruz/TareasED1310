/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.acme;

import ADTS.Arreglo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author emycr
 */
public class NominaADTT {

    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    private int longitud = 0;
    private Arreglo<Empleado> arr;
    private Arreglo<Integer> antiguedad;
    private boolean ENC = true;
    private int contador = 0;

    public void LongitudArchivo(String Archivo) {
        try {
            lector = new BufferedReader(new FileReader(Archivo));
            while ((lector.readLine()) != null) {
                longitud++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void leerArchivos(String nombreArchivo) {
        LongitudArchivo(nombreArchivo);
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            arr = new Arreglo(longitud);
            antiguedad = new Arreglo(longitud);
//            while ((linea= lector.readLine())!= null) {
            //partes= linea.split(",");

            for (int i = 0; i < longitud; i++) {
                linea = lector.readLine();
                if (ENC) {
                    ENC = false;
                    continue;
                } else {
                    partes = linea.split(",");
                    Empleados();
                    contador += 1;
                    
                }
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

    }

    public void Empleados() {
        arr = new Arreglo(longitud);

        Empleado em = new Empleado();
        em.setId(Integer.parseInt(partes[0]));
        em.setNombre(partes[1]);
        em.setPaterno(partes[2]);
        em.setMaterno(partes[3]);
        em.setHorasExtra(Integer.parseInt(partes[4]));
        em.setSueldoBase(Integer.parseInt(partes[5]));
        em.setAnioIngreso(Integer.parseInt(partes[6]));
        System.out.println(em.getNombre() + " su sueldo actual es de: $" + em.calcularSueldo());
        arr.setElemento(contador, em);
        antiguedad.setElemento(contador, Integer.parseInt(partes[6]));
        System.out.println(em);

    }

//public void obtener_max_min(){
//        int min=2999999; 
//        int max =0; 
//        Empleado emplMax = new Empleado(); 
//        Empleado emplMin=new Empleado(); 
//        LinkedList<Empleado> arr = new LinkedList<Empleado>(); 
//        for (Empleado e : arr) {
//            if(e.getAnioIngreso()>max){
//                max=e.getAnioIngreso(); 
//                emplMax=e;
//            }
//            if(e.getAnioIngreso()<min){
//                min=e.getAnioIngreso(); 
//                emplMin=e;
//            }
//        
//        }
//        System.out.println("\nEL empleado mása antigüo es "+emplMax.getNombre()+" desde "+max);
//        System.out.println("\nEL empleado mása antigüo es "+emplMin.getNombre()+" desde "+min);
//        
//}
        
    

   public void Antiguedad() {
        int mayor = 0, menor = 2999;
        Empleado emplmax; 
        Empleado emplmin;
        int largo= antiguedad.getTamanio();
     
        
        for (int i = 1; i < largo; i++) {
            if(antiguedad.getElemento(i)>mayor){
                mayor = antiguedad.getElemento(i);   
            }
            if(antiguedad.getElemento(i) < menor){
               menor = antiguedad.getElemento(i);
            }
        }
        System.out.println("Es el trabajador de mayor antiguedad: " + mayor);
        System.out.println("Es el trabajador de menor antiguedad: " + menor);
        
        
       
           
       }
}

