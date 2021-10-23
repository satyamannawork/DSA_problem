package com.satya.array.basic;

public class CheckXisPresntInKsegment {

	
	public static void main(String[] args) {
		int[] arr =  {1,2,3,1,3,1,2,4,3} ;
		checkNumberInEverySegment(arr);
	}
	
	
	static void checkNumberInEverySegment(int[] arr) {
		
		int k = 3 ;
		int N =  arr.length ;
		int x = 3 ;
		int segmentNo = 1 ;
		boolean flag =false ;
		int count =0 ;
		for(int i=0 ;  i < N;  i = i + k  ) {
			
			for (int j =  i  ;  j < i+k  ; j++ ) {
				if(j  <  N) {
					
				  // finding logic 
					if (x ==  arr[j]) {
						count ++; 
						//System.out.print(x +" is found in segment number  " +  segmentNo); //  it is to find aabout the segment
					}
					
				//System.out.print(" "+arr[j] +"flag" +flag);
				}
			}
			
			segmentNo ++;
			System.out.print("  ");
		}
		
		flag = count == k ? true : false ;
		System.out.println("flag is " +flag);
	}
}
