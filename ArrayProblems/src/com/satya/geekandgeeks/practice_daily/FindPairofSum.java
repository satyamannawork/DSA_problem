package com.satya.geekandgeeks.practice_daily;

import java.util.HashSet;
import java.util.Set;

public class FindPairofSum {

	
	public static void main(String[] args) {
		int[] arr= {5,4,2,1,4} ;
		int sum = 6 ;
		Set<Integer>  set = new HashSet<Integer>() ;
		for(int  i=0 ; i<  arr.length ; i++ ) { 
			if(!set.contains(arr[i]) &&  set.contains( ( sum -  arr[i] ))) {
				System.out.println( (sum - arr[i]) + " " + arr[i] +" "  );
				
			}
			set.add(arr[i]) ;
		}
		
		
		
		
	}
}
