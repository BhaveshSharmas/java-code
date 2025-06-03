package Sorting.questions;

import java.util.Arrays;

public class firstMissingPositive41 {
    public static void main(String[] args) {
        int[] array = {3, 4, -1, 1};
        fMS(array);
        System.out.println(Arrays.toString(array));
        System.out.println(fMS(array));
    }

    static int fMS(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if (nums[i] <= 0 ){
                i++;
            }else {
                int ci = nums[i] - 1;
                if (nums[i] != nums[ci]) {
                    swap(nums, ci, i);
                } else {
                    i++;
                }
            }



        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return -1;
    }

    static void swap(int[] array, int first, int end) {
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

}
