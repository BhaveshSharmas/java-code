package MathsNumberSystem.questions;

public class hammingDistance {
    public static void main(String[] args) {
        System.out.println(distance(93,73));
    }

    static int distance(int x, int y) {

        int ans = x ^ y;
        int count = 0;

        while (ans > 0){
            if ((ans & 1) == 1){
                count++;
            }
            ans = ans >> 1;
        }

        return count;
    }

    static int checkp(int n) {
        int count = 0;
        while (n > 0) {
            n = n >> 1;
            count++;
        }
        return count;
    }
}
