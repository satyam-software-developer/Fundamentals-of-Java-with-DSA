
//Java Tutorial: Exercise on Access Modifiers and Constructors
//        create a class cylinder and use getter and setters to set its radius and height
//        use ➊ to calculate surface and volume of the cylinder
//        Use a constructor and repeat ➊
//        Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
//        Repeat ➊ for a sphere




package com.satyam_java;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI  * radius * height;
    }
    public double volume(){
        return Math.PI  * radius*radius*height;
    }
}
 class Rectangele {
     private int length;
     private int breadth;

     public Rectangele() {
         this.length = 4;
         this.breadth = 5;
     }

     public Rectangele(int length, int breadth) {
         this.length = length;
         this.breadth = breadth;
     }

     public int getLength() {
         return length;
     }

     public void setLength(int length) {
         this.length = length;
     }

     public int getBreadth() {
         return breadth;
     }

     public void setBreadth(int breadth) {
         this.breadth = breadth;
     }
 }

public class sat_44_PS09 {

    public static void main(String[] args) {

//        Cylinder myCylinder = new Cylinder(9,12);
////        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
////        myCylinder.setRadius(9);
//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());

        Rectangele r = new Rectangele(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
