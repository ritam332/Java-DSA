package Mycodes;
import java.util.*;
public class QueueUsingLL {
	
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
		
		
	static class Queue{
		  static Node head= null;
		  static Node tail= null;
		
		public static boolean isEmpty() {
			return head==null & tail==null;
		}
		
		
		public static void add(int data) {
			Node n= new Node(data);
			if (tail==null) {
				tail=head=n;
				return ;
			}
		}
	}
	    
	}
}
