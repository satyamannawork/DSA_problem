package com.satya.leetcode;

import java.math.BigDecimal;
import java.util.*;
public class Binary {
    public int search(int[] nums, int target ) {
      // return bisearch(nums, target , 0 , (nums.length-1));
    	
    	//  this is below leetcode solution
    	int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
          pivot = left + (right - left) / 2;
          if (nums[pivot] == target) return pivot;
          if (target < nums[pivot]) right = pivot - 1;
          else left = pivot + 1;
        }
        //Double d = new D
        return -1;
    }
    
    
    public static int bisearch(int[] nums, int target , int start , int end) {
        int flag = - 1 ;
    	int mid  =  (start + ( end - start ) ) /  2 ;
        if(nums[mid] == target ) {
        	flag = mid  ;
        }
         if (target > nums[mid] ) {
        	 flag =bisearch(nums,target,mid+1,end) ;
        }
         if (target < nums[mid]) {
        	 flag =bisearch(nums,target,start,mid-1) ;
        }
        return flag;
       
    }
    
    
    
    public static  int[] sortArray(int [] arr ) {
        
       // List list =  Arrays.asList(arr) ;
        List<Integer> list = new ArrayList<Integer>(arr.length);
            for (int i : arr)
            {
                list.add(i);
            }
        Collections.sort(list) ;
        int[] arr1 =  new int[arr.length] ;
        for(int i  = 0 ; i<  list.size() ; i++) {
            arr1[i] =  list.get(i) ;
        }
        return arr1 ;
    }
    
    public static void main(String[] argv) {
        
        int[]  arr ={-1,0,3,5,9,12}  ;
         arr=sortArray(arr) ;
        Binary s = new Binary();
        System.out.println(s.search(arr, 9 ));
        
    }
}