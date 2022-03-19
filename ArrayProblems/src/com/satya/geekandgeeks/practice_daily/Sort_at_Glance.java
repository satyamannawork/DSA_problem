package com.satya.geekandgeeks.practice_daily;

public class Sort_at_Glance {

	
	/*
	 ASECDEING order 
	 */
	
	 public static void main(String[] args) {
		int[] arr = {10,20,4,2,56};
		int  shiftCount = 2;
//		for(int count=0;count<shiftCount ; ) {
//			for( int i =0 ; i< (arr.length  - 1); i++) {
//				int  temp = arr[i+1]; 
//				arr[i+1] = arr[i];
//				arr[i] =  temp;  
//				
//				
//			}
//			count ++;
//		}
		
		// bubble  sort worst time complexity is O(n^2) , best is O(n)
		for(int i =0  ;i< arr.length ; i++) {
			for(int j =0  ;j< arr.length -1  ; j++) {
				if(arr[j]  >  arr[j+1]  ) {
					int temp  = arr[j+1];
					arr[j+1] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
		
		//  selection sort  time complexity is O(n^2) best - worst both
		for(int i =0 ; i< arr.length ;i++) {
			for(int  j =0 ; j< arr.length ; j++) {
				if(arr[i] < arr[j] ) {
					int  temp =  arr[i] ;
					arr[i] =  arr[j] ;
					arr[j]  = temp ;
				}
			}
		}
		// insertion sort time complexity is O(n^2) best - worst both
		for(int  i =0 ; i< arr.length ; i++) {
			for(int j =0 ; j < i ; j ++) {
				if(arr[i] < arr[j] ) {
					int  temp =  arr[i] ;
					arr[i] =  arr[j] ;
					arr[j]  = temp ;
				}
			}
		}
		
		
		
		for(int a_: arr) {
			System.out.print(a_+" ");
		}
			
		
	}
}
