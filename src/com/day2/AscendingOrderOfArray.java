package com.day2;

public class AscendingOrderOfArray {
    public static void main(String [] args){
        int a[] ={1,5,3,2 };
        int temp=0;
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                if(a[i]> a[j]){
                    temp=a[i];
                    a[i]= a[j];
                    a[j]=temp;
                }
            }
        }
for(int j=0; j<a.length; j++){
    System.out.println(" " + a[j] + " ");

}
    }
}
