package Sorting.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class newcs {
    public static void main(String[] args) {
        int[] arrar = {4,3,2,7,8,2,3,1};
//        int[] arrar = {5,4,3,2,1};
        cs(arrar);
        System.out.println(Arrays.toString(arrar));
        System.out.println(cs(arrar));
    }

    public static ArrayList<Integer> cs(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == j+1){

            }else {
                arrayList.add(j+1);
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
