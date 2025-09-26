package V14BinarySearch.questions;

import java.util.Arrays;

public class VQuestionCeiling {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};

        System.out.println(floorNumber(array,15));
    }

    static int Binary(int[] array, int t) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (t < array[m]) {
                end = m - 1;
            } else if (t > array[m]) {
                start = m + 1;
            }else {
                return m;
            }
        }
        
        return start;
    }

    static int floorNumber(int[] array, int t) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (t < array[m]) {
                end = m - 1;
            } else if (t > array[m]) {
                start = m + 1;
            }else {
                return m;
            }
        }
        //ask feel belive action receive rb->ask believe receive
        //sub concious does not brake without concious -> affirmation write 5-55 369=45 days
        //doubt != belive
        return end;
    }
}
