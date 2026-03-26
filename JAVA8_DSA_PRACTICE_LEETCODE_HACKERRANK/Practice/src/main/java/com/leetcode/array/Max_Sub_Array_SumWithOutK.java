package com.leetcode.array;

public class Max_Sub_Array_SumWithOutK {
//. if we see the sum of number or number itseelf is geater than target we are just skiping it
// and increasing the left -- main moto for non-negative

    public static void main(String[] args) {
        int[]  arr =  {-2,-3} ;

        System.out.printf("Maximum subarray sum" + getMaximumSubarraySum(arr));
    }


    public static int getMaximumSubarraySum(int[]  arr) {

        int sum  = 0;
        int max  = Integer.MIN_VALUE ;
        for (int i =0  ;  i< arr.length  ;  i++) {

            sum  =  sum +arr[i] ;
            max  =  Math.max(sum , max ) ;
            if (sum < 0) {
                sum  = 0  ;
            }

        }


        return  max ;
    }
}
