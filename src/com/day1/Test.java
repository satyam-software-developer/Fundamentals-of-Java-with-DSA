package com.day1;

import java.util.Scanner;

public class Test {

    public static  void arrange(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        int counter = 1;

        while (left <= right) {
            if (counter % 2 == 1) {
                arr[left] = counter;
                counter += 1;
                left += 1;

            } else {
                arr[right] = counter;
                counter += 1;
                right -= 1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t >0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            arrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");

            }
            System.out.println();
            t -= 1;

        }

    }
}

