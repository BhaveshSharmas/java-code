package MathsNumberSystem.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class countingBits {
    public static void main(String[] args) {
        int[] array = countingBits(5);
        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(countBits(5)));
    }
    static int[] countingBits(int n){
        int[] array = new int[n+1];

        for (int i = 0; i <= n; i++) {
            int count = 0;
            int s = i;
            while (s!=0){
                if ((s&1) != 0){
                    count++;
                }
                s = s>>1;
            }
            array[i] = count;
        }

        return array;
    }

    static public int[] countBits(int n) {

        int[] ans = new int[n + 1];
//        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i & (i - 1)] + 1;
        }
        return ans;
    }
}
