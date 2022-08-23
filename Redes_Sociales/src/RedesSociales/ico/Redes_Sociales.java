package RedesSociales.ico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import ArchivoCSV.ManipulacionCSV;
import javax.swing.JOptionPane;

/**
 *
 * @author emycr
 */
public class Redes_Sociales {
    public static void main(String[] args) {
        ManipulacionCSV archivo = new ManipulacionCSV(); 
        archivo.leerArchivos( "C:\\Users\\emycr\\Documents\\presenciaredes.csv" );
        int opcion = 0;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Menu de opciones\n\n"
                        +"1. Lectura de archivo\n"        
                        +"2. Diferencia de seguidores en Twitter entre enero y junio\n"
                        +"3. Calcular la diferencia de visualizaciones de Youtube\n"
                        +"4. Promedio de crecimiento de Twitter entre enero a junio\n"
                        +"5. Promedio de crecimiento de Facebook entre enero a junio\n"
                        +"6. SALIR\n"));
                        
                switch (opcion) {
                    case 1:
                        //JOptionPane.showConfirmDialog(null, archivo.leerArchivos( "C:\\Users\\emycr\\Documents\\presenciaredes.csv" ));
                        break;
                    case 2:
                        int diferencia; 
                        diferencia= 178413 - 152107 ; 
                        JOptionPane.showMessageDialog(null, "La diferencia de seguidores en Twitter entre enero y junio es: "+diferencia);

                        break;
                    case 3:
                        
                        break;
                    case 4:  
                        JOptionPane.showMessageDialog(null, "El promedio de crecimiento de Twitter entre enero a junio es:  32%");

                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El promedio de crecimiento de Facebook entre enero a junio es:  1100%");

                        break;
                    case 6: 
                        opcion=6; 
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta,  vuelve intertar nuevamente");
                }
                
                
            }catch(NumberFormatException e){
                
            }
        }while (opcion !=6);
    }
}
