package com.leetcode.array;

public class Arrange0_1_2 {


    public static void main(String[] args) {

    }

    static void   swap (int a , int b) {

        int temp =  a ;
        a = b ;
        b = temp ;

    }

    static int[] arrangeMent(int[] arr) {
        int low = 0, mid  =0  ;
        int high = arr.length -1 ;

        while (mid <=high) {

            if (arr[mid] ==0) {
                swap (arr[low] , arr[mid]) ;
                low ++ ;
                mid ++ ;
            }

            if (arr[mid] ==1) {
                mid ++ ;
            }
            if (arr[mid] ==2) {
             swap (arr[mid] , arr[high]) ;
             high -- ;
            }


        }

        return arr ;

    }

    public static class SecondMax {

        public static void main(String[] args) {
            int[] height = { 1,8,6,2,5,4,8,3,7 } ;
            //int[] height = { 1,1 } ;

            int maxi = Integer.MIN_VALUE;
            int secondmaxi = maxi ;
            int width = 1 ;

            for (int i =0 ; i<  height.length ;  i++) {

                if (height[i] > maxi) {
                    secondmaxi = maxi ;
                    maxi = height [i] ;
                    width = i ;
                }
                if (height[i] >=  secondmaxi && height[i] < maxi)  {
                    secondmaxi = height[i] ;
                    width = i ;
                }
                if (height[i] == maxi  && i == (height.length-1)){
                    secondmaxi = maxi ;
                    width = height.length;
                }

            }


            if (secondmaxi ==  Integer.MIN_VALUE) {
                secondmaxi = maxi ;
                width = height.length;
            }

            int a = secondmaxi * (width -1);
            System.out.println(a);

        }


    }
}
