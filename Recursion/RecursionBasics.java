import java.util.*;
public class RecursionBasics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(factorial(7));
        //System.out.println(factorial(0));
        System.out.println(calculateSumOfFirstN(10));
        System.out.println(fibonacciNth(7));
        //System.out.println(fibonacciNth(25));
        fibonacciSeries(10);  System.out.println();

        //power calculation
        // System.out.println("Enter the number and power respectively");
        // int x=sc.nextInt(), n=sc.nextInt();
        // System.out.println("Ans is "+OptimizedPower(x,n));

        removeDuplicateString("helloworld",0,new StringBuilder(""),new boolean[26] );
        printBinaryString(4,0,"");
        


    }

    public static int factorial(int n) {
        if (n==0||n==1) return 1;
        return n*factorial(n-1);
    }

    public static int calculateSumOfFirstN(int n){
        if(n==1) return 1;
        return (n+calculateSumOfFirstN(n-1));
    }

    public static int fibonacciNth(int n){
        if(n==0 || n==1) return n;
        return fibonacciNth(n-1)+fibonacciNth(n-2);
    }

    public static void fibonacciSeries(int n){
            for (int i=0;i<=n ;i++ ) {
                System.out.print(fibonacciNth(i)+" ");
            }
            
            return ;
    }

    public static int OptimizedPower(int x,int n){    //calculating x^n
        if (n==0) return 1;
        int halfPower= OptimizedPower(x,n/2);
        int halfPowSquare= halfPower*halfPower;
        if (n%2 !=0) return x*halfPowSquare;

        return halfPowSquare;
    }

    public static void removeDuplicateString(String str,int index, StringBuilder sb,boolean[] map){
        if (index==str.length()) {  
            System.out.println(sb); return;
            
        }
        char currentChar=str.charAt(index);
        if (map[currentChar-'a']==true) {
            removeDuplicateString(str,index+1,sb,map);
        } else{
            map[currentChar-'a']=true;
            removeDuplicateString(str,index+1,sb.append(currentChar),map);
        }

    }

    public static void printBinaryString(int n,int lastPlace,String str){
        //base case
        if(n==0){System.out.println(str); return;}
//method 1......
        // if (lastPlace==0) {
        //     //sit 0 on chair n...
        //     printBinaryString(n-1,0,str+"0");
        //     //sit 1 on chair n...
        //     printBinaryString(n-1,1,str+"1");
        // }else{
        //     printBinaryString(n-1,0,str+"0");
        // }
//method 2.....
        printBinaryString(n-1,0,str+"0");
        if(lastPlace==0) printBinaryString(n-1,1,str+"1");
    }

    
}
