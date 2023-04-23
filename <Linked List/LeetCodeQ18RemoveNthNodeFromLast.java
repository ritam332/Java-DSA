package dsajava.linkedlist;

public class LeetCodeQ18RemoveNthNodeFromLast {
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

    public Node removeNthfromLast(Node head,int n){
        if (head==null){ return null;}
        int size=0;
        Node current= head;
        while (current!=null){
            current=current.next;
            size++;
        }
        if (n==size){ return head.next;}
        int indexToSearch= size-n;
        Node previous=head;
       for (int i=1;i<indexToSearch;i++){
           previous=previous.next;
       } previous.next=previous.next.next;

       return head;
    }

    public static void main(String[] args) {
        LeetCodeQ18RemoveNthNodeFromLast list= new LeetCodeQ18RemoveNthNodeFromLast();
        for (int i=1; i<=5 ; i++){ list.addlast(Integer.toString(i));}
        list.printlist();
        list.removeNthfromLast(list.head,2);
        list.printlist();
    }

}
