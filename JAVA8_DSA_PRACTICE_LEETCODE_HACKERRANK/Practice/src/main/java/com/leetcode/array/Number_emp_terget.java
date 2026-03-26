package com.leetcode.array;

import java.util.Arrays;

public class Number_emp_terget {


    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4} ;
        int target =  2 ;
        long a =Arrays.stream(hours).filter( p->  p>= target).count();
        System.out.println(a);
    }


}
