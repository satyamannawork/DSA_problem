package com.satya.array.java_revisited;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =  {1,2,3,1,3} ;  
		int temp =0 ,count =  1 ;
		Map<Integer,Integer> map =  new HashMap<Integer,Integer>() ; 
		temp = a[0];
		for(int i =0 ; i <  a.length   ; i++) {
			 count = 1 ; 
			  for(int j=i+1 ; j<a.length ; j ++) {
			  if(a[i] == a[j]) { 
		    	   count++;
		    	   
		       }
			  
			  }
			  if(count  > 1)
			System.out.println("Element "+a[i] +"  "+count+"times ");
			  }
		
			  
		
			 
			
			
			//  remove  duplicate using map  
			/*if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			}
			else  {
				map.put(a[i], count);
				
			}*/
			
		//}
		
		
		for(Map.Entry<Integer, Integer> map1  :  map.entrySet() ) {
			System.out.println(map1.getKey()+"->"+map1.getValue());
		}
		 
		
	}

}
