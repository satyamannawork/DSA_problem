package com.satya.array.java_revisited;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a =  {1,2,3,1,3} ;  
//		int temp =0 ,count =  1 ;
//		Map<Integer,Integer> map =  new HashMap<Integer,Integer>() ; 
//		temp = a[0];
//		for(int i =0 ; i <  a.length   ; i++) {
//			 count = 1 ; 
//			  for(int j=i+1 ; j<a.length ; j ++) {
//			  if(a[i] == a[j]) { 
//		    	   count++;
//		    	   
//		       }
//			  
//			  }
//			  if(count  > 1)
//			System.out.println("Element "+a[i] +"  "+count+"times ");
//			  }
//		
//			  
//		
//			 
//			
//			
//			//  remove  duplicate using map  
//			/*if(map.containsKey(a[i])) {
//				map.put(a[i], map.get(a[i]) + 1);
//			}
//			else  {
//				map.put(a[i], count);
//				
//			}*/
//			
//		//}
//		
//		
//		for(Map.Entry<Integer, Integer> map1  :  map.entrySet() ) {
//			System.out.println(map1.getKey()+"->"+map1.getValue());
//		}
		int[] a =  {1,2,3,1,3,1} ;  
		findDuplicate(a);
	}
	
	
	static void findDuplicate(int[] arr) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0 ;  i< arr.length  ;i++) {
			if(map.get(arr[i]) != null ) {
				map.put(arr[i] ,(map.get(arr[i]) +1 )  );
			} else {
				map.put(arr[i], 1) ;
			}
			
		}
		
		map.forEach((k,v) -> {
			if(v > 1)
			System.out.println("element" +  k +"count "+v);
		}) ;
		
		
		
		
	}
	void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");
         
        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }

}
