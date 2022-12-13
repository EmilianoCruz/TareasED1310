/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.ico.proyecto;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author emycr
 */
public class LinkedHashMapADT {

    public static void main(String[] args) {
        //Contructores
        LinkedHashMap<Integer, String> mp = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> mp2 = new LinkedHashMap<>(14); //Capacidad inical de 14

        //Método .put() agrega elementos
        mp.put(1, "Canada");
        mp.put(3, "México");
        mp.put(2, "España");
        mp.put(5, "Brasil");
        mp.put(4, "Portugal");

        System.out.println("Estado incial del mapa:\n" + mp);

        //Recorriendo el mapa
        for (Map.Entry m : mp.entrySet()) {
            System.out.println("|Llave: " + m.getKey() + "|| Valor: " + m.getValue() + "|");
        }

        //Método .get() regresa el valor a la llave asociada 
        System.out.println("Valor asociado por la llave 3: " + mp.get(3));

        //Método .ketSet regresa un set de las llaves contenidas en el LinkedHashMap
        Set i = mp.keySet();
        System.out.println("Llaves del LinkedHashMap: " + mp.keySet());

        //Método .remove() elimina el elemento asignado a la clave especificada
        mp.remove(1);
        System.out.println("Elinando Canada : " + mp);

        //Clonando el LinkedHashMap
        Object mp3 = mp.clone();
        System.out.println("Clonando el LinkedHashMap: " + mp3);

        //Método containsValue() regresa un booleano que indica si contiene el elemento
        System.out.println("¿Contiene el elemento España? " + mp.containsValue("España"));

        //Reemplazamos un elemento por otro con el método .replace
        mp.replace(2, "Alemania");
        System.out.println("Reemplazando el elemento con llave"
                + " 2 por Alemania: \n" + mp);

        //Tamaño del LinkedHashMap por .size() 
        System.out.println("Tamaño del LinkedHashMap:" + mp.size());
        
        //Limpiando el LinkedHashMap
        mp.clear();
        System.out.println("LinkedHashMap: " + mp);  
    }
}
