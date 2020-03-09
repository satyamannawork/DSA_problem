package com.satya.arraypracown;

import java.util.Arrays;
import java.util.List;

public class UsingStream {

	
	
		  public static void main(String[] args1) {
			String[]  args =   {"satya manna" , "avijit manna" ,  "S SINGH" , "p chakraborty" } ;
			
			List<String>   list  = Arrays.asList(args) ; 
			list.stream().filter( t-> t.endsWith("manna")).forEach( name  ->   {
				           System.out.println(name);
			} );
			
			
		}
}
