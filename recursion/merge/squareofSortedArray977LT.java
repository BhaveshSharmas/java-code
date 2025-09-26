package recursion.merge;

import java.util.Arrays;

import static recursion.merge.merchSort.merge;

public class squareofSortedArray977LT {

    public static void main(String[] args) {
        int[] array = {-4,-1,0,3,10};
//        System.out.println(Arrays.toString(square(array)));
        System.out.println(Arrays.toString(simpleVersion(array)));
    }

    static int[] square(int[] nums) {
        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i] * nums[i];
        }

        return merge(newArray);
    }

    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArrays(left, right);
    }

    private static int[] mergeArrays(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i = i + 1;
            } else {
                mix[k] = right[j];
                j = j + 1;
            }
            k++;
        }

        while (i < left.length) {
            mix[k++] = left[i++];
        }

        while (j < right.length) {
            mix[k++] = right[j++];
        }
        return mix;
    }

    static int[] simpleVersion(int[] nums){
        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;

        int[] ans = new int[nums.length];

        while (i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];

            if (left > right){
                ans[k--] = left;
                i++;
            }else {
                ans[k--] = right;
                j--;
            }
        }

        return ans;
    }
}
