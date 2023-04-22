import java.util.Arrays;

public class BinarySearch2dArray {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter no. of row and col");
//        int row= in.nextInt(), col=in.nextInt();
//        int[][] arr2d=new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr2d[i][j]=in.nextInt();
//            }
//        }
//        System.out.println("Array is "+Arrays.deepToString(arr2d));

        int[][] array2d={{ 1,3,5}, {7,9,12}, {15,19,21}};
        int[][] array2d2={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=191, target2=2;
        System.out.println(Arrays.toString(search(array2d,target)));
        System.out.println(Arrays.toString(search(array2d2,target2)));

    }

    static int[] search(int[][] matrix, int target) {
        int row=0,col=matrix.length-1;
        while (row< matrix.length && col>=0){
            if (matrix[row][col]==target){
                return new int[]{row,col};
            }if (matrix[row][col]<target){
                row++;
            } else col--;
        } return new int[]{-1, -1};
    }
}
