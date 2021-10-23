package com.satya.geekandgeeks;

public class Find2ndHighest {

	public static void main(String[] args) {
		int[] arr = {1,5,4,0,-1};
		int first = 0,  second = 0 ;
		for(int  i =0 ; i< arr.length ;  i++) {
			if(arr[i] > first ) {
				second = first ; 
				first  = arr[i];
				//System.out.println(first +"==="+second);
			}
			else if (arr[i] > second) {
				second = arr[i];
			}
			
		}
		System.out.println(second);
	}
	
	
	
}
