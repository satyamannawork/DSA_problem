package com.leetcode.array;

public class Maximum_sum_subarray_slidingwindow {

    public static  int getMaximumSum(int []  arr ,  int k) {

        int start = 0 ;
        int end  = 0 ;
        int sum  =  0 ;
        int maxSum = Integer.MIN_VALUE ;
        while ( end <  arr.length) {
            if ( ( end - start+1 )  <  k) {
                sum =  sum + arr[end] ;
                end++ ;
            }
            else if ( ( end - start+1 ) == k) {
                sum =  sum + arr[end] ;
                maxSum = Math.max(maxSum ,  sum) ;
                sum  =  sum  - arr[start] ;
                start ++ ;
                end++;

            }
        }
        return  maxSum;

    }

    public static void main(String[] args) {
        int[]  arr = {2,5,1,8,2,9,1} ;

        System.out.println(getMaximumSum(arr,  3));;

    }


    /// alternate solution
    //O(n)
    void window(int[] arr,int n,int k){
        int max_sum=0;
        for(int i=0;i<k;i++){
            max_sum=max_sum+arr[i];
        }

        int sum=max_sum;
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
            max_sum=Math.max(max_sum,sum);
        }
        System.out.println("max sum is"+max_sum);

    }
}
