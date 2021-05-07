package com.cursos.main.mystreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreams {
    public static void main(String[] args) {
        /*
        * Para poder trabajar con streams es necesario usar colecciones como lo son ArrayList, LindekList, Maps, Set, etc
        * */
        List<String> nombres = new ArrayList<>(20);
        nombres.add("Pedro");
        nombres.add("Jair");
        nombres.add("Jose");
        nombres.add("Juan");
        nombres.add("Andrea");
        nombres.add("Perla");
        nombres.add("Edgar");
        nombres.add("Diana");
        nombres.add("Sonia");
        nombres.add("Elizabeth");
        nombres.add("Fernanda");
        nombres.add("Eduardo");
        nombres.add("Mauricio");
        nombres.add("Fulanito");
        nombres.add("Pancrasio");
        nombres.add("Pancho");
        nombres.add("Zara");
        nombres.add("Giovani");
        nombres.add("Limon");
        nombres.add("Jason");

        // Aqui vamos a ustar stream solo para mostrar el contenido de nuestra arreglo de nombres pero de una manera ordenada
        nombres.stream().sorted().forEach(System.out::println);
        System.out.println("*************************");

        // Ahora usando streams podemos hacer un filtro esta funcion de filtrar recibe una funcion anonima mas conocida como lambda buscaremos a los que inician con J
        nombres.stream().filter(dato -> dato.startsWith("J")).forEach(System.out::println);
        System.out.println("*************************");


        // Ahora vamos realizar de un stream para poder pasarlos a  mayusulas a todos nuestros nombres
        nombres.stream().map(dato -> dato.toUpperCase()).forEach(System.out::println);

        // Podemos reducir el codigo anterior de la siguiente manerea
        // nombres.stream().map(String::toUpperCase).forEach(System.out::println);

        // Ahora vamos a realizar un filtro mas para que que nos busque los nombres que inicien con la letra E y los guarde en un nuevo arreglo
        System.out.println("*************************");
        List nombresFiltered = nombres.stream().filter(name -> name.startsWith("E")).collect(Collectors.toList());
        System.out.println(nombresFiltered);

    }
}
