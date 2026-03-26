package com.leetcode.array;

import com.common.util.PrintArray;

import java.util.ArrayList;
import java.util.List;

public class Target_Array {


    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        //int j =0 ;
        for (int i =0 ; i< nums.length ;  i++) {
            int position =  index[i] ;
            int data = nums[i] ;
            for (int j = target.length -2  ; j >= position; j--) {
                target[j+1] = target[j] ;
            }
            target[position] =data ;

        }
        return target;

    }

    public static void main(String[] args) {
        Target_Array on = new Target_Array() ;
        int[] nums =  {0,1,2,3,4} ;
        int[] index =  {0,1,2,2,1} ;
        //0,4,1,3,2 -- ans

        List l = new ArrayList(2) ;
        l.add(0, 2);
        l.add(0, 3);
        System.out.println(l);

//       new  PrintArray(createTargetArray(nums,index)) ;
//        new  PrintArray(createTargetArray_efficiant(nums,index)) ;

    }

    public static int[] createTargetArray_efficiant(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = a.get(i);
        }
        return target;
    }
}


