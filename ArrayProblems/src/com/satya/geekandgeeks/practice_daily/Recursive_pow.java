package com.satya.geekandgeeks.practice_daily;

public class Recursive_pow {

	
	public static void main(String[] args) {
		Recursive_pow  rrPow= new Recursive_pow();
		System.out.println(rrPow.getPow(3, 2));;
	}
	
	 int getPow(int x, int y) {
		if(y==0) return  1 ;
		if(y==1) return  x ;
		else {
			y =y -1;
			return x*getPow(x, y);
		}
				
				
	}
}
