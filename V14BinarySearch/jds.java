package V14BinarySearch;

import java.util.Scanner;

public class jds {
    public static void main(String[] args) {
        double i = findsq(14);
        System.out.println(i);

        isPerfectSquare(17);
        coin();
        int sum = sum(5);
        System.out.println(sum);

        int[] arr = {8,7,5,4,3,2};

        isAssending(arr);

    }

    static void isAssending(int[] arr){
        int s = arr[0];
        int e = arr.length;
        if (s<e){
            System.out.println("Assending");
        }else {
            System.out.println("Desending");
        }
    }

    static double findsq(double n) {
        double s = 1;
        double e = n;
        double m = 0;
        double res = 0;
        double v = 0;

        while (s <= e) {
            m = (s + e) / 2;
            v = m * m;
            if (v <= n) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return e;

    }

    public static boolean isPerfectSquare(int num) {
        int x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;

    }

    static void coin() {
        int n = 6;
        int ans = 0;
        for (int row = 1; row <= n; row++) {
            if (n >= row) {
                n = n - row;
                ans++;
            }

        }
        System.out.println(ans);
    }

    static int sum(int n) {
        int s = 0;
        int e = n;
        int m = 0;
        int b = 0;

        while (s <= e) {
            m = s + (e - s) / 2;
            if (m * (m + 1) / 2 <= n) {
                s = m + 1;
            } else {
                e = m - 1;
            }

        }
        return e;
    }


}