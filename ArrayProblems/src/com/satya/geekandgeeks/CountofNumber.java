package com.satya.geekandgeeks;

import java.util.HashMap;
import java.util.Map;

public class CountofNumber {
    public static void main(String[] args) {
		int[] arr = {10,10,45,2,2,2,1,1,1,1,1};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0 ;
		for(int  i=0; i <  arr.length ; i++) {
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i])  ; 
				count =count+1;
				map.put(arr[i], count);
				//count =0;
			}
			else {
				
				count =count+1;
				map.put(arr[i], count);
			}
			count = 0;
		//System.out.println(i+"===="+map.put(arr[i], count));
		}
		System.out.println(map);
	}
}
