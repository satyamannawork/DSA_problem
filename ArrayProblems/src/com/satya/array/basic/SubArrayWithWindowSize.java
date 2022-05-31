package com.satya.array.basic;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithWindowSize {

	
	
	  //  it requires windows size some time it is mentioned as 'k'
	
	   public static void main(String[] args) {
		   int[] arr  =  {1, 4, 2, 10, 23, 3, 1, 0,90} ;  
		   SubArrayWithWindowSize.printSubarray( arr ,  2);
		   System.out.println(maximumSum(arr, 4)); ;
		   List<String> list = new ArrayList<String>() ;
		   for ( String st  :  list) {
			   
		   }
		
	}
	
	   
	 static  void  printSubarray(int[]  arr ,  int  k ){	
		  
		 
		 for (int  i = 0  ;   i<  arr.length ;  i++ ) {
			 for ( int j =  i   ; j  < ( i +  k)   ;  j++ )  {
				if( (arr.length -  i) >= k    ) {
					System.out.print( arr[j])  ;
				}
			}
			 System.out.print(" \n");
		 }
		  
	  }
	 
	 	static  int  maximumSum(int[]  arr ,  int  k ){
		  
		
		 int tempSum  =  0 ; 
		 for (int  i = 0  ;   i<  arr.length ;  i++ ) {
			 int sum  =  0 ; 
			 for ( int j =  i   ; j  < ( i +  k)   ;  j++ )  {
				if( (arr.length -  i) >= k    ) {
					//System.out.print(arr[j])  ;
					sum =  sum +  arr[j] ;
				}
			}
			 if (sum  >  tempSum) {
				 tempSum = sum  ;
			 }
			 
			 
			 
			// System.out.print("\n");
		 }
		  
		 return tempSum ;
	  }
	
}
