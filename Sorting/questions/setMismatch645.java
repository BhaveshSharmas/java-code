package Sorting.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class setMismatch645 {
    public static void main(String[] args) {
        int[] array = {1,2,4,2};
        mismatch(array);
//        System.out.println(Arrays.toString(array));
        int[] result = mismatch(array);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    static int[] mismatch(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIn = nums[i] - 1;
            if (nums[i] != nums[correctIn]){
                swap(nums,i,correctIn);
            }else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                return new int[]{j+1,nums[j]};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] array, int first, int end) {
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

}
