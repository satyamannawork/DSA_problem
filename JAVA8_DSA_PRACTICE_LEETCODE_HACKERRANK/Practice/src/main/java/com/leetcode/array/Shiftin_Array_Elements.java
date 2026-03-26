package com.leetcode.array;

import com.common.util.PrintArray;

public class Shiftin_Array_Elements {


    public static void main(String[] args) {
        int[] nums = {1,2,3,6} ;
        new PrintArray(shiftArray(nums));

    }
    /// right shift means reverse loop
    public static int[]  shiftArray(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        return arr;
    }
}
