package recursion;

public class reduceSteps {
    public static void main(String[] args) {
        int nf = 14;
        System.out.println(steps(nf, 0));
    }

    static int steps(int n, int count) {
        if (n <= 0) {
            return count;
        }
        int nn = 0;
        if (n % 2 == 0) {
            nn = n / 2;
            count++;
            return steps(nn, count);
        } else {
            nn = n - 1;
            count++;
            return steps(nn, count);
        }

    }
}
