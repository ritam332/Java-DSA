package dsajava.linkedlist;

import java.util.*;

public class SinglyLinkedListUsingCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("hello");
        list.add("guys");
        list.addFirst("Hey");
        //System.out.println(list);
        System.out.println(list.size());
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");

        }
        System.out.println("NULL");
        list.remove(2);
        System.out.println(list);
    }
}
