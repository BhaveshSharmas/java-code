package recursion.merge;

import java.sql.Array;
import java.util.Arrays;

public class merchSort {
    public static void main(String[] args) {

        int[] array = {3, 2, 1, 4, 5, 6};
//        int[] array2 = {4, 5, 6};
//        System.out.println(Arrays.toString(merge(array)));
        mergeInPlace(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(mergeArrays(array,array2)));

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

    static void mergeInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeInPlace(arr, s, mid);
        mergeInPlace(arr, mid, e);

        mergeArraysInPlace(arr, s, mid, e);
    }

    private static void mergeArraysInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i = i + 1;
            } else {
                mix[k] = arr[j];
                j = j + 1;
            }
            k++;
        }

        while (i < mid) {
            mix[k++] = arr[i];
            i++;
        }

        while (j < e) {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

    }
}
