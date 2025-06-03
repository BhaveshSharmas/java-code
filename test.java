import javax.swing.*;

public class test {
    public static void main(String[] args) {
        if (1 + 1 == 2) System.out.println("ritgh");
        else System.out.println("wrong");

        System.out.println(0 + 9 / 2);

        int[] ar = {1, 2, 3, 4, 5, 6};
        int lengt = ar.length;
        System.out.println(lengt);


        int[] arr = {1, 2, 3, 4, 5, 6};
        boolean n = firstbadVersion(arr);
        System.out.println(n);


    }

    static boolean firstbadVersion(int[] array) {

        int start = 0;
        int end = array.length;
        int mid = 0;
        int result = 0;

        while (start <= end) {//here ew are checking for the accensing or dessending;

            mid = start + (end - start) / 2;
            if (mid < 7) {
                start = mid + 1;
            } else if (mid > 7) {
                end = mid - 1;
            } else {
                return true;
            }

        }
        return false;
    }

}
