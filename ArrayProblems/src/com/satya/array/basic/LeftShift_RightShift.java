package com.satya.array.basic;

import java.util.Arrays;

public class LeftShift_RightShift {
	
	public static int[] static_sortedArray ;
	
	public static void main(String[] args) {
		int[]  sortedArray =  { 1,2,3,4,5 }  ; //  2, 2 ,3 ,4, 5 //  2,3,3
		int[]  unsortedArray =  { 1,3,2,89,6 }  ;
		
		// stroing the array 
		setArrayStore( sortedArray) ; 
		
		//  rule 1  : when we are shifting we should rotate the loop  array length - 1
		//  rule 2 :  last index always array length -1 
		//  rule 3 : when we are doing left shift loop should be in front direction or right direction because we are modifying left or right so when it iterates it will pick the the lastest array , same visevirsa will be applicable for rightshift means loop will be left and operation will be right 
		int lastIndexShortedArray =  sortedArray.length - 1 ; // as array starts from 0 
		
		System.out.println("before left shifting ");
		for (int a :  sortedArray) {
			System.out.print("  "+ a) ;
		}
		System.out.println("") ;
		
		//  left shifting of an array and shift first element to last 
		//  front iteration and override first element to next element .. it means you are doing left shifting
		int temp  =  sortedArray[0] ;
		for (  int i=0 ; i< lastIndexShortedArray  ;  i++ ) { 
			sortedArray[i] = sortedArray[i+1]  ; // left shift 
		}
		
		
		
		sortedArray[lastIndexShortedArray] = temp ;
		
		// print left shifting 
		System.out.println("after left shifting ");
		for (int a :  sortedArray) {
			System.out.print("  "+ a) ;
		}
		System.out.println("") ;
		/// now right shift 
		sortedArray = getArrayStore() ;
		
		System.out.println(" right shifting ");
		for (int a :  sortedArray) {
			System.out.print("  "+ a) ;
		}
		System.out.println("") ;
		
		 temp  =  sortedArray[lastIndexShortedArray] ;
		for (  int i= lastIndexShortedArray-1   ; i > 0  ;  i-- ) { 
			sortedArray[ i + 1  ] = sortedArray[ i  ]  ; // right shift
		}
		sortedArray[0] = temp ;
		
		System.out.println("after right shifting ");
		for (int a :  sortedArray) {
			System.out.print("  "+a) ;
		}
		
		
	}
	
	static void  setArrayStore( int[] arr) {
		
		// static_sortedArray =  new int[arr.length] ;
		 static_sortedArray =  Arrays.copyOf(arr, arr.length) ;
		
		
	}
	
	static int[]  getArrayStore() {
		
		// static_sortedArray =  new int[arr.length] ;
		return static_sortedArray ;
		
		
	}
	

}