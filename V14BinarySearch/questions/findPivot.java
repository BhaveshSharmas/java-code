package V14BinarySearch.questions;

public class findPivot {
    public static void main(String[] args) {

        int[] array = {4,5,6,7,0,1,2};

//        System.out.println(findpivot(array));
        System.out.println(search(array,6));

    }

    //this will not work in duplicate values

    static int search(int[] nums, int target){
        int pivot = findpivot(nums);
        int t = 0;

        //if there is no pivot that means this is not a rotated array
        if (pivot == -1){
            return binaryS(nums,target,0,nums.length-1);
        }

        if (nums[pivot] == target){
            return pivot;
        }
        else if (target >= nums[0]){
            return binaryS(nums,target,0,pivot-1);
        }
        return binaryS(nums,target,pivot+1,nums.length-1);
    }



    static int findpivot(int[] array){
        int start = 0;
        int end = array.length - 1;
        int pivot = 0;

        while(start <= end){
            int m = start + (end - start) / 2;

            //4 cases for find the pivot

            if (m<end && array[m] > array[m+1]){
                return m;
            }else if (m>start && array[m] < array[m-1]){
                return m-1;
            }else if (array[start] > array[m]){
                end = m-1;
            }
            else {
                start = m+1;
            }

        }
        return -1;
    }

    static int binaryS(int[] array, int t, int s, int e) {

        while (s <= e) {
            int m = s + (e - s) / 2;
//            System.out.println(m);

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

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
