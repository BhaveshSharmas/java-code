package V14BinarySearch.questions;

public class PeakMountainIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1};

        int ans = findPeak(arr);
        System.out.println(ans);
    }

    static int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int m;

        while(s<e){
            m = s + (e - s) / 2;
            if (arr[m]>arr[m+1]){
                e=m;
            }else {
                s=m+1;
            }

        }
        return s;
//        while (s != e) {
//            m = s + (e - s) / 2;
//            int element = m;
//            if (arr[element] < arr[element + 1]) {
//                s = element + 1;
//            } else if (arr[element] < arr[element - 1]) {
//                e = element - 1;
//            } else {
//                return m;
//            }
//        }
//        return e;

    }
}
