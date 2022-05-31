package com.satya.array.daily;

public class ArraYSort {

	
	
	  public static void main(String[] args) {
		
		  int[] arr=  { 56 , 89 , 1,2 ,7 ,24  }  ; 
		  
		  ArraYSort.bubbleSort(arr);
		  ArraYSort.selectionSort(arr);
		  
	}
	  
	  static void  bubbleSort(int[] arr) {
		  
		  for ( int i   =0    ; i <  arr.length   ;  i ++ ) { 
			   
			  for (int j =0  ; j <  arr.length -1   ;  j++ ) {
				  
				  if (arr[j]   >  arr [j   +  1] ) { 
					  
					  int  temp  =  arr[j]   ;
					  arr[j]   = arr[j+1]   ;
					  arr[j+1]  =  temp  ;
					  
				  }
				 
				  
			  }
			  
		  }
		  
		  printArray(arr);
		  
	  }
	  
	  
	  static void selectionSort (int[] arr ) {
		  
//		  1.Set MIN to location 0
//		  2.Search the minimum element in the list
//		  3.Swap with value at location MIN
//		  4.Increment MIN to point to next element
//		  5.Repeat until the list is sorted
		  
		  for (int i =0  ; i  <  arr.length  ;  i++ ) {
			  
			  int min  = i  ;
			  
			   for(int j  = i + 1   ;  j <  arr.length ;  j++) {
				   
				   if (arr[j]   <  arr[min]) {
					   min =  j  ; 
				   }
			   }
			   
			    int temp  =  arr[min]   ;
			    arr[min  ]  = arr[i] ;
			    arr[i]  = temp  ;
			    
			  
			  
		  }
		  
		  printArray(arr);
		  
		  
	  }
	  
	  static void  printArray(int[] arr) {
		  for (int a :  arr) {
					  System.out.print("   "+a);
				  }
	  }
	  
}
