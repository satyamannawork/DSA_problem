package com.satya.array.basic;


public class MoveAllZero {

	public static void main(String[] args) {
		
		
		int[] arr  =   {0,1,1,0,0,1,0}  ; 
		MoveAllZero.moveAllZeroAttheEnd(arr)  ; 
		
	}
	
	
	static void moveAllZeroAttheEnd(int[] arr) {
		int[] brr  =  new int [arr.length]   ;
		int count =0  ;
		
		for ( int  i = 0 ; i <  arr.length    ;   i ++ ) { 
			
			if (arr[i]   >   0)  {
				
				brr[count ++ ]   =  arr [i]   ;
			}
		
		}
		
		
		while (count > arr.length )  { 
			brr[count ++ ]   =0 ;
			
		}
		
		for (int a  :  brr ) {
			
			System.out.print(a);
		}
		
	}
}


