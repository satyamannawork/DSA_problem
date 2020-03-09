package com.satya.arraypracown;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_HasMap {

	public static void main(String[] args) {
		int[]  arr   = { 1 , 5 , 1 ,4  } ;
		Map<Integer,Integer>   map  =  new HashMap<Integer,Integer>() ; 
		for (int  a : arr  )   {
			if(map.containsKey(a) ){
			  int  count  =   map.get(a) ;   
			  count  ++ ; 
		 	  map.put(a,count) ;  
			}
			else {
			map.put(a,  1  )  ; 
			}
		}
		

		for(Map.Entry<Integer,Integer>  entry :  map.entrySet())  {
			  if(entry.getValue() >=  2)	
		      System.out.println("Key  " + entry.getKey() + "Value" +entry.getValue());
		} 
	}

}
