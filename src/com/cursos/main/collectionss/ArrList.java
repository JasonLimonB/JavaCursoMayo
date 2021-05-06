package com.cursos.main.collectionss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        /*
        * ArrayList Coleccion basada en arreglos que pueden crecer, cuando es instanciada, tiene capacidad de 10 elementos por defecto
        * Nota: 1.- Tiene la velicidad constante al agregar  obetener los elementos
        * Nota: 2.- No es eficiente cuando se tiene que agregar en una posicion especfica o remover un elemento
        * */
        List<String> arr = new ArrayList<>();
        arr.add("Jason");
        arr.add("Giovani");
        arr.add("Limon");
        arr.add("Benito");
        arr.add("Joshua");
        System.out.println(arr);
        arr.stream().sorted().forEach(System.out::println);


        /*
         * LinkedList Es una implementacion de una lista doblemente enlazad, superformance es mejor a un ArrayList cuando se tiene que agregar
         * o remover un elemento, pero es peor cuando se requiere obtener modificar un elemento.
         * Nota: 1.- Implementa tambien la interfaz Queue asi que puede utilizar al mismo tiempo como una estructura FIFO y usar metdos definidos para una Queue
         * Nota: 2.- Podemos usar los metodos de la Queue cuando la instanciamos LinkedList y no List
         */
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Pedro");
        linked.add("Jose");
        linked.add("Antonio");
        linked.add("Morrison");
        System.out.println(linked);
        System.out.println(linked.poll());
        System.out.println(linked);

        linked.stream().sorted().forEach(System.out::println);
    }
}
