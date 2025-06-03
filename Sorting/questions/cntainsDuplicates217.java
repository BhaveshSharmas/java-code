package Sorting.questions;

import java.util.Arrays;

public class cntainsDuplicates217 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        containsDuplicate(array);
        System.out.println(Arrays.toString(array));
        System.out.println(containsDuplicate(array));
    }
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (nums[j] < nums[j-1]){
                    swap(nums,j,j-1 );
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i<nums.length-1 && nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    static void swap(int[] array, int first, int end) {
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

}
