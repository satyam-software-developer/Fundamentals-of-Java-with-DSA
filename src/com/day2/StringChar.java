package com.day2;

public class StringChar {
    public static void main(String[] args) {
        String s = "abracadabra";
        char a;
        char b;
        int i;
        int num = 0, num1 = 0;
        int temp;
        for (i = 0; i <= s.length() - 1; i++) {
            a = s.charAt(i);
            b = s.charAt(i);
            if (a == 'a') {
                num++;
            }
            else if (b == 'b') {
                num1++;
            }
        }
        System.out.println("output a :" + num);
        System.out.println("output b : " + num1);
    }
}