package com.satya.array.java_revisited;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =  {1,2,3,1,3} ;  
		int temp =0 ,count =  0 ;
		for(int i =0 ; i <  a.length   ; i++) {
			 count  = 1 ;  
		   for(int  j=i+1 ; j<  a.length  ; j ++) {
			  
			   if(a[i] ==  a[j]) {
				   count++;   
				   
			   }
			   
		   }
		   
		   
		   System.out.println("Element "+a[i] +"  "+count+"times ");
		}
		 
		
	}

}
