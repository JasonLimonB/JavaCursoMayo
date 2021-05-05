package com.cursos.main;

import com.cursos.main.enumsss.Gender;
import com.cursos.main.enumsss.SaborPalomitas;
import com.cursos.main.statics.Humano;

public class Main {
    public static void main(String[] args) {

        SaborPalomitas sabor = SaborPalomitas.QUESO;
        System.out.println(sabor.name());
        System.out.println("Las palomitas de sabor "+sabor.getNombreVenta() +" cuestan " +sabor.getPrecio());
        Gender g = Gender.FAMELE;
        System.out.println(g.name());

        String human = Humano.getTotalBones();
        System.out.println(human);
    }
}
