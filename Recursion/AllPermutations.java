package Mycodes;

import java.util.Iterator;

public class AllPermutations {

	
	public static void AllPerm(String str, String ans) {
		//base case.....
		
		if(str.length()==0) {System.out.println(ans);
		
		return;
		}
		
		
		//recursion.....
		for(int i=0;i<str.length();i++) {
			char current=str.charAt(i);
			String newStr=str.substring(0,i)+ str.substring(i+1);
			
			AllPerm(newStr, ans+current);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		AllPerm("abcd","");

	}

}
