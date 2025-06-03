package Sorting;
import java.util.Arrays;

public class V19SelectionSort {
    public static void main(String[] args) {
        int[] array = {2,32,0,78,1};
//        System.out.println(getMax(array,0,2));
        selection(array);
        System.out.println(Arrays.toString(array));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] array, int first, int end){
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

    static int getMaxIndex(int[] array, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }

}
