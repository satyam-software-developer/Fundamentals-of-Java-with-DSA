
//Write a program to calculate the percentage of a given student in the CBSE board exam.
//His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

package com.satyam_java;

import java.util.Scanner;

public class sat_11_ex1_sol {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = scan.nextInt();

        float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);


    }
}
