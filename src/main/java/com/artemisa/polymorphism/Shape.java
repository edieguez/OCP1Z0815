package com.artemisa.polymorphism;

public interface Shape {
    /**
     * Calculate shape's area
     * @return Shape's area
     */
    double getArea();

    Shape copy();
}
