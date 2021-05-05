package com.cursos.main.polymorphism.cars;

public class Charger extends Automovil implements IManejable{

    public Charger(int numPuertas, String modelo, String marca, String color) {
        super(numPuertas, modelo, marca, color);
    }

    @Override
    public void acelerar() {
        System.out.println("Soy un charger y estoy acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un charger y estoy frenando");
    }
}
