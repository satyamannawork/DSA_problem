package com.satya.array.basic;

public class Test_12 {

	
	  public static void main(String[] args) {
		String st = "abcdaca" ;
		
		System.out.println(repeatedStringTry4(st, 10) ); // correct and : 4 
	}
	 
	 
	  public static long repeatedStringTry3(String s, long n) {
		  long num = n/s.length(); // 2
	        long rem = n%s.length(); // 0
	        long ans = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i)=='a') {
	                ans += num;
	                if (i < rem)
	                    ans++;
	            }
	        }
		      return ans ;  
		    }
	  public static long repeatedStringTry4(String s, long n) {
		  
		  	long q  =  n /  s.length()   ;
		  	long r  =  n % s.length()  ;
		  	long q1 =  r != 0 ? r : 0 ;
		  	
		  	long ans  =  q  * getStringCount(s, s.length()) +  getStringCount(s, q1) ;
		  	
		  	return ans ;  
		  
		  
		    }
	 public static long getStringCount( String s , long n ) {
		 long count = 0 ;
		 for (int i =0 ; i < n ;  i++ ) {
			 if(s.charAt(i) == 'a') {
				 count ++ ;
			 }
			 
		 }
		 return count ;
	 }
	  
	  public static long repeatedStringTry2(String s, long n) {
		    // Write your code here
		  		long count = 0l  ;
		        char[] chars  = s.toCharArray()  ;
		        int stringLenght  =   s.length()  ;
		        // if condition 
		        int j =0   ;
		        for (int i =0  ; i < n  ; i++) {
		        	
		        	
		        	if (j  ==  stringLenght) {
		        		j=0 ;
		        	}
		        		
		        	if(chars[j]  =='a') {
		        		count ++ ; 
		        	}
		        	j ++  ;
		        }
		        
		        
		        return count  ; 
		        
		    }
	  
	 public static long repeatedString(String s, long n) {
		    // Write your code here
		       
		        char[] chars  = s.toCharArray()  ;
		        int stringLenght  =   s.length()  ;
		        // if condition 
		        int j =0   ;
		        for (int i =0  ; i<  ( n -  stringLenght ) ; i++) {
		        	
		        	
		        	if (j  ==  stringLenght) {
		        		j=0 ;
		        	}
		        		
		        	s  = s + chars[j]   ; 
		        	j ++  ;
		        }
		        
		        chars  = s.toCharArray() ;
		       
		        long count = 0l  ;
		        for (int i =0  ; i <  chars.length ; i++ ){
		            if( chars[i] == 'a') {
		                count ++  ;
		            }
		        }
		        
		        return count  ; 
		        
		    }
}
