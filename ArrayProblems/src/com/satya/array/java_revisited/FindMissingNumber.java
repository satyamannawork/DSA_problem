package com.satya.array.java_revisited;

import java.util.Scanner;

public class FindMissingNumber {

	
	 public static void main(String[] args) {
		int[] arr = {1,2,3,4,3};
		int range =   5  ; 
		int sum1  =0 ; 
		int sum2  =0 ; 
		for(int i =1;  i <=  range ;i++) {
			sum1 = sum1   +  i ; 
		}
		
		for(int i =0;  i <  arr.length ;i++) {
			sum2 = sum2   +  arr[i] ; 
		}
		
		System.out.println("missing number" +  (sum1-sum2));
	}
}
