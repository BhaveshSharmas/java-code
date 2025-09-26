package Sorting.questions;

import java.util.Arrays;

public class sortByParity {

    public static void main(String[] args) {
                     //0  1  2  3
//        int[] array = {3, 1, 2, 4};
        int[] array = {4,2,5,7};
//        int[] newArray = sortT(array);
//        System.out.println(Arrays.toString(newArray));

        int[] posit = sortParityTwo(array);
        System.out.println(Arrays.toString(posit));
    }

    static int[] sortT(int[] nums) {
        int first = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0){
                swap(nums,i,first);
                first++;
            }
        }
        return nums;
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

    static int[] sortParityTwo(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i%2 != nums[j] % 2 && nums[j] % 2 != (nums[j]+1) % 2){
                    swap(nums,i,i+1);
                }else {

                }
            }
        }
        return nums;
    }
}
