package Sorting.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMultipleDuplicates442 {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        findDuplicate(array);
        System.out.println(Arrays.toString(array));
        System.out.println(findDuplicate(array));
    }

    static List<Integer> findDuplicate(int[] nums){
        int i = 0;
        while(i<nums.length){
            int ci = nums[i]-1;
            if (nums[ci] != nums[i]){
                swap(nums,i,ci);
            }else {
                i++;
            }
        }
        List<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                arrayList.add(nums[j]);
            }
        }
        return arrayList;
    }

    static void swap(int[] array, int first, int end){
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

}
