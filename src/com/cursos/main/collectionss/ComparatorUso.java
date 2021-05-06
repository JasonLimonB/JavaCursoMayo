package com.cursos.main.collectionss;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Gato{
    private String nombre;
    private String apellido;

    public Gato(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Gato[nombre -> "+nombre+" Apellido -> "+apellido +"]";
    }
}

class OrdenarPorNombre implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}

class OrdenarPorApellido implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}

public class ComparatorUso {

    public static void main(String[] args) {
        /*
        * Esto es muy similar a como funciona comparable ya que es para realizar un ordenamiento dependiendo a que en un objeto
        * comparator su metodo a implementar recibe dos objetos a diferiencia de comparable que solo es uno.
        *
        * Vamos a crear dos clases para poder ordenar con respecto al nombre y al apellido.
        * */
        Set<Gato> gatitos = new TreeSet<>(new OrdenarPorApellido());
        gatitos.add(new Gato("Pumba", "Limon"));
        gatitos.add(new Gato("Hugo", "Zapata"));
        gatitos.add(new Gato("Philip", "Lennon"));
        gatitos.add(new Gato("Ozzy", "Page"));

        System.out.println(gatitos);
    }
}
