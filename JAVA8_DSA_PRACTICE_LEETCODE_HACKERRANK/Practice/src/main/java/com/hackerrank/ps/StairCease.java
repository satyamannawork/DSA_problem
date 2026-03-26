package com.hackerrank.ps;

public class StairCease {


    public static void main(String[] args) {

        int n =  7 ;


        for (int line = 0 ; line <  n  ; line ++) {

            for (int space = n  ;  space > line  ;  space--) {
                System.out.print(" ");

            }
            for (int print  =0  ;  print <  line ; print ++) {
                System.out.print("#");
            }

            System.out.println("");

        }


    }
}
