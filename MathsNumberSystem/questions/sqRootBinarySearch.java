package MathsNumberSystem.questions;

public class sqRootBinarySearch {
    public static void main(String[] args) {
        System.out.println(prfct_sqrt(40));
    }

    static int sqrt(int n) {
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid*mid < n){
                s = mid+1;
            }
            else if (mid*mid > n){
                e = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int prfct_sqrt(int n) {
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid*mid < n){
                s = mid+1;
            }
            else if (mid*mid > n){
                e = mid - 1;
            }
            else  {
                return mid;
            }
        }
        return -1;
    }
}
