package com.satya.array.basic;

public class Crud_Array {

	static int[]   arr = new int[5] ;
	static int  index  = 0  ;
	
	  public static void main(String[] args) {
		
		   System.out.println("Creating element");
		   createElement(1) ;  
		   createElement(2) ;  
		   createElement(3) ;  
		   createElement(4) ;  
		   showingArray();
		   System.out.println("inserting 7 at specific index 1" );
		   insertElementAtSpecificIndex(7, 1) ;
		   showingArray();
		   System.out.println("Deleting element 4");
		   deleteElement(4) ;
		   showingArray();
		   
		  
		  
		   
	  }
	  static void showingArray() {
		  
		  for(int a :  arr) {
			   System.out.print(" "+a);
		   }
		  System.out.println("\n");
	  }
	  
	  // deleting element 
	 static  int[] deleteElement(int element) {
			int []  arr2 =  new int [arr.length -1 ] ;
			int j  =0  ;
			for (int i=0  ; i< arr.length ;  i ++  ) {
				if(arr[i] ==  element) {
					continue ;
				}
				else {
					arr2[j++]  =  arr[i] ;
				}
				
			}
			arr = arr2 ;
			return arr ;
	  }
	  
	 	//  inserting element 
	  static int[] insertElementAtSpecificIndex(int element , int index) {
			//  doing right shift    
		  for (int i  = ( arr.length -1 )  ; i >index  ; i--  ) {
			  arr[i] = arr[ i -1 ]  ; 
		}
		  arr[index] = element ;
		  
		  return arr ;  
	  }
	
	  static int[] createElement(int element) {
		  arr[index++]  =  element  ; 
		  return arr ;
		  
	  }
}


