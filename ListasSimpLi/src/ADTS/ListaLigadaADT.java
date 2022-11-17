/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTS;

import javax.sound.sampled.FloatControl;

/**
 *
 * @author emycr
 */
public class ListaLigadaADT<T> {

    private Nodo<T> head;
    private int tamanio;

    public ListaLigadaADT() {
    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public Nodo<T> getNodo() {
        return head;
    }

    public int getTamanio() {
        this.tamanio=0;
        Nodo<T> aux = head;
        while (aux != null) {
            aux = aux.getSiguiente();
            tamanio++;
        }
        return this.tamanio;
    }

    public void agregarAlFinal(T valor) {
        if (this.head == null) {
            head = new Nodo<>(valor);

        } else {
            Nodo<T> nuevo = new Nodo(valor);
            Nodo<T> aux = this.head;
            while ((aux.getSiguiente() != null)) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);

        }
    }

    public void agregarAlInicio(T valor) {
        if (head == null) {
            head = new Nodo(valor);
        } else {
            Nodo<T> nuevo = new Nodo(valor);
            nuevo.setSiguiente(head);
            head = nuevo;

        }
    }

    public void agregarDespuesDe(Nodo referencia, T valor) {
        Nodo nuevo;
        nuevo = new Nodo(valor);
        nuevo.setSiguiente(referencia.getSiguiente());
        referencia.setSiguiente(nuevo);

    }

    public void actualizar(Nodo referencia, T valor) {
        Nodo nuevo;
        nuevo = new Nodo(valor);
        nuevo.setSiguiente(referencia.getSiguiente());
        referencia.setDato(valor);

    }

    public Nodo buscarLista(Nodo destino) {
        Nodo indice;
        for (indice = head; indice != null; indice = indice.getSiguiente()) {
            if (destino == indice.getDato()) // (destino.equals(indice.dato))
            {
                return indice;
            }
        }
        return null;
    }

    public Nodo buscarPosicion(int posicion) {
        Nodo indice;
        Nodo aux;
        int i;
        if (posicion < 0) // posición ha de ser mayor que 0
        {
            return null;
        }
        indice = head;
        aux = head;
        for (i = 1; (i < posicion) && (indice != null); i++) {
            indice = indice.getSiguiente();
        }
        indice.setDato(null);
        aux.setSiguiente(indice.getSiguiente());

        return aux;
    }

    public void eliminar(int posicion) throws NullPointerException {
        ListaLigadaADT aux = this;
        aux.buscarPosicion(posicion);

    }

    public void eliminarElPrimero() {
        if (estaVacia()) {
            System.out.println("No contiene nada esta lista");
        } else {
            Nodo<T> aux = new Nodo();
            aux = head.getSiguiente();
            head = aux;

        }
    }

    public void eliminarElFinal() {
        if (estaVacia()) {
            System.out.println("No hay elementos a eliminar");
        } else {
            Nodo aux = this.head;
            Nodo nuevo = head;
            while ((aux.getSiguiente() != null)) {
                aux = aux.getSiguiente();

            }

            aux.setDato(null);
            aux.setSiguiente(null);

        }

    }

    public int buscar(T valor) {
        int i = 1;
        Nodo<T> aux = this.head;
        while (aux.getDato() != valor) {
            aux = aux.getSiguiente();
            aux.getDato();
            i++;
        }

        // System.out.print("\nLa posición de " + valor + " es: ");
        return i;
    }

    public void transversal() {
        Nodo<T> aux = head;
        Nodo<T> nuevo = head;
        Object t = head.getDato();
        while (aux != null) {
            System.out.print(aux);
            aux = aux.getSiguiente();

        }
        System.out.println("");
    }
}
