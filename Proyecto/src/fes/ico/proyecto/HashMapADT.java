/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fes.ico.proyecto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author emycr
 */
public class HashMapADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HashMap
        //Formas de inicializar un HashMap
        HashMap<Integer, String> mp = new HashMap(16);//Un HashMap fuertemente tipado
        Map mp2 = new HashMap(16);//Mapa inicial vacío de capacidad incial de 16
        HashMap mp3;
        mp3 = new HashMap();

        //Imprimimos el estado actual del mapa}
        System.out.println("Hashmap --> " + mp);

        //Agregamos elementos con el método .put()
        mp.put(154789, "Emiliano");
        mp.put(157898, "Romina");
        mp.put(189741, "Helué");
        mp.put(179594, null);//Puede almacenar nulos

        System.out.println("Agregamos elementos: \n" + mp);

        //Obetenemos las llaves con el método .keySet()
        System.out.println("\nLlaves del HashMap:\n" + mp.keySet());

        //Obtenemos los valores con el método .values()
        System.out.println("\nValores del HashMap: \n" + mp.values());

        //Eliminamos elementos con el método .remove()
        mp.remove(154789);
        System.out.println("\nEliminamos un elemento\n" + mp);
        //Comprobamos si el elemento a eleminar es el mismo al requerido
        System.out.println("El elemento a eliminar asociado a la clave 189741 es"
                + " Emiliano: " + mp.remove(189741, "Emiliano"));

        //Obtenemos el elemento con el método .get()
        System.out.println("\nElemento con la clave 189741 es: " + mp.get(189741));

        //Con el método .containsValue() preguntamos si contiene el elementos especificado
        System.out.println("¿El hashmap contiene a Jose? " + mp.containsValue("Jose"));

        //Con el método .containsKey() preguntamos si contiende la llave especificada
        System.out.println("¿El HashMap contiene la llave 189741? " + mp.containsKey(189741));
        System.out.println("\nEstado de HashMap: "+mp);
        //Para recorrer el HashMap se necesita un iterar
        System.out.println("\nRecorriendo el mapa con un iterador de llaves: ");
        Set cv;
        cv = mp.keySet();
        Iterator iterador = cv.iterator();
        while (iterador.hasNext()) {
            Object clave;
            clave = iterador.next();
            System.out.println("|clave: " + clave + "| |Elemetento asociado: " + mp.get(clave) + "|");
        }
        
        //Se puede clonar el HasMap con el método .clone()
        mp3 = (HashMap) mp.clone();
        System.out.println("\nClonando el HashMap: \n"+ mp3);
        
        //Se reemplaza un elemento con el método .replace() 
        mp.replace(179594, "Jose Antonio"); 
        System.out.println("\nReemplazando null por un elemento: "+mp);
        
        //Consultamos si se encuentra vacia con el método .isEmpty()
        //y su tamaño con el método .size()
        
        System.out.println("¿El HashMap está vació? "+mp.isEmpty()
                            +"\nTamaño del HashMap: "+mp.size());
        
        //Se limpia el HashMap con el método .clear()
        mp.clear();
        System.out.println("Limpiando el HashMap: "+mp);

    }

}
