import java.lang.reflect.Method;
import java.util.Arrays;

class BinarySearch2dArrayPart2 {
    public static void main(String[] args) {
        int[][] arr2d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        int target = 9;
        // int[] ans = search(arr2d, target);
        System.out.println(Arrays.toString(search(arr2d, target)));
    }

    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0, rEnd = rows - 1, cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + ((rEnd - rStart) / 2);
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        if (target <= matrix[rStart][cMid - 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    private static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + ((cEnd - cStart) / 2);
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

}