/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.acme;

import adts.Arreglo;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class LectorArchivos {
    private BufferedReader lector; // Lee el archivo
    private String linea; // Recibe la línea de cada fila
    private int linealen = 0; // Número de líneas
    private String partes[] = null; // Almacena cada línea leída
    private boolean PL = true; // Quitar la primera línea
    private int contador = 0; // Contador para el índice del arreglo
    private Arreglo<Empleado> arr; // Arreglo con los empleados
    //private Empleado em = new Empleado(); // Clase de empoleado
    private Arreglo<Integer> antiguedad; // Arreglo que contiene los años de ingreso
    
    public void LargoArchivo (String nArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nArchivo));
            while ((lector.readLine()) != null) {
                linealen ++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void LeerArchivo(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            antiguedad = new Arreglo(linealen);
            arr = new Arreglo(linealen);
            for (int i = 0; i < linealen; i++) {
                linea = lector.readLine();
                if (PL) {
                    PL = false;
                    continue;
                }else{
                partes = linea.split(",");
                //Empleado em = new Empleado(Integer.parseInt(partes[0]), partes[1], partes[2], partes[3], Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), Integer.parseInt(partes[6]));
                //System.out.println(em.getNombre() + " tiene un sueldo de: $" + em.calcularSueldo());
                  //  System.out.println(arr);
                CrearEmpleados();
                contador += 1;
               
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void CrearEmpleados() {
        arr = new Arreglo(linealen);
        
            Empleado em = new Empleado();
        em.setId(Integer.parseInt(partes[0]));
        em.setNombre(partes[1]);
        em.setPaterno(partes[2]);
        em.setMaterno(partes[3]);
        em.setHorasExtra(Integer.parseInt(partes[4]));
        em.setSueldoBase(Integer.parseInt(partes[5]));
        em.setAnioIngreso(Integer.parseInt(partes[6]));
        System.out.println(em.getNombre() + " tiene un sueldo de: $" + em.calcularSueldo());
        arr.setElemento(contador, em);
        antiguedad.setElemento(contador, Integer.parseInt(partes[6]));
        
    }
    
   public void Antiguedad() {
        int mayor = 0, menor = 299999;
        System.out.println(arr);    
        int largo = antiguedad.getTamanio();
        for (int i = 1; i < largo; i++) {
            if(antiguedad.getElemento(i) > mayor){
                menor = antiguedad.getElemento(i);
            }
            if(antiguedad.getElemento(i) < menor){
                mayor = antiguedad.getElemento(i);
            }
        }
        System.out.println("Es el trabajador de mayor antiguedad: " + mayor);
        System.out.println("Es el trabajador de menor antiguedad: " + menor);
        
//        for (int i = 0; i < arr.getTamanio(); i++) {
//            System.out.println(arr);
//        }
        
    }
   }
