package MathsNumberSystem.questions;

public class reverseBits {
    public static void main(String[] args) {
//        System.out.println(reverseBits(25));
        System.out.println(hammingWeight(128));
    }
    static int reverseBits(int n){
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int ans = n&1;
            result = result<<1 | ans;
            n = n>>1;
        }
        return result;
    }

    static int numb(int n){
            int ans = 0;
            while(n>0){
                if ((n&1) != 0){
                    ans++;
                }
                n = n>>1;
            }
            return ans;
    }

    static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // drops the lowest set bit
            count++;
        }
        return count;
    }
}
