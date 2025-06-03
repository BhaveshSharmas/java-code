package Sorting;

import java.time.LocalDateTime;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {3,1,5,4,2};
        bs(array);
        System.out.println(Arrays.toString(array));
    }

    static void bs(int[] array){
        System.out.println(LocalDateTime.now());

        for (int i = 0; i <= array.length; i++) {
            boolean isSwap = false;
            for (int j = 1; j < array.length-i; j++) {
                if (array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap){
                return;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(LocalDateTime.now());
    }

}
