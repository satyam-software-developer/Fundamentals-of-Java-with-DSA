
//What will be the result of the following expression:
//        float a = 7/4 * 9/2
//        Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
//        Use comparison operators to find out whether a given number is greater than the user entered number or not.
//        Write the following expression in a java program:
//        (v^2-u^2)/2as
//        Find the value of 'a' in expression given below :
//        int x = 7
//        int a = 7*49/7 + 35/7

package com.satyam_java;

import java.util.Scanner;

public class sat_12_ps2_problems {

    public static void main(String[] args) {
        // problem 1
//        float a = 7/4.0f * 9/2.0f;
//        System.out.println(a);

        // problem 2
//        char grade = 'B';
//        grade = (char)(grade + 8);
//        System.out.println(grade);
//        // Decrypting the grade
//        grade = (char)(grade - 8);
//        System.out.println(grade);

        // problem 3
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);
        System.out.println(7*49/7+35/7);
    }

}
