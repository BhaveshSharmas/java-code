package V14BinarySearch.questions;

public class findSingleElementInSortedArray540 {
    public static void main(String[] args) {
        int[] aray = {1,1,2,3,3,4,4,8,8};
        int[] aray2 = {3,3,7,7,10,11,11};
        int[] aray3 = {1,2,2,3,3};
        System.out.println(binaryS(aray3));
    }

    static int binaryS(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m%2 == 0){
                if (nums[m] == nums[m-1]){
                    e = m-1;
                }else if (nums[m] == nums[m+1]){
                    s = m+1;
                }
                else {
                    return nums[m];
                }
            }else if (m%2 != 0){
                if (nums[m] == nums[m-1]){
                    s = m+1;
                }else if (nums[m] == nums[m+1]){
                    e = m-1;
                }
                else {
                    return nums[m];
                }
            }else {
                return m;
            }
        }
        return -1;
    }

}
