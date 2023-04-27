public class StackClassUsingArrayList {

  // static class Node{
  //   int data;
  //   Node next;
  //   public Node(int data){
  //     this.data=data;
  //     next=null;
  //   }
      static class Stack{
     static ArrayList<Integer> list=new ArrayList<>();
     
      public static boolean isEmpty(){
        return list.size()==0;
         }
         //push operation
      public static void push(int data){
        list.add(data);
      }
      
      public static int pop(){
        if(isEmpty())  {return -1;}
        
        int top= list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
      }
      
      public static int peek(){
        if(isEmpty())  {return -1;}
        
        return list.get(list.size()-1);
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

