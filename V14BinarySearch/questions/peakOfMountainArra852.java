package V14BinarySearch.questions;

public class peakOfMountainArra852 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5    };
        System.out.println(peak(array));

    }

    static int peak(int[] array) {
        int s = 0;
        int e = array.length - 1;

        while (s!=e) {
            int m = s + (e - s) / 2;
//            System.out.println(m);

            if (array[m] > array[m+1]) {
                e = m;
            } else if (array[m+1] > array[m]) {
                s = m + 1;
            } else {
                return m;
            }

        }
        return e;
    }

}
