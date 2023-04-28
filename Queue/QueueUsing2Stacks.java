package Mycodes;

import java.util.Stack;

public class QueueUsing2Stacks {
	public class QueueS {
		static class Queue{
			static Stack<Integer> s1=new Stack<>();
			static Stack<Integer> s2=new Stack<>();
			
			public static boolean isEmpty() {
				return s1.isEmpty();	
			}
			
			public static void add(int data) {
				while(!s1.isEmpty()) {
					s2.push(s1.pop());
				}
			}
			public static int remove() {
				if (isEmpty()) {
					System.out.println("Empty Queue..");
					return -1;
				} 
				return s1.pop();
			}
			
			public static int peek() {
				if (isEmpty()) {
					System.out.println("Empty Queue..");
					return -1;
				}
				return s1.peek();
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

}
