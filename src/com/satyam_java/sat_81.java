//Handling Specific Exceptions in Java
//        Handling specific Exceptions
//        In java, we can handle specific exceptions by typing multiple catch blocks.
//
//        try (
//
//        // code
//
//        )
//
//        Catch (To Exception e) - Handle all Exceptions of type IO Exception
//
//        // code
//
//        )
//
//        Catch (Exception e) - Handle all Exceptions of type Arithmetic Exception
//
//        // code
//
//        )
//
//        Catch (Exception e) - Handle all other Exceptions
//
//        // code
//
//        )



package com.satyam_java;

import java.util.Scanner;

public class sat_81 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}

