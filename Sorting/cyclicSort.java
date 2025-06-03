package Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] array = {3,5,3,1,4};
        cs(array);
        System.out.println(Arrays.toString(array));
    }

    static void cs(int[] array){
        int i = 0;
            while(i<array.length){
                int correctIndex = array[i]-1;
                if (array[i] != array[correctIndex]){
                    swap(array,i,correctIndex);
                }else {
                    i++;
                }
            }
    }

    static void swap(int[] array, int first, int end){
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

}
