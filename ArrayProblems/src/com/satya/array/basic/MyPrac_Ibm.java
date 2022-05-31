package com.satya.array.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class MyPrac_Ibm {

	
	
	   public static void main(String[] args) {
		   int[] arr = {-1,-5,-4,-3,-7}; 
		   secondHighNormal(arr);
		   //System.out.println(secondOccurance("1,1,2,3,4,4,4"));
		   //getSecondMaxAge() ;
		   System.out.println(getSecondMaxUsingJava8( arr) );
		   ;
	}
	   
	  static  void secondHighNormal(int arr[]) {
		   int second  ;  
		   int max =  second  = Integer.MIN_VALUE   ;
		   
		   if (arr.length  <  2 )
		   return ;
		   for (int i = 0  ;  i <  arr.length  ;  i++ ) {
			   if (arr[i]  > max  )   {
				   second = max    ;
				   max  = arr[i]   ;
			   }
			   if ( arr[i]  > second && max !=  arr[i] ) {
				   second =  arr[i]   ;
			   }
			   
			  
		   }
		   if (second ==  Integer.MIN_VALUE) {
			   System.out.println("No second Max Value ");
		   }
		   else {
			   System.out.println(" Second value is "   + second);
		   }
	   }
	  
	  
	  static String   secondOccurance (String st ) { 
		  
		 Entry<String,Long> st1 = Arrays.stream(st.split(","))
					 .collect(Collectors.groupingBy(e->  e , Collectors.counting()))
					 .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
					 .limit(2).skip(1).findFirst().get() ;
		    
		  
		  
		  
		  return st1.getKey().toString()   ;
	  }
	  
	  static String  getSecondMaxAge ( ) { 
		  
//			  getList().stream().map(e ->  e.getAge())
//			  .forEach( 
//					  p  -> System.out.println("---  ++  -- " + p));   
			  
		  Optional<String>  sp = getList().stream().map(e ->  e.getAge()).sorted(Collections.reverseOrder()).limit(1)
		  .findFirst()  ;
		  if(sp.isPresent()) {
			  return sp.get() ;
		  }else {
			  return null  ;
		  }
			 
			 
		  }
	  
	  static int  getSecondMaxUsingJava8 ( int[] arr) { 
		  
		  OptionalInt  sp =  Arrays.stream(arr).sorted().skip(arr.length-2).findFirst()  ;
		  if(sp.isPresent()) {
			  return sp.getAsInt() ;
		  }else {
			  return Integer.MIN_VALUE  ;
		  }
	  
		 
	  }
	  
	   
	  public static  List<Employee>  getList(){
			Employee emp1 = new Employee("satya", "20", "science") ; 
			emp1.setAge("20");
			emp1.setDept("science");
			emp1.setName("satya");
			Employee emp2 = new Employee("avi", "10", "science") ; 
			emp2.setAge("10");
			emp2.setDept("science");
			emp2.setName("avi");
			Employee emp3 = new Employee("puspa", "56", "science") ; 
			emp3.setAge("56");
			emp3.setDept("science");
			emp3.setName("puspa");
			Employee emp4 = new Employee("raj", "15", "commerce") ; 
			emp4.setAge("20");
			emp4.setDept("commerce");
			emp4.setName("raj");
			
			Employee emp5 = new Employee("raj2", "15", "arts") ; 
			emp5.setAge("20");
			emp5.setDept("arts");
			emp5.setName("raj2");
			
			
			List<Employee>  list  = new ArrayList<Employee>() ;
			list.add(emp1) ;
			list.add(emp2) ;
			
			list.add(emp3) ;
			list.add(emp4) ;
			list.add(emp5) ;
			return list  ;
		}
	   
}
class Employee {
	
	private String name ;
	private String age ; 
	private String dept ;
	public Employee(String name, String age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}