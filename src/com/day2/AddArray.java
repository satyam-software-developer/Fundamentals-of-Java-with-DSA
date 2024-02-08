package com.day2;

import java.sql.SQLOutput;

public class AddArray {
    public static void main(String[] args) {
        int[] arr = {10, 15, 30, 37, 50};
        //    int[] arr = new int[]{10, 20, 30, 40, 50};
        int evenSum = 0,oddSum=0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + arr[i];
                i++;
            }
            if(i %2==1){
                oddSum=oddSum+arr[i];
                i++;
            }
        }

        System.out.println("array  of evenSum is " +evenSum );
        System.out.println("array of oddSum is " +oddSum);
    }
}