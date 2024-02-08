package com.day2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        char operator;
        Double Number1,Number2,result;
        Scanner input=new Scanner(System.in);
        System.out.println("Choose an operator : +,-,*,or /");
        operator=input.next().charAt(0);
        System.out.println("Enter first number");
        Number1= input.nextDouble();
        System.out.println("Enter second number");
        Number2= input.nextDouble();
        switch(operator){
            case '+':
                result=Number1 + Number2;
                System.out.println(Number1 + "+" +Number2 +" =" +result);
                break;
            case '-':
                result=Number1 - Number2;
                System.out.println(Number1+ "-" +Number2+ "=" +result);
                break;
            case '*':
                result=Number1 * Number2;
                System.out.println(Number1 +"*" + Number2+ "="+result);
                break;
            case '/':
                result=Number1 / Number2;
                System.out.println(Number1 + "/" +Number2 + "=" +result);
                break;
            default :
                System.out.println("Invalid operator !");
                break;
        }
        input.close();
    }
}
