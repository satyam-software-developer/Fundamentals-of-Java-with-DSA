
//Chapter 1 – Practice Set
//        Write a program to sum three numbers in Java.
//        Write a program to calculate CGPA using marks of three subjects (out of 100)
//        Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
//        Write a Java program to convert Kilometers to miles.
//        Write a Java program to detect whether a number entered by the user is an integer or not.


package com.satyam_java;

import java.util.Scanner;

public class sat_Ch1_PS {

    public static void main(String[] args) {
//        Question1
//        int a = 4;
//        int b = 17;
//        int c =6;
//        int sum = a + b+c;
//        System.out.println(sum);

//        Question2
//    float subject1 = 45;
//    float subject2 = 95;
//    float subject3 = 48;
//    float cgpa = (subject1 + subject2 +subject3)/30;
//    System.out.println(cgpa);

//        Question 3
//        System.out.println("What is your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " + name + " have a good day!");

//        Question 5
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }

    public static class CWH_04_literals {
        public static void main(String[] args) {
            byte age = 34;
            int age2 = 56;
            short age3 = 87;
            long ageDino = 5666666666666L;
            char ch = 'A';
            float f1 = 5.6f;
            double d1 = 4.66;

            boolean a = true;
            System.out.print(age);
            String str = "Harry";
            System.out.println(str);

        }

    }
}
