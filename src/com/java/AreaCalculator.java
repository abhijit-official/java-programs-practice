package com.java;

public class AreaCalculator {
    public static void main(String[] args) {
        Shape sh = new Circle(3);
        Shape sh1 = new Square(3);

        
        Circle c = new Circle(2);
        Square s = new Square(3);

        System.out.println(c.area() + s.area());
    }
}
