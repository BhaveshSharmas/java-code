package Sorting.quickSort;

import java.util.Arrays;

public class pivot {
    public static void main(String[] args) {
        int[] array = {5, 4, 2, 3, 1};
        recursive(array, 0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void recursive(int[] array, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = array[m];

        while (s <= e) {
            while (array[s] < pivot) {
                s++;
            }
            while (array[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;

                s++;
                e--;
            }

        }
        recursive(array, low, e);
        recursive(array, s, hi);
    }

    static void function(int[] array, int p) {
        int s = 0;
        int e = array.length - 1;


        while (s < e) {
            if (array[s] >= array[p] || array[e] <= array[p]) {
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;
                s++;
                e--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
