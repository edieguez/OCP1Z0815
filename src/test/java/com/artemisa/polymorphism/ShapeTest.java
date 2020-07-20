package com.artemisa.polymorphism;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import static org.junit.Assert.*;

@Log4j2
public class ShapeTest {

    @Test
    public void getArea() {
        Shape triangle = new Triangle(3, 2);
        assertEquals(6, triangle.getArea(), 0);

        Shape circle = new Circle(10);
        assertEquals(314, Math.floor(circle.getArea()), 0);

        Shape square = new Square(4);
        assertEquals(16, square.getArea(), 0);
    }

    @Test
    public void covariantReturnTypes() {
        final Triangle triangle = new Triangle(3, 2);
        final Triangle triangleCopy = triangle.copy();
        assertEquals(triangle, triangleCopy);

        final Circle circle = new Circle(10);
        final Circle circleCopy = circle.copy();
        assertEquals(circle, circleCopy);

        final Square square = new Square(4);
        final Square squareCopy = square.copy();
        assertEquals(square, squareCopy);
    }
}