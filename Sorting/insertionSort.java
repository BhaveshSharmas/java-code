package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {5,2,4,3,1};
        insertion(array);
        System.out.println(Arrays.toString(array));
        insertionWhile(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertion(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (array[j] < array[j-1]){
                    swap(array,j,j-1 );
                }
            }
        }
    }

    static void insertionWhile(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            while(i+1<0) {
                if (array[i+1] < array[i+1-1]){
                    swap(array,i+1,i+1-1 );
                }
            }
        }
    }

    static void swap(int[] array, int first, int end){
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

}
