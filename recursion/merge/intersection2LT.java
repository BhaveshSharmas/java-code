package recursion.merge;

import java.util.ArrayList;
import java.util.Arrays;

public class intersection2LT {
    public static void main(String[] args) {

        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] tes = {-100,-2,-3,1};

//        System.out.println(Arrays.toString(intersection(num1,num2)));
        Arrays.sort(tes);
        System.out.println(Arrays.toString(tes));
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
                mix.add(nums1[i]);
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
}
