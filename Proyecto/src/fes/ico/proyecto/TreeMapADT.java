/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.ico.proyecto;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author emycr
 */
public class TreeMapADT {

    public static void main(String[] args) {
        //Constructor
        TreeMap<Integer, String> mp = new TreeMap<>();
        TreeMap<Integer, String> mp2 = new TreeMap<>();
        TreeMap mp3;
        
        //Estado actual del TreeMap
        System.out.println("Treemap: " + mp);

        //El método .put() agrega valores y ordena las claves
        mp.put(5, "Perro");
        mp.put(10, "Gato");
        mp.put(8, "Caballo");
        mp.put(15, "Pez");
        mp.put(2, "Tortuga");
        mp.put(1, "Toro");
        mp.put(9, "Iguana");
        mp.put(2, "Tortuga");//No agrega elementos repetidos

        System.out.println(mp);

        //Recorriendo el TreeMap
        System.out.println("\n Recorriendo el TreeMap");
        for (Map.Entry m : mp.entrySet()) {
            //Método .getkey obtienes la clave 
            //Método .getValue obtienes el valor
            System.out.println("|Clave: "+m.getKey() + " | Valor : " + m.getValue()+" |");
        }
        
        //Método .remove() elimina el valor con la clave asociada 
        mp.remove(15);
        System.out.println("\nElimando el pez: \n" +mp);
        
        //Método .replace() reempleza el valor asociado con la clave por un nuevo valor 
        mp.replace(10, "Vaca");
        System.out.println("\nReemplazando Gato por Vaca: \n"+mp);
        
        //Método .descendingMap() ordena el TreeMap en orden descendiente
        System.out.println("\nOrden descendiente: \n" + mp.descendingMap());
        
        //Método .headMap() regresa llave-valor que sea mayor a la clave asignada
        //segúun su orden
        System.out.println("\nHead Map de clave 10: "+ mp.headMap(10));
        
        //Método .tailMap() regresa llave-valor que se menor o igual a la clave especificada
        //según su orden
        System.out.println("\nTail Map de clave 5: "+ mp.tailMap(5));
        
        //Método .subMap() crea un submapa entre las claves especificadas
        System.out.println("\nCreando un submapa de la clave 1 a 10: \n"+mp.subMap(1, 10));
        
        //Clonando el mapa
        Object map; 
        map = mp.clone(); 
        System.out.println("\nConando el mapa: \n"+map);
        
        //Método .firstKey() regresa la primera llave
        System.out.println("Primera llave: "+ mp.firstKey());
        
        //Método .higherKey() regresa la llave siguiente a la llave especificada
        System.out.println("Llave mayor a 8: "+mp.higherKey(8));
        
        //Método .containsKey() y .containsValue() regresa si contiene el valor 
        //y la clave asignada 
        if (mp.containsKey(1)&& mp.containsValue("Toro")) {
            System.out.println("\nEl TreeMap contiene el valor Toro asociado a la llave 1");
        }else{
            System.out.println("\nEl TreeMap no contiene el valor Toro asociado a la llave 1");
        }
        //Método .get() regresa el elemento a la llave especificada 
        System.out.println("Elemento con clave 8: "+mp.get(8));
        //Limpiamos le TreeMap con el método clear() 
        mp.clear();
        System.out.println("\nLimpiando el mapa: "+mp);
    }

}
