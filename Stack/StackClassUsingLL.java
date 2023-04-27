public class StackClassUsingLL {

  static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      next=null;
    }
    static class Stack{
      public static Node head;
      
      public static boolean isEmpty(){
        return head==null;
         }
         
      public static void push(int data){
        Node n= new Node(data);
        if(isEmpty()){
          head=n;
          return;
        }
        n.next=head;
        head=n;
      }
      
      public static int pop(){
        if(isEmpty())  {return -1;}
        
        int top=head.data;
        head=head.next;
        return top;
      }
      
      public static int peek(){
        if(isEmpty())  {return -1;}
        
        return head.data;
      }
    }
    
    public static void main (String[] args) {
      Stack s=new Stack();
      for (inti=0; i<5; i++){s.push(i);} 
      while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
      }
    }
    
    
    
    
    
    
  }

}
