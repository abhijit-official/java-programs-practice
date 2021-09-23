package com.java;

public class Square implements Shape {
    public int length;

    public Square(int length) {
        this.length = length;
    }

    public double area() {
        return this.length * this.length;
    }

    public double perimeter() {
        return this.length * 4;
    }
}
