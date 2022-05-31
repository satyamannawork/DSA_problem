package com.satya.array.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maxconsecutiveone {

	
	
	 public static void main(String[] args) {
		
		// String_Impl ob = new String_Impl()   ;
		 int [] arr = {1 , 1 ,1 , 1 , 1 ,1  ,1  } ;
		 Maxconsecutiveone.maxConsecutiveOne(arr);
		 
	}
	 
	 
	 
	 
	//  aa a2 
	 
	 
	public static void maxConsecutiveOne(int[] arr )  {
		
		int maxCount =0  ; 
		int  temp = 0  ; 
		for (int i =0  ; i <  arr.length  ;  i++ ) {
			
			if (arr[i]  ==  1 ) {
				maxCount  ++   ;
			}else {
				if( maxCount >  temp ) {
					temp  =  maxCount   ;
					maxCount  = 0  ;
				}
				
			}
			
			
		}
		
		
		if( maxCount >  temp ) {
			temp  =  maxCount   ;
			maxCount  = 0  ;
		}
		
		
		System.out.println(temp);
		
	}
	
}
