package com.satya.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jump {

	public static void main(String[] args) {
		Integer[] arr = {0,1,0,1,0,1,0,0 ,0,0 ,0,0 ,0,0,1,0,1,0,0 ,0,0,1,0,1,0,0,1,0,0 ,0,1,0,1,0,0, 0,1,0,1,0,1,0,1,0,0 ,0,1,0,0 ,0,0 ,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,0 ,0,0,1,0,0,1,0,0, 0,1,0,0,1,0,1,0} ;
		List<Integer> list =  new ArrayList<Integer>() ;
		list = Arrays.asList(arr) ;
		System.out.println(jumpingOnClouds(list));
	}
	
	public static int jumpingOnClouds(List<Integer> c) {
	    // Write your code here
		 int minimumStep = -1  ;
		 int conseqtiveZero = 0 ;
		for (int i = 0 ;  i <  c.size() ; i++ ) {
			int step =  c.get(i) ;
			
			if (step == 0){
				minimumStep ++  ;
				conseqtiveZero ++ ; 
				if (conseqtiveZero == 3) {
					minimumStep --;  
				}
			}
			else if(step == 1) {
				conseqtiveZero = 0;
			}
			
		}
	    return minimumStep;

	    }
}
