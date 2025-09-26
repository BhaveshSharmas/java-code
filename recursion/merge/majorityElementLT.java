package recursion.merge;

import java.util.Arrays;


public class majorityElementLT {
    public static void main(String[] args) {
        int[] num1 = {2, 2, 1, 1, 1, 3, 3, 3, 3, 3, 2, 2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        System.out.println(occurence(num1));
    }

    static int[] mergSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;

        int[] left = mergSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergSort(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeArray(left, right);
    }

    static int[] mergeArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] mix = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mix[k] = arr1[i++];
            } else {
                mix[k] = arr2[j++];
            }
            k++;
        }

        while (i < arr1.length) {
            mix[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mix[k++] = arr2[j++];
        }

        return mix;
    }

    static int occurence(int[] num1) {
        int[] sortedArray = mergSort(num1);

        int element = sortedArray.length / 2;

        System.out.println(element);

        return sortedArray[element];
    }

    //this is some other persons code snippet
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int curNum = nums[0];
        int streak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (curNum == nums[i]) {
                streak++;

                if (streak > nums.length / 2) {
                    return curNum;
                }

            } else {
                streak = 1;
                curNum = nums[i];
            }
            System.out.println(curNum);
            System.out.println(streak);
        }

        return -1;
    }
}
