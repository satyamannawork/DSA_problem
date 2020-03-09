package com.satya.arraypracown;

import java.util.HashSet;
import java.util.Set;

public class Pair_Sum {

	public static void main(String[] args) {
		
		
		
		int[]  arr   = { 1 , 5 , 1 ,4  ,2 } ;

	 	 int  sum =2  ; 
		 Set<Integer> set = new HashSet<Integer> () ;

		 for (int a :  arr )  {
			if( set.contains(sum -  a)  ) { 
				System.out.println( (sum  - a ) +  "  ,  " +  a  ) ; 
			}	
			else  { 
			    set.add(a) ; 
			}
		 }
	}

}
