// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;
import java.util.*;

public class Array_List_Swap_Reverse_Max {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist=new ArrayList<>(3);
        arrlist.add(7); arrlist.add(8); arrlist.add(67); arrlist.add(45);
        System.out.println(arrlist);
        System.out.println(arrlist.contains(65));
        arrlist.set(0,108); arrlist.remove(3);
        System.out.println(arrlist);
        System.out.println(arrlist.get(0));
        //arrlist.get(3).add(7);

//        multidimensional Array....
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiArr=new ArrayList<>(10);
        for (int i=0;i<3;i++){
            multiArr.add(new ArrayList<>());
        }
        System.out.println(multiArr);
        System.out.println("Enter Int for ArrayList");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                (multiArr.get(i)).add(in.nextInt());
            }
        }
        System.out.println(multiArr);

        int[] arr={1,3,6,88,78,45,7};
        System.out.println("Real Array= "+ Arrays.toString(arr));
        swap(arr,1,5);
        System.out.println("Swapped Array= "+Arrays.toString(arr));
        System.out.println("Max Value= "+max(arr));
        System.out.println("Min Value = "+ min(arr));
        reverse(arr);
        System.out.println("Reversed Array= "+ Arrays.toString(arr));


    }
    private static void reverse(int[] arr) {
        int start=0, end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++; end--;
        }
    }

    private static int min(int[] arr) {
        int minVal=arr[0];
        for (int i=0; i<arr.length;i++){
            if (arr[i]<minVal) minVal=arr[i];
        } return minVal;
    }



    private static int max(int[] arr) {
        int maxVal=arr[0];
        for (int i=1;i<arr.length;i++){
            if (maxVal<arr[i]) maxVal=arr[i];
        } return maxVal;
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp=arr[i1];
        arr[i1]=arr[i2];  arr[i2]=temp;
    }
}
