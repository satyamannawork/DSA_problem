package com.satya.array.basic;

public class FindandRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {1,2,3,1,2} ;
		int[] arr1=  new int[arr.length];
		arr1[0]=arr[0];
		
		for(int i =0 ; i <  arr.length  ; i++) {
			arr1=FindandRemove.filterArray(arr1, arr[i]); 
		}
		
		for(int a :  arr1) {
			System.out.println(a);
		}
	}
	
	
	static int[] filterArray(int[] arr , int element) {
		
		int  count  =0 ;
		boolean flag  = true ; 
		for(  count =0 ; count<  arr.length  ;  count++) {
			if(element == arr[count]) {
				flag  =  false ;
				break;
			}
		}
		if(flag && count<arr.length ) arr[count++]  =  element;
		
		return arr;
	}

}
