package V13LinearSearch;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6};
        int[][] array = {{5,5},{8,8},{7,7}};
        System.out.println(greaterInAllArraySum(array));

        int n = 123423231;
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println(countString(s));
        System.out.println(PrimeNum(17));
        System.out.println(sqrt(11));
        System.out.println(ar.length - 1);

    }

    static int countString(String s){
        int count = 0;
        for (char c : s.toCharArray()){
            count++;
        }
        return count;
    }

    static int greaterInAllArraySum(int[][] array){
        int sum = 0;
        int temp = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                temp = temp+array[row][col];
            }
            if (sum<temp){
                sum = temp;
                temp = 0;
            }

        }
        return sum;
    }

    static boolean PrimeNum(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while(c<n){
            if (n%c==0){
                return false;
            }
            c++;

        }

        return true;
    }

    static int sqrt(int n){
        int res = 1;
            while(res*res <= n){
            res++;
        }
        return res-1;
    }

}
