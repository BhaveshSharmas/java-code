package recursion.merge;

import java.util.Arrays;

public class mergeSortedArrayLT {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 0, 0, 0};
        int[] array2 = {2, 5, 6};
        msa1(array1, 3, array2, 3);
    }

    static void msa(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;


        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }

        System.out.println(Arrays.toString(nums1));
    }

    static void msa1(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[n+m];
        while (i <= m-1 && j <= n-1) {
            if (nums1[i] < nums2[j]) {
                mix[k++] = nums1[i++];
            } else {
                mix[k++] = nums2[j++];
            }
        }

        while (j <= n-1) {
            mix[k++] = nums2[j++];
        }
        while (i <= m-1) {
            mix[k++] = nums1[i++];
        }

        for (int l = 0; l < mix.length; l++) {
            nums1[l] = mix[l];
        }

        System.out.println(Arrays.toString(nums1));
    }

}
