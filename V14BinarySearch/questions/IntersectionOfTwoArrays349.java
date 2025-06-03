package V14BinarySearch.questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums = {9,4,9,8,4};

//        System.out.println(Arrays.toString(sortArray(nums)));
        System.out.println(Arrays.toString(intersection(nums1, nums)));
    }

    static int[] intersection(int[] array1, int[] array2) {
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < array2[i-1]){
                array2 = sortArray(array2);
            }else {

            }
        }
        ArrayList<Integer> sameNumbers = new ArrayList<>();
        for (int i = 0; i <= array1.length - 1; i++) {
            int temp = binaryS(array2, array1[i]);
            if (temp == -1) {

            } else if (sameNumbers.contains(array2[temp])){

            }
            else if (array2[temp] == array1[i]) {
                sameNumbers.add(array2[temp]);
            }
        }
        int[] result = new int[sameNumbers.size()];
        for (int i = 0; i < sameNumbers.size(); i++) {
            result[i] = sameNumbers.get(i);
        }
        return result;
    }

    static int binaryS(int[] array, int t) {
        int s = 0;
        int e = array.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (t < array[m]) {
                e = m - 1;
            } else if (t > array[m]) {
                s = m + 1;
            } else {
                return m;
            }

        }
        return -1;
    }

    public static int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
