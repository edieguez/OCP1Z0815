package com.artemisa.polymorphism;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Square implements Shape {

    private final float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public Square copy() {
        return new Square(side);
    }
}
