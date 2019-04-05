package com.satya.geekandgeeks;

public class RotateArray {
	
	public static void main(String[] args) {
		int[]  a =  {10,20,56,45,10,78,56};
		
		for(int i = 0 ; i <  a.length /2  ; i ++ ) {
			int temp = a[(a.length -1) -  i];
			a[(a.length -1) -  i] = a[i];
			a[i] = temp;
		}
		
		for(int  a_ : a) {
			System.out.print(a_+" ");
		}
	}

}
