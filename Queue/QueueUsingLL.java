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
	}
		
		
	static class Queue{
		  static Node head= null;
		  static Node tail= null;
		
		public static boolean isEmpty() {
			return head==null & tail==null;
		}
		
		
		public static void add(int data) {
			Node n= new Node(data);
			if (isEmpty()) {
				tail=head=n;
				return ;
			}else {
				tail.next=n;
				tail=n;
			}
		}
		
		public static int remove() {
			if (isEmpty()) {
				System.out.println("Empty Queue"); return -1;
			}
			
			int front=head.data;
			
			//single node
			
			if (head==tail) {
				tail=null;
			}
			head=head.next;
			return front;
		}
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Empty Queue"); 
				return -1;
			}
			
			return head.data;
		}
		
    }
	
	
	
	public static void main(String[] args) {
		 Queue q= new Queue();
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}
