package Sorting.questions;

import java.util.Arrays;

public class findTheDuplicate287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums){
        int i = 0;
        while (i<nums.length){
            if (nums[i] != i+1){
                int ci = nums[i]-1;
                if (nums[ci] != nums[i]){
                    swap(nums,i,ci);
                }else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] array, int first, int end){
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

}
