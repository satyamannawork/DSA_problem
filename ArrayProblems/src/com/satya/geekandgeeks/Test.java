package com.satya.geekandgeeks;

public class Test {

	
	
	   public static void main(String[] args) {
		int[]  arr  = {10,15,2,6,7,8};
		/*int i;
		for( i=0 ;i<arr.length -1 ; i++){
			if(arr[i] >  arr[i+1]) break ;
		}
		
		System.out.println("i is  "+i);
		System.out.println("max element is"+arr[i+1]);*/
		
		
		int left  = 0   ; 
		int right  =  arr.length  - 1 ;
		while(arr[left]   >  arr[right]){
			int mid = left +    (left  +right) /  2;
			if(arr[mid] >  arr[right]){
				left  = mid+1 ; 
			}
			else {
				right = mid  ;
			}
			
			
		}
		
		System.out.println("left is  "+left);
	}
}
