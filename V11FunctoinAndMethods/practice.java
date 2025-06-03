package V11FunctoinAndMethods;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        maxNum(111, 22, 3);
        oddEven(121);
        factorial(9);
        palindrome(1245421);
        nNumbersSum(3);
    }

    public static void maxNum(int a, int b, int c) {
        Scanner sc = new Scanner(System.in);
        if (a > b || a > c) {
            System.out.println(a + " is Greater");
        } else if (b > c) {
            System.out.println(b + " is Greater");
        } else {
            System.out.println(c + " is Greater");
        }
    }

    public static void oddEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void factorial(int n) {

        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        System.out.println(ans);
    }

    public static void palindrome(int n) {
        int original = n;
        int check = 0;
        while (n > 0) {
            check = (check * 10) + n % 10; // 0 = (0 * 10) + 121 % 10 -> 1 from 121 to check = 1
            n = n / 10; // n from 121 to -> 121 / 10 -> 12
        }
        if (check == original) {
            System.out.println("yes");
        } else {
            System.out.println("false");
        }

    }

    public static void nNumbersSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }

}
