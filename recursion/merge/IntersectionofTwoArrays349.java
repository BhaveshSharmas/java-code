package recursion.merge;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArrays349 {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};

        System.out.println(Arrays.toString(intersection(num1,num2)));
    }
    static int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;

        ArrayList<Integer> mix = new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            if (nums1[i] == nums2[j]){
                if (!exist(mix,nums1[i])){
                    mix.add(nums1[i]);

                }
                i = i+1;
                j = j+1;
            }else if (nums1[i]<nums2[j]){
                i++;
            }else {
                j++;
            }

        }

        int[] array = new int[mix.size()];
        for (int l = 0; l < mix.size(); l++) {
            array[l] = mix.get(l);
        }

        return array;
    }
    static boolean exist(ArrayList<Integer> array,int n){
        boolean isExist = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == n){
                isExist = true;
            }
        }
        return isExist;
    }
}
