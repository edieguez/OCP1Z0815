package com.artemisa.polymorphism;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Triangle implements Shape {

    private final float sideA;
    private final float sideB;

    public Triangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public Triangle copy() {
        return new Triangle(this.sideA, this.sideB);
    }
}
