package recursion.merge;

import java.util.ArrayList;
import java.util.Arrays;

public class simpleInterval {
    public static void main(String[] args) {
        int[][] array = {{1, 3}, {2, 4}, {2, 6}, {8, 9}, {8, 10}, {15, 18}};

        ArrayList<int[]> cc = sii(array);

        for (int[] row : cc) {
            System.out.println(Arrays.toString(row));
        }
    }

    static ArrayList<int[]> si(int[][] num1) {
        Arrays.sort(num1, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> array = new ArrayList<>();
        int n = num1.length;
        for (int i = 0; i < n; i++) {

            if (array.isEmpty() || num1[i][0] >= array.getLast()[1]){
                array.add(num1[i]);
            }else {
                array.getLast()[1] = Math.max(array.getLast()[1],num1[i][1]);
            }

        }

        return array;
    }

    static ArrayList<int[]> sii(int[][] num1) {
        Arrays.sort(num1, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> array = new ArrayList<>();
        array.add(num1[0]);
        int n = num1.length;
        for (int i = 1; i < n; i++) {

            if (num1[i][0] >= array.getLast()[1]){
                array.add(num1[i]);
            }else {
                array.getLast()[1] = Math.max(array.getLast()[1],num1[i][1]);
            }

        }

        return array;
    }
}
