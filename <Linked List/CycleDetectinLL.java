package Mycodes;

import java.util.*;

public class CycleDetectinLL {
	 ListNode head;
	public static class ListNode {

		String val;
		    ListNode next;
		     ListNode(String val) {
		        this.val=val;
		        this.next=null;
		     }
		 }
	public void addfirst(String val){
        ListNode newNode=new ListNode(val);
        if (head==null){
           head =newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
	public boolean hasCycle(ListNode head) {
	     ListNode hare=head;
			 ListNode turtle= head;
			 
			 while (hare !=null && hare.next !=null) {
				hare=hare.next.next;
				turtle=turtle.next;
				if(hare==turtle) {return true;}
				
			}
			 
			 return false;   
	    }
	 public ListNode detectCycle(ListNode head) {
		 ListNode hare=head;
		 ListNode turtle= head;
		 
		 while (hare !=null && hare.next !=null) {
			hare=hare.next.next;
			turtle=turtle.next;
			if(hare==turtle) {turtle=head;
			while (turtle != hare) {
				turtle=turtle.next;
				hare=hare.next;
			}}
			
		}
		 
		 return turtle;
	        
	    }
	 public void printlist(){
	        if (head==null){
	            System.out.println("List is empty");
	        }
	        ListNode x=head;
	        while (x!=null){
	            System.out.print(x.val+"->");
	            x=x.next;
	        }
	        System.out.println("Null");
	    }
	 
	 public static void main(String[] args) {
		 CycleDetectinLL list= new CycleDetectinLL();
		 for (int i=1; i<=5 ; i++){   
			 list.addfirst(Integer.toString(i));}
		   list.printlist();
		   System.out.println(list.hasCycle(list.head));;
		   list.detectCycle(list.head);
		 

	}

}
