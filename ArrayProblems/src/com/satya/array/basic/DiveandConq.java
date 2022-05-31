package com.satya.array.basic;

public class DiveandConq {
	 static int sum  =0 ;
	
	
	 public static void main(String argc[]) {
		 int[] arr = {0, 1, 2, 3, 4, 5};
		 System.out.println(DiveandConq.add(arr, 0, arr.length-1));
		 //DiveandConq.add(arr, 0, arr.length-1);
	     	 
		 
		 
	 }
	 
	static  int  add(int[]  arr,int s,int e) {
		
		 if(s<e) {
			 int  mid = (s+e)/2 ;
			 add(arr, s,mid);
			 add(arr,mid+1 ,e);
		 }
		 else {
			sum=sum+ arr[s];
		 }
		 return sum ;
		 
	 }
	 
	 
}
