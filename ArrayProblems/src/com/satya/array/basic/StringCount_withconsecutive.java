package com.satya.array.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCount_withconsecutive {

	
	
	 public static void main(String[] args) {
		
		// String_Impl ob = new String_Impl()   ;
		 StringCount_withconsecutive.encrypt("aabbbbaa");
		 
	}
	 
	 
	 
	 
	//  aa a2 
	 
	 
	public static void encrypt(String st)  {
		
		char[] arr =  st.toCharArray() ;
		char temp = arr[0] ;
		int count =  1   ;
		String finalstr=""  ;
		for (int i =1  ; i < arr.length  ;  i ++ ) { 
			
			if (  temp  ==  arr[i])  {
				count ++   ;
			}else {
				
				finalstr =   finalstr  +  " "+  temp  +  count ;
				temp  =  arr[i] ; 
				count = 1  ;
				
				
				
				
			}
			
			
		}
		finalstr =   finalstr  +  " "+  temp  +  count ;
		System.out.println(finalstr);
		//return st1 ; 
		
	}
	
}
