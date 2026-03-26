package com.hackerrank.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Min_MaxSum {

    public static void main(String[] args) {
        //System.out.println( Math.min( 70 , 10));
        int[] arr =  {1,2,3,4,5} ;
       List<Integer> list  = new ArrayList<>() ;
       // long t  = list.stream().mapToInt(p->p.intValue()).sum() ;
       // 256741038 623958417 467905213 714532089 938071625
         //   exp : 2063136757 2744467344
        long[] arr_l = list.stream().map( Integer::longValue).mapToLong(p-> p).toArray() ;
        Arrays.sort(arr_l);
        int total =  0;
        int max = Integer.MIN_VALUE ;
        int min =  Integer.MAX_VALUE ;

        for (int a  :  arr) total += a ;

        for (int  i = 0 ;  i<  arr.length ;  i++){

            max =  Math.max( total -  arr[i] , max) ;
            min =  Math.min( total -  arr[i] , min) ;



        }

        System.out.println(min + " " +max );



    }


}
