package com.day1;

public class Largest {
    public static void main(String[] args){
        double n1=-3.5 ,n2=4.8, n3=5.0;
        if(n1>=n2 && n1>=n3)
        System.out.println(n1 + " is the largest number:" );
        else if(n2>=n1 && n2>=n3)
            System.out.println(n2 + " is the largest number");
        else
            System.out.println(n3 + " is the largest number");
    }
}