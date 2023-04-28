package Mycodes;

public class QueueUsingArray {
	
	
	static class Queue{
		static int array[];
		static int size;
		static int rear=-1;
		static int front=-1;
		 Queue(int n) {
			array=new int[n];
			this.size=n;
		}
		public static boolean isEmpty() {
			return rear==-1;
		}
		//add or enqueue
		public static void add(int data) {
			if(rear==size-1) {
				System.out.println("Queue is full...");
				return;
			}
			rear++;
			array[rear]=data;
		}
		//dequeue
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			int front=array[0];
			for(int i=0;i<rear;i++) {
				array[i]=array[i+1];
			}
			rear--;
			return front;
		}
		
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
				
			}
			return array[0];
		}
	}

	public static void main(String[] args) {
		Queue q=new Queue(5);
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
