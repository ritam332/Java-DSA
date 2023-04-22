import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // direct shortcut  to find sorted array and binary search operation
//      int[] arr={1,5,8,9,60,31,-7};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr,8));
//        System.out.println(Arrays.binarySearch(arr,10));

        Scanner in=new Scanner(System.in);
        int lengthofArr=in.nextInt();
        int[] arr2=new int[lengthofArr];
        for (int i = 0; i < lengthofArr; i++) {
            arr2[i]=in.nextInt();
        }
        //Arrays.sort(arr2);
        int target=in.nextInt();
        System.out.println(binarySearch(arr2,target));


    }


    static int binarySearch(int[] arr, int target) {

            int start=0,end=arr.length-1;
        boolean isAscending=(arr[start]<arr[end]);
            while (start<=end){
                int mid=start+((end-start)/2);
                if (arr[mid]==target) return mid;
                if (isAscending){
                    if (target<arr[mid]){
                        end=mid-1;
                    }else start=mid+1;
                } else{
                    if (target>arr[mid]){
                        end=mid-1;
                    } else start=mid+1;
                }
            } return -1;

    }

}
