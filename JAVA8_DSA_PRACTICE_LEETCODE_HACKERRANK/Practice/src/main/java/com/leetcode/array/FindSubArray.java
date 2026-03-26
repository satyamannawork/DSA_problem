package com.leetcode.array;

public class FindSubArray {


    public static void main(String[] args) {
        int[]  arr = {1,2,3}  ;
        getSubArray(arr);
    }


    // complexity is on3
    static void  getSubArray(int[]  arr) {


        for (int i = 0  ; i<  arr.length  ;  i ++) {

            for (int j =i ; j<  arr.length  ;  j ++) {

                for (int k  =i  ; k<  j ;  k++) {

                    System.out.print(" "+arr[k]);
                }
                System.out.print(" "+arr[j]);
                System.out.println(" ");
            }

        }

    }
}
