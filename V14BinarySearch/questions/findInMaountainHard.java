package V14BinarySearch.questions;

public class findInMaountainHard {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,1};

        System.out.println(search(array,3));

    }

    static int search(int[] array, int target) {
        int peak = peak(array);
        int firstTry = binaryS(array,target,0,peak);

        if (firstTry!=-1){
            return firstTry;
        }else {
            int lastTry = binaryS(array,target,peak,array.length-1);
            return lastTry;
        }
    }

    static int peak(int[] array) {
        int s = 0;
        int e = array.length - 1;

        while (s != e) {
            int m = s + (e - s) / 2;
//            System.out.println(m);

            if (array[m] > array[m + 1]) {
                e = m;
            } else if (array[m + 1] > array[m]) {
                s = m + 1;
            } else {
                return m;
            }

        }
        return e;
    }

    static int binaryS(int[] array, int t, int s, int e) {


        while (s <= e) {
            int m = s + (e - s) / 2;

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

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
