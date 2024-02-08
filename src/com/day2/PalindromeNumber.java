package com.day2;

public class PalindromeNumber {
    public static void main(String[] args){
        int num=3553,reversedNum=0,remainder;
        int originalNum=num;
        while(num!=0){
            remainder= num%10;
            reversedNum=reversedNum*10+remainder;
            num=num/10;
        }
        if(originalNum==reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        }
            else {
                System.out.println(originalNum + "is not a palindrome.");

            }
        }
    }