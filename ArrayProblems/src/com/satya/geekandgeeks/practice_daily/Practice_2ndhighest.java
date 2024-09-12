package com.satya.geekandgeeks.practice_daily;

public class Practice_2ndhighest {

	public static void main(String[] args) {
	     int[] arr = {4,5,6,1,7,9} ;
	     int temp = arr[0] ;
	     int temp1 =temp ; 
	     for(int i = 0  ; i <  arr.length  ; i++){
	    	 if(arr[i] >  temp )    {
	    		 temp1=temp;
	    		 temp =arr[i] ;
	    	 }
	    	 if(arr[i]!=temp  && arr[i] > temp1){
	    		 temp1=arr[i];
	    	 }
	     }
	     
	     System.out.println("Second highest number"+temp1);
		
		
		
	}
	
	
	
}
