package MathsNumberSystem.questions;

public class prime {
    public static void main(String[] args) {
        int n = 20;
//        for (int i = 0; i <= n; i++) {
//            System.out.println(isPrime(i));
//        }
        sieve(40);
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <=n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    static void sieve(int n){
        boolean[] array = new boolean[n+1];
        for (int i = 2; i*i<=n; i++) {
            if (!array[i]){
                for (int j = i*2; j <= n; j+=i) {
                    array[j] = true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if (!array[i]){
                System.out.println(i);
            }
        }
    }
}
