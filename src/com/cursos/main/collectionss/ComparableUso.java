package com.cursos.main.collectionss;

import java.util.TreeSet;

class Perro implements Comparable<Perro>{
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro [nombre="+nombre+"]";
    }

    @Override
    public int compareTo(Perro p) {
        return nombre.compareTo(p.getNombre());
    }
}

public class ComparableUso {
    public static void main(String[] args) {

        /*
        * Para este ejemplo de comparale usaremos una clase perro para agregar un nombre nada mas.
        * Comparable y comparator es utilizado para definir el orden en colecciones como TreeSet y TreeMap.
        * Tenemos la utilizacion de Genericos en esta seccion.
        * Cuando creamos el objecto e implementamos la interfaz comparable debemos de definir con que lo vamos a comparar
        * en este caso pequeño solo fue con el nombre.
        * */

        TreeSet<Perro> perros = new TreeSet<>();
        perros.add(new Perro("Zhabelita"));
        perros.add(new Perro("Pumba"));
        perros.add(new Perro("Rocky"));
        perros.add(new Perro("Rufo"));

        System.out.println(perros);

    }
}
