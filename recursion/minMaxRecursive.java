package recursion;

public class minMaxRecursive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 99, 4, 5, 0};
        int n = array.length;

        System.out.println(rec(array, n) + " " + recMax(array, n));
    }

    static int rec(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }

        int min = rec(array, n - 1);


        if (array[n - 1] < min) {
            return array[n - 1];
        } else {
            return min;
        }

    }

    static int recMax(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }

        int max = recMax(array, n - 1);


        if (array[n - 1] < max) {
            return max;
        } else {
            return array[n - 1];
        }

    }
}
