package com.satya.geekandgeeks.practice_daily;

public class BubbleSort_prac {

	
	 public static void main(String[] args) {
		
		 int[]  arr  = {10,5,1,74,12}  ; 
		 
		 
		 for(int i=0 ; i<  arr.length  ; i++) {
			 
			 for(int j=0  ; j <   ( arr.length  -1 ); j++  ) {
				 
				 if(arr[j] >  arr[j+1]) {
					 int temp  = arr[j+1] ;
					 arr[j+1] =  arr[j] ;
					 arr[j] =temp ;
				 }
				 
			 }
		 }
		 
		 for (int a :  arr ) {
			 System.out.println(a);
		 }
		 
	}
}
