package com.artemisa.polymorphism;

public class Square implements Shape {

    private final float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
