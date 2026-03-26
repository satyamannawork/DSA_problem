package com.leetcode.array.twopointer;


import java.util.Arrays;

///   question :  Givene an array of integers return all trilets such as
/// a+b+c =0. and solution must not duplicate
/// if no such trplet found return empty array
/// Example :  [0,-1,2,-3,1] target == 0
/// output = [[-3,1,2],[-1,0,1]]
///
public class TripletSum {


    public static void main(String[] args) {

        int[] arr = {0,-1,2,-3,1} ;
        int target = 0 ;
         Arrays.sort(arr);
        for (int i = 0 ; i< arr.length ; i++) {
            String st = findPairOfSum(arr,i, target).toString();
            st  = st.split(",").length == 3 ? st :  "Nothing has been found " ;
            System.out.println(st);

        }

    }




   static StringBuilder findPairOfSum(int[] arr, int left ,  int target){
       int right = arr.length -1 ;

       StringBuilder st = new StringBuilder(String.valueOf(arr[left])).append(",");
        while (left < right){
            int sum = arr[right] + arr[left] ;
            if(target == sum) {
                st.append(arr[left]).append(",").append(arr[right]);
                break;
            }
            if(sum < target ) {
                left ++ ;
            }else {
                right -- ;
            }


        }
        return st ;

    }
}
