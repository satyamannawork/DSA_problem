package com.satya.array.basic;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,-5,-4,-3,-7}; 
		SecondHighest.find2ndhighest(arr) ;
		//System.out.println(SecondHighest.find2ndhighest(arr));
		
		

	}
	
	
	
	static  void find2ndhighest(int [] arr) {
		 int max  = Integer.MIN_VALUE  ;
		 int second_num = Integer.MIN_VALUE   ;
		 if ( arr.length <  2  ) {
			 return    ;
		 }
		for (int i = 0 ; i < arr.length   ;  i++ ) { 
			if (arr[i] >  max ) {
				second_num =  max; 
				max  = arr[i]  ; 
				
			}
			else if(arr[i] > second_num && arr[i]!= max) {
				second_num = arr[i]; 
			}
			
		}
		if ( second_num  ==  Integer.MIN_VALUE) {
			System.out.println("There is no  ssecond max ");
		}else {
			System.out.println(second_num);
		}
		
		
		
	}
	
	static  int find2ndhighestWithNegetiveInteger(int [] arr) {
		 int max  = 0  ;
		 int second_num = 0   ;
		for (int i = 0 ; i < arr.length   ;  i++ ) { 
			if (arr[i] >  max ) {
				second_num =  max; 
				max  = arr[i]  ; 
				
			}
			else if(arr[i] > second_num && arr[i]!= max) {
				second_num = arr[i]; 
			}
			
		}
		
		return second_num ;
		
	}
	
	
	

}
