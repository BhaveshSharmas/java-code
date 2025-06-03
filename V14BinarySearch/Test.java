package V14BinarySearch;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5, 5, 7, 7, 7, 8, 10};
        int target = 7;
        findFirst(arr, target);
    }

    public static void findFirst(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;
        int fo = 10;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == t) {
                fo = mid;
                end = mid - 1;
            } else if (mid < t) {
                start = arr[mid] + 1;
            } else {
                System.out.println(fo);
            }
        }

        System.out.println(fo);
    }
}