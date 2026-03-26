package com.leetcode.array.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        List  list = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toList()) ;
        //List  list = Arrays.stream(nums).boxed().toList();-- another way
        int[] returnValue = new int[2];
        for (int i =0 ;i<nums.length ;  i++) {
            int  j =0 ;
            int a = target -  nums[i] ;
            int index = list.indexOf(a);
            index = Math.abs(index) ;
            if (list.contains(a) && index!=i ){

                returnValue[j++] =  i ;
                returnValue[j++] =  index;
                break;

            }

        }
        return returnValue ;
    }
    public int[] twoSum_2approch(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>() ;
        int[] returnValue = new int[2];
        for (int i =0  ; i<  nums.length ; i++) {
            if (map.containsKey(target - nums[i])  ){
                returnValue[0]=  map.get(target - nums[i]) ;
                returnValue[1] = i ;
            }else {
                map.put(nums[i] , i) ;
            }
        }
        return  nums;

    }


    public static void main(String[] args) {
        int[] arr  = {3,2,4} ;
        TwoSum  solution  = new TwoSum()  ;

        for (int  a :  solution.
                twoSum(arr,  6 )){
            System.out.println(a);
        }

    }


    //  better solution  using simple array
//    public int[] twoSum_efficient(int[] nums, int target) {
//
//        int n = nums.length;
//        int []ans = new int[2];
//
//        int i = 0;
//        int j = i+1;
//
//        while(i<j) {
//            if(nums[i]+nums[j]==target){
//                ans[0] = i;
//                ans[1] = j;
//                break;
//            } else if(j==n-1) {
//                i++;
//                j = i+1;
//            } else {
//                j++;
//            }
//        }
//        return ans;
//    }
}