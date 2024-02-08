package com.day2;

public class StringChar2 {
    public static void main(String[] args){
        String s="satyam";
        System.out.println("Original String :" +s);
        String str=new String(s);
        String s1=str.replace('a' ,'z');
        System.out.println("after all replacement a with z :" +s1);

    }


}
