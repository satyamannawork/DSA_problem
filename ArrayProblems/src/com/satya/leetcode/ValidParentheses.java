package com.satya.leetcode;

import java.util.Stack;

public class ValidParentheses {

	
	
	
	//  [] {}
	
	// using stack we will implement the thing 
	
	
	public static void main(String[] args) {
		String st = "[[{}]]" ;
		
		
		
	}
	
	
	
	static boolean checkBalance(String st ){
		Stack<Character> stack =  new Stack<Character>() ;
		//char[]  chars =  new char[st.]
		for (int i =0  ; i<  st.toCharArray().length ;  i++) {
			char ch  = st.charAt(i) ;
			if (ch == '[' ||  ch == '{' || ch == '(') {
				
				stack.push(ch) ;
				
			}
			else {
				char check;  
				switch(ch) {
				case ']' :  
					check = stack.pop() ;
					if (check == '}' || check ==')')
						return false ;
					break ;
				case '}' :  
					check = stack.pop() ;
					if (check == ']' || check ==')')
						return false ;
					break ;
				case ')' :  
					check = stack.pop() ;
					if (check == '}' || check ==']')
						return false ;
					break ;
				
				}
			}
			
		}
		
		return (stack.isEmpty()) ;
		
	}
}
