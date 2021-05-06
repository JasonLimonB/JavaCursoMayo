package com.cursos.main.collectionss;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapAndTreeMap {
    public static void main(String[] args) {
        /*
        * HashMap-> Utiliza cunaod requieras de una coleccion que tenga pares llave -> valor, las llaves puedes contener null pero solo un elemento
        *
        * HashMap no permite llaves duplicadas
        *
        * El acceso a los datos se basa en el hashCode entre mejor sea la implemenracion de hashCode mejor sera el performance
        * */

        HashMap<String, String> disciconario = new HashMap<>();
        disciconario.put("Jason", "Nombre de la persoan que esta en curso");
        disciconario.put("Limon", "Apellido de la persoan que esta en curso");
        disciconario.put("Pumba", "Nombre de su mascota");
        disciconario.put(null, "Representa la ausencia de un objeto");
        disciconario.put("Pumba", "Es un Gato persa sin nariz y es mi mascota");
        System.out.println(disciconario);

        // Caso en que se rqpita una llave no la va ignorar si no que actualizará el valor

        System.out.println(Math.abs("Pumba".hashCode()%16));


        /*
        * TreeMap es una coleccion que igual que TreeSet tendra un orden ascendente natural pero aqui solo palicara a las llaves
        * */

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Jason", "Mi nombre");
        treeMap.put("Zanahoria", "Un pastel de zanahoria esta muy bueno");
        treeMap.put("Manzana", "Me gustan las manzanas");
        treeMap.put("Limon", "Los limones son saludables");
        treeMap.put("Ante","Bambi era de la familia de los antes");
        System.out.println(treeMap);

    }
}
