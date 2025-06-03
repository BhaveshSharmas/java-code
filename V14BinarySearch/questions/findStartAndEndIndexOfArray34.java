package V14BinarySearch.questions;

import java.util.Arrays;

public class findStartAndEndIndexOfArray34 {
    public static void main(String[] args) {

        int[] array = {1,4, 4, 4, 4, 5, 6};
        int target = 4;

        int[] tt = ra(array,target);
        System.out.println(Arrays.toString(tt));
    }

    public static int[] ra(int[] array, int target){

        int[] ans = {-1,-1};
        ans[0] = range(array,target,true);
        ans[1] = range(array,target,false);

        return ans;
    }

    public static int range(int[] array, int target,boolean findStart) {
        int start = 0;
        int end = array.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            }else {
                ans = mid;
               if (findStart){
                   end = mid-1;
               }else{
                   start = mid+1;
               }
            }
        }
        return ans;
    }
}
