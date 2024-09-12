package com.satya.geekandgeeks.practice_daily;



public class FindPairOfSumInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {6,7,2,3,4,5};
		int  i  =0 , l = 0, r = 0 ,  sum   = 7;
		
		for( i =0 ; i <  arr.length -1 ; i ++ ){
			if(arr[i]  > arr [i+1]){
				break;
			}
		}
		
		l   =   (i+1 ) % arr.length ;
		r   = i % arr.length; 
		while(l!=r){
			if(arr[l] + arr[r] ==sum){
				System.out.println("here"+arr[l]+"== "+arr[r]);
				break;
			}
			if(arr[l]+arr[r] <  sum) {
				l =  ( l + 1 ) % arr.length  ;    
			}
			else if(arr[l]+arr[r] >  sum) {
				r=  (arr.length   + r  - 1  ) %  arr.length   ;     
			}
			
			
		}
	}
	
}
