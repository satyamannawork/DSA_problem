package com.leetcode.array;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10,2,3,54,9} ;

        boolean  value  =BinarySearch.binarySearch(5400, arr) ;
        System.out.println( "value "+value);
    }



    static  boolean  binarySearch(int target ,  int[] arr) {
        Arrays.sort(arr);

        boolean returnType = false  ;
        int left  =0 ;
        int right =  arr.length -1 ;




        while (  left <=  right) {
            int mid = left +  (right - left) / 2;
            if (arr[mid] ==  target) {
                returnType =  true ;
                break ;
            }

            if(target <  arr[mid]) {
                right = mid -1  ;
            }
            if(target > arr[mid]) {
                left = mid + 1  ;
            }


        }


        return  returnType ;
    }



}
