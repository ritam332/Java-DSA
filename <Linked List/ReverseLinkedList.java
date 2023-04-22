package dsajava.linkedlist;

import java.util.*;

public class ReverseLinkedList {
    Node head;
    public static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node x= new Node(data);
        if (head==null){head=x; return;}
        x.next=head;
        head=x;
    }
    public void addlast(String data){
        Node x= new Node(data);                  //x=5{input}
        if (head==null){head=x; return;}        //2 - 3 - 4
        Node current = head;                    // current = 2
        while (current.next!= null){             //i=1 : current=3 i=2 : current =4
            current=current.next;
        } current.next=x;                       //2-3-4-x(5)
    }
    public void reverseIterate(){
        if (head==null || head.next==null ){return;}
        Node previous = head;
        Node current = head.next;

        while (current != null){
            Node x=current.next;
            current.next=previous;

            previous=current;
            current=x;
        }
        head.next=null;
        head=previous;
    }
    public static Node reverseRecursion(Node head){
        if (head==null || head.next==null){ return head;}
        Node newHead = reverseRecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public void printlist(){
        if (head==null){
            System.out.println("List is empty");
        }
        Node x=head;
        while (x!=null){
            System.out.print(x.data+"->");
            x=x.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList() ;
        list.addfirst("23"); list.addfirst("56"); list.addfirst("34");
        list.addfirst("69"); list.addfirst("55");
        list.printlist();
       // list.reverseIterate();
       list.head= reverseRecursion(list.head);
        list.printlist();

        LinkedList<Integer> x=new LinkedList<>();
        for (int i=0;i<5;i++){
            x.add(i+1);
        }
        System.out.println(x);
        String y= x.toString();
       StringBuilder z=new StringBuilder();
       z.append(y);
        System.out.println(z.reverse());

    }
}
