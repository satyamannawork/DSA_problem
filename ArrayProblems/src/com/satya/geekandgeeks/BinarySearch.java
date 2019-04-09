package com.satya.geekandgeeks;

public class BinarySearch {

	
	public static void main(String[] args) {
		int[]  arr = {10,20,30,80,90} ;  
		BinarySearch binarySearch  = new BinarySearch();
		System.out.println(binarySearch.binarySearch(arr, 0, arr.length-1, 80));; 
		
		
		
		
	}
	
	
	public int binarySearch(int[] arr ,  int start , int  end  ,int searchElement) {
		int flag =-1;
	    if(end >= start ) {
	    	int  mid = start + end / 2 ;
			if(searchElement== arr[mid])   flag=mid ;
			if(searchElement >  arr[mid] ) flag= binarySearch(arr, start, mid -1  , searchElement);
			flag= binarySearch(arr, mid+1, end , searchElement); // 3 5
	    }
		
		return flag;
		
		
	}
}
