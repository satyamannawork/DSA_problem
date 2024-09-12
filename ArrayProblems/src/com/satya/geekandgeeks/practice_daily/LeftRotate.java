package com.satya.geekandgeeks.practice_daily;

public class LeftRotate {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5} ;
		for(int i=0; i < 2 ; i++){
			for(int  j =0 ;   j < arr.length -  1 ; j ++ ){
				int temp = arr[j+1] ; 
				arr[j+1] = arr[j] ; 
				arr[j] =  temp  ;
				
			}
		}
		
		for(int a_ : arr) {
			System.out.print(a_+" ");
		}
		
	}
	
}
