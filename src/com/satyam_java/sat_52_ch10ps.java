//Create a class circle and use inheritance to create another class cylinder from it
//        Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
//        Create a method for area and volume in 1
//        create methods for area & volume in 2 also create getters and setters
//        What is the order of constructor execution for the following inheritance hierarchy
//        Base
//
//        Derived 1
//
//        Derived 2
//
//        Derived obj = new Derived 2( );
//        Which constructor(s) will be executed & in what order?



package com.satyam_java;

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class sat_52_ch10ps {
    public static void main(String[] args) {
        // Problem 1
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 4);
    }
}
