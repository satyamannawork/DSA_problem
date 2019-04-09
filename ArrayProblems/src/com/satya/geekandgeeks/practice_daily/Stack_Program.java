package com.satya.geekandgeeks.practice_daily;

import java.util.Stack;

public class Stack_Program {
	
	
	public static void main(String[] args) {
		
		String st = "[{}]";
		Stack<Character> stack1= new Stack<Character>();
		for(char  ch : st.toCharArray()) {
			stack1.add(ch);
		}
		Stack<Character> stack2= new Stack<Character>();
		while(!stack1.isEmpty()) {
			stack2.add(stack1.pop());
		}
		for(char  ch : st.toCharArray()) {
			stack1.add(ch);
		}
		
		
		
	}

}
