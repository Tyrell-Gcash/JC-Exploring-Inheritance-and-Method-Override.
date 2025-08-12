package org.example;

public class Exercise1 {

}

class Vehicle {
    protected String brand = "Generic Vehicle";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Child class
class Car extends Vehicle {
    private String modelName = "Mustang";

    public void display() {
        System.out.println("I am a " + brand + " " + modelName);
    }
}

class Bicycle extends Vehicle {
    public void ringBell() {
        System.out.println("Ring ring!");
    }
}