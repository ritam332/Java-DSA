public class SingleLinkedListBasics {

    Node head;
    private int size;
    SingleLinkedListBasics(){this.size=0;}
    class Node{
        String data;
        Node next;
        Node(String data) {
            this.data=data;
            this.next=null;
            size++;
        }}

       public void addfirst(String data){
            Node newNode=new Node(data);
            if (head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void addlast(String data){
            Node newNode=new Node(data);
            if (head==null){
                head=newNode;
                return;
            }
            Node currentNode= head;
            while (currentNode.next!=null){
                currentNode=currentNode.next;
            } currentNode.next=newNode;
        }
        public void deletefirst(){
          if (head==null){
              System.out.println("The list is empty");
              return;
          } size--;
          head=head.next;
        }
    public void deletelast(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        } size--;
        if (head.next==null){head=null; return;}
        Node currentNode=head;
        Node lastNode=head.next;
        while (lastNode.next !=null){
            currentNode=currentNode.next;
            lastNode=lastNode.next;

        }
        currentNode.next=null;

    }

        public void printlist(){
            if (head==null)
            {
                System.out.println("List is empty");
                return;
            }
            Node currentNode= head;
            while (currentNode!=null){
                System.out.print(currentNode.data+" -> ");
                currentNode=currentNode.next;
            }
            System.out.print("Null");
            System.out.println();
        }
        public void getSize(){
            System.out.println("The size is ="+size);
        }



    public static void main(String[] args) {
        SingleLinkedListBasics list=new SingleLinkedListBasics();
        list.addfirst("a");
        list.addfirst("this");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addlast("by me");
        list.printlist();
        list.getSize();
        list.deletefirst();
        list.printlist();
        list.getSize();
        list.printlist();
        list.deletelast();
        list.getSize();
        list.printlist();

    }

}
