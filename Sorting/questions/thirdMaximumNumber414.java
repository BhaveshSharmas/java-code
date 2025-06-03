package Sorting.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class thirdMaximumNumber414 {
    public static void main(String[] args) {
        int[] array = {1,1,2};
//        System.out.println(thirdMax(array));
        System.out.println(third(array));
    }

    static void thirdMax(int[] nums){
        int fl = 0;
        int sl = 0;
        int tl = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > fl){
                tl = sl;
                sl = fl;
                fl = nums[i];
            }else if (nums[i] > sl){
                tl = sl;
                sl = nums[i];
            }else if (nums[i] > tl){
                tl = nums[i];
            }
        }

        System.out.println(fl+"+"+sl+"+"+tl);

    }

    static int third(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > list.get(0)){
                list.set(2,list.get(1));
                list.set(1,list.get(0));
                list.set(0,nums[i]);
            }
            else if (nums[i] > list.get(1)){
                list.set(2,list.get(1));
                list.set(1,nums[i]);
            }else if (nums[i] < list.get(1)){
                list.set(2,nums[i]);
            }
        }

        if (list.get(2) == 0 || list.get(2) == list.get(1) && list.get(2) < list.get(0)){
            return list.get(0);
        }else {
            return list.get(2);
        }

//        System.out.println(list);
//        System.out.println(fl+"+"+sl+"+"+tl);

    }

}
