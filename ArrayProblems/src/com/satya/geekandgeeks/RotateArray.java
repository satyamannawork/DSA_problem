package com.satya.geekandgeeks;


 //  rotate array or reverse array ,  basically we have to rotate it half of the length and
//   swap last element with first element , we rotate it half 
// because we dont have swapping elements to first to last  
/*
 * Key to remember 
 * rotate length is n/2 
 * swp last element to first element and so on means 2nd last element to 2nd element etc ....
*/
public class RotateArray {
	
	public static void main(String[] args) {
		
		RotateArray.testRotateArray();
		
	}

	
	static void prodRotateArray() { 
		int[]  a =  {10,20,56,45,10,78,56};
		for(int i = 0 ; i <  a.length / 2  ; i ++ ) {
			int temp = a[ (a.length -1) -  i ];
			a[(a.length -1) -  i] = a[i];
			a[i] = temp;
		}
		
		for(int  a_ : a) {
			System.out.print(a_+" ");
		}
	}
	
	
	static void testRotateArray()  {
		
		int[]  arr =  {10,20,56,45,78,56}; 
		int n =  arr.length   ;  
		
		for (int index = 0 ; index  < n / 2    ;  index  ++   ) { 
			
			int temp  =  arr[(n -1)  - index ];  
			 arr[(n -1)  - index ]   = arr[index] ;
			 arr[index]   = temp   ;
		}
		
		for (int a :  arr ) {
			System.out.print(a+" ");
		}
		
	}
}
