package com.satya.array.daily;

public class NumberCalculation {

	
	
	 public static void main(String[] args) {
		numbersplit(123);
		 
		//  System.out.println(3/10); 
		 // as we are diving lower number with greter number , it is float /  decimal in result but as varible is in integer it is returing zero
	}
	 
	 
	 
	 static void numbersplit( int number ) { 
			while (number %10 != 0 ) {
				
				System.out.println(number %10);
				number = number / 10   ;
				
				
			}
	 }
}


