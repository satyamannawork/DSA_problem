package com.hackerrank.ps;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Note  :  Big decimal behaviour .setScale , rounduo
if round up is not present we can get
java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.

 */
public class Count_Fraction_count {


    public static void main(String[] args) {


        int[] arr = {1,1,0,-1,-1} ;
        //List<Integer> list = Stream.of(arr).mapToInt( p-> Integer::parseIn;
        //plusMinus(Stream.of(arr).mapToInt(p-> Integer.valueOf(p.toString())));
        List<Integer> list = new ArrayList<>() ;
        list.add(1) ;
        list.add(1) ;
        list.add(0) ;
        list.add(-1) ;
        list.add(-1) ;
        plusMinus(list);


    }


    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        long positive =arr.stream().filter( p-> p.intValue()>0).count();
        long negetive = arr.stream().filter( p-> p.intValue()<0).count();
        long zero =
                arr.stream().filter( p-> p.intValue()== 0).count();
//        Double  positive_d  = (double) positive;
//        Double  negetive_d  = (double) negetive;
//        Double  zero_d  = (double) zero;
//        Double arr_size =  (double)arr.size() ;
//        Double positiveBig = positive_d /arr_size ;
//        Double negetiveBig = negetive_d / arr_size ;
//        Double zeroBig =  zero_d / arr_size ;


        BigDecimal positiveBig  = new BigDecimal(positive) ;
        positiveBig=positiveBig.divide(new BigDecimal(arr.size()) ,6, RoundingMode.HALF_UP).setScale(6) ;
        BigDecimal negetiveBig  = new BigDecimal(negetive) ;
        negetiveBig=negetiveBig.divide(new BigDecimal(arr.size()) ,6, RoundingMode.HALF_UP).setScale(6) ;
        BigDecimal zeroBig  = new BigDecimal(zero) ;
        zeroBig=zeroBig.divide(new BigDecimal(arr.size()) ,6, RoundingMode.HALF_UP).setScale(6) ;

        System.out.println( positiveBig );
        System.out.println( negetiveBig);
        System.out.println( zeroBig );


    }
}
