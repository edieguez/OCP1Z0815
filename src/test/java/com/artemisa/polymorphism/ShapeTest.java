package com.artemisa.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {

    @Test
    public void getArea() {
        Shape circle = new Circle(10);
        assertEquals(314, Math.floor(circle.getArea()), 0);

        Shape triangle = new Triangle(3, 2);
        assertEquals(6, triangle.getArea(), 0);

        Shape square = new Square(4);
        assertEquals(16, square.getArea(), 0);
    }
}