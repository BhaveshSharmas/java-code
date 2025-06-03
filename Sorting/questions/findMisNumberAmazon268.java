package Sorting.questions;

import java.util.Arrays;

public class findMisNumberAmazon268 {
    public static void main(String[] args) {
        int[] array = {0,1};
        cyclic(array);
        System.out.println(Arrays.toString(array));
        System.out.println(cyclic(array));
    }

    // this is for sorting using cyclic sorting
    static int cyclic(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if (nums[i] < nums.length && nums[i] != nums[nums[i]]){
                swap(nums,nums[i],i);
            }else {
                i++;
            }

        }
// This is for checking which number is missing
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }


    static void swap(int[] array, int first, int end) {
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

}
