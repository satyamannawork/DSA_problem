package com.satya.ds_inshort;

public class LinkedList_Custom {

	

		Node head ;  

	



	public static void main(String[] args) {
		
		LinkedList_Custom list = new LinkedList_Custom()  ;
		
		insert(list, 12) ; 
		insert(list, 13) ; 
		insert(list, 14) ; 
		insert(list, 15) ; 
		
		printLinkedList(list);
		
		
	}
	
	
	static void printLinkedList( LinkedList_Custom list )   {
		
		
		Node data =  list.head  ;
		
		while  (true){
			
			System.out.println(data.data);
			if ( data.node == null) {
				break ;
			}
			data  =  data.node  ; 
			
		}
		
		
	}
	
	
	static LinkedList_Custom insert(LinkedList_Custom list ,  int data )   {
		
		if (list.head  == null) { 
			
			Node node =  new Node(data, null)   ; 
			list.head  =  node  ; 
			
		}
		
		else { 
			
			if(null!= list.head) {
				
				Node whichIsnull =  list.head  ;
				
				while  (whichIsnull.node !=  null ){
					whichIsnull  =  whichIsnull.node  ; 
					
				}
				Node node =  new Node(data, null)   ; 
				whichIsnull.node  =  node  ;
				
			}
		}
		return list  ;
	}
	
	
	
	static class Node {
		int data ;  
		Node node ;
		
		Node(int data,  Node node) { 
			this.data  = data ; 
			this.node  =  node  ; 
			
		
		}
		
	}
}
