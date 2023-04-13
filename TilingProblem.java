package Mycodes;

import java.util.Iterator;

public class TilingProblem {

	public static void main(String[] args) {
		System.out.println(tilingProblem(5));
		System.out.println(tilingProblem(4));
		printBinary(6, 1, "");

	}

	public static int tilingProblem(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return tilingProblem(n - 1) + tilingProblem(n - 2);
	}
	
	 public static void printBinary(int n,int lastPlace, String str) {
		 if (n==0) {
			System.out.println(str);
			return;
		}
		 printBinary(n-1, 0, str+"0");
		if (lastPlace==0) {
			printBinary(n-1,1, str+"1");
		}
		
	}
//	 public static void printBinary(int n) {
//		 String str="";
//		 for(int i=0;i<n;i++) {
//			 if (str.charAt(i)=="1") {
//					str+="0";
//				}
//		 }
		 
}
