package com.cursos.main.polymorphism.cars;

public class Automovil{

    private int numPuertas;
    private String modelo;
    private String marca;
    private String color;

    public Automovil(int numPuertas, String modelo, String marca, String color) {
        this.numPuertas = numPuertas;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
}