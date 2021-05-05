package com.cursos.main.oop.polymorphism;

public class Square extends Figure{
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
