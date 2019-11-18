package com.satya.interviewbit;

public class MinimumPathFromGrid {

	public static void main(String[] args) {
		
		point arr[] = new point[4]; 
	    arr[0] = new point(4, 4); 
	    arr[1] = new point(8, -15); 
	    arr[2] = new point(-7, -10); 
	    arr[3] = new point(10, 12); 
	  
	    int n = arr.length; 
	    System.out.print(coverPoints(arr, n)); 
		
	}
	
	
	static int shortestPath(point p1,  
            point p2) 
		{ 
		// dx is total horizontal 
		// distance to be covered 
		int dx = Math.abs(p1.x - p2.x); 
		
		// dy is total vertical 
		// distance to be covered 
		int dy = Math.abs(p1.y - p2.y); 
		
		// required answer is 
		// maximum of these two 
		return Math.max(dx, dy); 
		} 
	static int coverPoints(point sequence[],  
            int size) 
		{ 
		int stepCount = 0; 
		
		// finding steps for  
		// each consecutive 
		// point in the sequence 
		for (int i = 0; i < size - 1; i++) 
		{ 
		stepCount += shortestPath(sequence[i], 
		                       sequence[i + 1]); 
		} 
		
		return stepCount; 
		} 
}

class point  
{ 
    int x, y; 
    point(int a, int b) 
    { 
        x = a; 
        y = b; 
          
    } 
} 