package com.day2;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        String s = "radar";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
           rev = rev + s.charAt(i);
        if (s.equals(rev))
                System.out.println("String is a palindrome  ");
           else
               System.out.println("String is not a palindrome ");
        }
    }