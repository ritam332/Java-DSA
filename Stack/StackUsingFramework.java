package Mycodes;

import java.util.*;

public class StackUsingFramework {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<5;i++) {
			s.push(i);
		}
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
	}

}
