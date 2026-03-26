package com.leetcode.array;

public class PutAllZerosAtEnd {

    public static void main(String[] args) {
        PutAllZerosAtEnd ob = new PutAllZerosAtEnd() ;
        int[] arr =  {1,2,0,4,0,3} ;
        for (int a :  ob.method(arr)) System.out.print(a);

    }
    public static   int[]  method (int[] arr) {
        int j=0 ;

        for (int i=0 ; i<  arr.length ; i++ ) {
            if (arr [i] >  0) {
                arr[j++] =arr[i] ;
            }
        }
        while (j <  arr.length) {
            arr[j++] =0 ;
        }
        return  arr ;

    }
}
