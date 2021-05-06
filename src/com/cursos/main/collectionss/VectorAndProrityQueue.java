package com.cursos.main.collectionss;

import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class VectorAndProrityQueue {
    public static void main(String[] args) {
        /*
        * Vector es un HashTable, son colecciones iniciales agregadas en la version 1.2, su comportamineto es similar al de un ArrayList
        * a diferencia que un Vector es un thread safe. Implementa una Lista
        * */

        Vector<String> vec = new Vector<>();
        vec.add("Jason");
        vec.add("Limon");
        vec.add("Giovani");
        vec.add("Benito");
        System.out.println(vec);
        vec.stream().sorted().forEach(System.out::println);

        /*
        * PriorityQueue, agregada desde java 5 como LinkedList soporta el comportamiento de una estructura FIFO, PriorityQueue ordena
        * los elementos de acuerdo a una prioridad, de este modo podemos acceder primero a los elementos que tienen una mayor prioridad
        * */
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1000);
        q.add(200);
        q.add(5);
        q.add(100);
        System.out.println(q);
        // Como podemos observar al imprimir nuestra PriorityQueue nos ordena nuestros datos en orden natural -> [5 100 200 1000]


        /*
        * HashSet es una coleccion que usaremos cuando necesitamos evitar los elementos duplicados y no importe el orden de los datos
        * */

        /*
        * TreeSet es una collecion ordenada e implemenra una estrustura de arbol rojo-negro que garantiza que los elementosseran unicos y estaran
        * ordenados de froma ascendente en un orden natural
        * */
        TreeSet<String> tree = new TreeSet<>();
        tree.add("ChicoZapote");
        tree.add("Gallina");
        tree.add("Avestrus");
        tree.add("Zorro");
        System.out.println(tree);
    }
}
