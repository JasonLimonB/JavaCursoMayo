package com.cursos.main.oop.polymorphism;

public class Circle extends Figure{
    private double radio;

    public Circle(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radio, 2);
    }
}
