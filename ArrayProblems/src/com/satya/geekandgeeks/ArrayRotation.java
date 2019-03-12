package com.satya.geekandgeeks;

public class ArrayRotation {

	
	public static void main(String[] args) {
	
		int[] arr = {1,5,8,9};
		ArrayRotation  ob = new ArrayRotation();
		for(int  a_  :  ob.leftRotate(arr, 2)) {
			System.out.print(a_+" ");
		}
		//System.out.println(ob.leftRotate(arr, 2));
		;
	
		
	}
	
	
	
	int[]  leftRotate(int []  arr ,  int size  ){
		
		for(int i =0 ; i <   size;  i++) {
			arr=this.leftRotateByOne(arr);
		}
		return arr;
		
	}
	
	
	int[] leftRotateByOne(int[] arr) {
	
		for(int i =0 ;  i <  arr.length -1 ;  i++) {
			int temp  =  arr[i] ; 
			arr[i] = arr[i+1];
			arr[i+1] =  temp;
			
		}
		return arr;
	}
	
}
