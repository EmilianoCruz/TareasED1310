/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import ADT.HashTableADT;

/**
 *
 * @author emycr
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashTableADT<String> n = new HashTableADT<>(6);
        //System.out.println(2560%6);}
        System.out.println(n.toString());
        System.out.println("\nAgregando elementos a la tabla:");
        n.Add(2560, "13");
        n.Add(69, "123");
        n.Add(698, "124");
        n.Add(17896, "165");
        n.Add(1259, "157");
        n.Add(18, "104");
        n.Add(13, "112");
        System.out.println(n.toString());

        System.out.println("\nValor con llave 13: " + n.valueOf(13));
        System.out.println("\nEliminando el valor con la llave 13");
        n.remove(13);

        System.out.println("\n" + n.toString());

    }

}
