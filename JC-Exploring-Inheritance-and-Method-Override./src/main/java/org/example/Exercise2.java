package org.example;

public class Exercise2 {
}

// Abstract parent class
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();

    // Concrete method
    public String display() {
        return "The area is: " + area();
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius = 5.0;

    // Provide implementation for the abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length = 4.0;
    private double width = 6.0;

    // Provide implementation for the abstract method
    public double area() {
        return length * width;
    }
}