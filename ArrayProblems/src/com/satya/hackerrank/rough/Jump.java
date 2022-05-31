package com.satya.hackerrank.rough;

public class Jump  {
	
	
	
	public static void main(String[] args) {
		
		
		//  7 - 5 =  2  
		//0 0 0 0 1 0
		//0 0 1 0 0 1 0
		
		int[] arr =   {0 , 0 , 0 , 0 , 0, 1,0  }   ;
		
		int jump =  0 ;
		int conseqtive = 0 ;
		for (int i =0 ;  i<  arr.length    ;  i++) {
			if (arr[i] == 0 ) {
				//jump ++   ;
				conseqtive  ++ ;
			}
			
			if  (arr[i] == 1   ) {
				jump ++ ;
				conseqtive = 0  ;
			}
			if (conseqtive >= 2  ) {
				jump   = jump   +  1  ;
			}
			
		}
		System.out.println(jump);
	}
	
	
	

}
