package V14BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15};
        System.out.println(binaryS(arr, 15));
    }

    static int binaryS(int[] array, int t) {
        int s = 0;
        int e = array.length - 1;



        while (s <= e) {
            int m = s + (e - s) / 2;
            System.out.println(m);

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
}
