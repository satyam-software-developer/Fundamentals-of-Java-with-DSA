package com.day1;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=reader.nextInt();
        String evenOdd=(num % 2==0) ?  "even"  : "odd";
        System.out.println(num +  "is"  + evenOdd);
        }
    }