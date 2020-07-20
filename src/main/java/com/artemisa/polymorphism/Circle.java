package com.artemisa.polymorphism;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Circle implements Shape {

    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Circle copy() {
        return new Circle(radius);
    }
}
