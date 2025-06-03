package Sorting;

import java.time.LocalDateTime;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] array = {72,81,92,1,2};
        selectionSorting(array);
//        System.out.println(Arrays.toString(array));

        int[] array2 = {-4,-1,0,3,10};
        squareRoot(array2);
        System.out.println(Arrays.toString(array2));
    }

    static void selectionSorting(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            if (array[minIndex] != array[i]){
                swap(array,i,minIndex);
            }
        }
    }

    static void swap(int[] array, int first, int end){
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

    static void squareRoot(int[] nums){
        int n = nums.length;
        for(int i=0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }

        bs(nums);

    }

    static void bs(int[] nums){
        System.out.println(LocalDateTime.now());

            for (int i = 0; i <= nums.length; i++) {
                boolean isSwap = false;
                for (int j = 1; j < nums.length-i; j++) {
                    if (nums[j] < nums[j-1]){
                        int temp = nums[j-1];
                        nums[j-1] = nums[j];
                        nums[j] = temp;
                        isSwap = true;
                    }
                }
                if (!isSwap){
                    return;
                }
            }
            System.out.println(Arrays.toString(nums));
    }

}
