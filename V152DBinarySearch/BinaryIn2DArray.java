package V152DBinarySearch;

import java.util.Arrays;

public class BinaryIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(twoDsearch(array,7)));
//        System.out.println(array.length - 1);
//        System.out.println(BinarySearch2D(array,8));
    }

    public static boolean BinarySearch2D(int[][] array2d, int target) {
        int n = array2d.length;
        int m = array2d[0].length;
        int start = 0;
        int end = (n * m) - 1;
//        System.out.println(end);

        while (start <= end) {
            int mid = (start + end) / 2;
            int row = mid / m;
            int col = mid % m;

            if (array2d[row][col] == target) {
                System.out.println(array2d[row][col]);
                System.out.println("Target found at index: [" + row + "][" + col + "]");
                return true;
            } else if (array2d[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;

    }

    static int[] twoDsearch(int[][] array, int target) {
        int r = 0;
        int c = array.length - 1;

        while (r < array.length && c >= 0) {
            if (target == array[r][c]) {
                return new int[]{r, c};
            } else if (target > array[r][c]) {
                r++;
            } else {
                c--;
            }
        }

        return new int[]{-1, -1};

    }

}
