package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FirstNegetiveNumberinEverykWindowSize {


    public static void main(String[] args) {
        int windowSize  = 3 ;
        int[] nums = {1, -2, 3, -6,  -7 , -9, 3,4,-5} ;
        int start = 0 ;
        int end =  0  ;
        List<Integer>  list= new ArrayList<>() ;
        int i=0  ;
        while(end < nums.length) {

            if ( (end - start +1 ) < windowSize ){
                if (nums[end] < 0){
                    if(list.size() > 0) {
                        list.add(nums[end]);

                    }
                }
                //i++ ;
                end ++ ;

            }
            if((end - start + 1) == windowSize ) {


                if (nums[start] < 0){
                    list.add(nums[start]) ;
                }
                start++;
                end++;


            }

        }
        //Father :  69736579
        //Mother : 333284102023
        //Manashi : 69044037
        System.out.println(list);



    }

}
