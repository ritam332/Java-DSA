import java.util.*;

 class LinkedListRecap {
  static Node head;
  public static class Node{
     int data;
     Node next;
     Node(int data){
       this.data=data;
       this.next=null;
     }
  }
  
  public void addfirst(int data){
    Node x=new Node(data);
    if (head==null){
      head=x;
      return;
    } 
    x.next=head;
    head=x;
  }
  
  public static Node reverseLL(Node head){
    if(head==null || head.next==null){return head;}
    Node newHead= reverseLL(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;
  }
  
  public void printList(){
    if(head==null){
      System.out.println("List is Empty");
      return;
       }
    Node current= head;
    while(current!=null){
      System.out.print(current.data+"->");
      current=current.next;
    } System.out.println("Null");
  }
  
  
  public static void main (String[] args) {
    LinkedListRecap list=new LinkedListRecap();
    for (char i=0; i<5; i++){
      list.addfirst(i);
    } 
    list.printList();
    
    list.head=reverseLL(list.head);
    list.printList();
  }
 
  
}
