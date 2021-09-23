package com.java;

public class Circle implements Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * this.radius * this.radius;
    }

    public double perimeter() {
        return 3.14 * 2 * this.radius;
    }
}
