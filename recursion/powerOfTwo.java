package recursion;

public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(pot(3));
    }

    static boolean pot(int n){//n=16
        if (n % 2 != 0){
            return false;
        }
        if (n==1) {
            return true;
        }
        if (n<=0){
            return false;
        }

        return (pot(n/2));



//        while(n % 2 == 0){
//            n = n/2;
//        }
//        return n == 1;

    }

}
// 2 4 8 16 32 64 128 256