package com.satya.array.basic;

public class BinarySearch {

	
	public static void main(String[] args) {
		int[]  arr = {10,20,30,80,90} ;  
		BinarySearch binarySearch  = new BinarySearch();
		System.out.println("Serach Element is at " + ( binarySearch.binarySearch(arr, 0, arr.length-1, 80 ) + 1 ) + " Position");
		
		
		
		
		
	}
	
	
	public int binarySearch(int[] arr ,  int start , int  end  ,int searchElement) {
		int flag =-1;
	    if(end >= start ) {
	    	int  mid = (end - start)/ 2 ;
			if(searchElement == arr[mid])  {
				flag=mid ;
			}
			else if(searchElement >  arr[mid] ) {
				flag = binarySearch(arr, mid +1 ,end, searchElement);  
			}
			else  {
				flag= binarySearch(arr, start , mid -1  , searchElement);
			}
			
	    }
		
		return flag;
		
		
	}
}
