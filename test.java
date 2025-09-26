import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        int[] array = {6, 1, 2, 3, 4, 5};
//        int[] array2 = {3,4,5,6,7,0,1,2};
//        System.out.println(Pivot(array2)+1);
        int[] numbers = {7, 2, 5, 10, 8};
        System.out.println(easy(numbers,2));
    }

    static int easy(int[] nums,int k) {

        System.out.println(56);

        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

        //Now Binary Search on the array that you create upper.

        while (start < end) {
            int mid = start + (end - start) / 2;
            //15
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum = sum + num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return end;
    }

    static int Pivot(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            } else if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }
            if (array[start] > array[mid]) {
                end = mid - 1;
            }
            if (array[start] < array[mid]) {
                start = mid + 1;
            }

        }
        return -1;
    }
}