package V14BinarySearch.questions;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        char[] charray = {'a', 'b', 'c', 'd'};
//        System.out.println("length of char arr"+charray.length);
//        int n = closestElement(array, 15);
//        System.out.println(n);

//        char c = charFind(charray, 'd');
//        System.out.println("ans"+" "+c);
        char v = nextGreatestLetter(charray, 'b');
        System.out.println(v);

        int[] ar = {5, 7, 7, 8, 8, 10};
        int[] vi = fingRange(ar, 6);
        System.out.println(Arrays.toString(vi));

    }

    static int closestElement(int[] array, int t) {
        int s = 0;
        int e = array.length - 1;
        int m = 0;
        int ans = 0;

        while (s <= e) {
            m = s + (e - s) / 2;
            if (array[m] > t) {
                e = m - 1;
                ans = m;
            } else if (array[m] < t) {
                s = m + 1;
            } else {
                return m;

            }
        }
        return s;
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int s = 0;
        int e = letters.length;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target < letters[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return letters[s % letters.length];


    }

    static int[] fingRange(int[] array, int target) {

        int[] ans = {-1, -1};
        ans[0] = findStart(array, target, true);
        ans[1] = findStart(array, target, false);


        return ans;
    }

    static int findStart(int[] array, int target, boolean fndstart) {
//        int[] ar = {5, 7, 7, 7, 8, 9};
        int s = 0;
        int e = array.length - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target > array[m]) {
                s = m + 1;
            } else if (target < array[m]) {
                e = m - 1;
            } else {
                ans = m;
                if (fndstart) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }

        }
        return ans;
    }

    static int findend(int[] array, int target) {
//        int[] ar = {5, 7, 7, 7, 8, 9};
        int s = 0;
        int e = array.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target < array[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }
        return e;
    }

}
