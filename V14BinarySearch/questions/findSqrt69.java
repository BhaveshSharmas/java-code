package V14BinarySearch.questions;

public class findSqrt69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int res = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid*mid;
            if (square > x) {
                end = mid - 1;
            } else if (square < x) {
                start = mid + 1;
                res = mid;
            }else {
                return mid;
            }
        }

        return res;
    }
}
