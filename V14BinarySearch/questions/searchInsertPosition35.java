package V14BinarySearch.questions;

public class searchInsertPosition35 {
    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        System.out.println(findInsertLocation(array,2));
    }

    static int findInsertLocation(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if (array[mid]==target){
                return mid;
            }else if (target>array[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return start;
    }

}
