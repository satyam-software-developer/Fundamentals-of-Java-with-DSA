package com.satyam_java;

public class Circle {
    public int radius;

    public Circle() {
        System.out.println("I am non param of circle");
    }

    Circle(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
