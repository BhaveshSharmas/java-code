package recursion.Level1Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {4, 29, 42, 45, 56, 61, 64, 74, 84, 0};
//        bs(array, 0, 1);
//        bubbleSort(array, array.length - 1, 0);
//        System.out.println(Arrays.toString(array));

        selectionSortRecursion(array, 0, 0, 0);
        System.out.println(Arrays.toString(array));
    }

    static void bs(int[] array, int it, int i) {
        if (it > array.length) {
            return;
        }
        if (i == array.length) {
            bs(array, it + 1, 1);
            return;
        }
        if (array[i - 1] > array[i]) {
            int temp = array[i - 1];
            array[i - 1] = array[i];
            array[i] = temp;
            bs(array, it, i + 1);
        }
        bs(array, it, i + 1);
    }

    static void bubbleSort(int[] array, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (array[c] > array[c + 1]) {
                int temp = array[c];
                array[c] = array[c + 1];
                array[c + 1] = temp;
            }
            bubbleSort(array, r, c + 1);
        } else {
            bubbleSort(array, r - 1, 0);
        }
    }

    static void selectionSortRecursion(int[] array, int r, int c, int smallest) {
        if (r == array.length) {
            return;
        }

        if (array[c] < array[smallest]) {
            smallest = c;
        }

        if (c == array.length - 1) {
            int temp = array[smallest];
            array[smallest] = array[r];
            array[r] = temp;
            selectionSortRecursion(array, r + 1, r + 1, r + 1);
        } else {

            selectionSortRecursion(array, r, c + 1, smallest);
        }


    }
}
