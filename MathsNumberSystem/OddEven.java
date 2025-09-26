package MathsNumberSystem;

public class OddEven {
    public static void main(String[] args) {
//        boolean n = isEven(68);
//        System.out.println(n);
//
//        int[] arr = {2,2,3,3,4,4,6};
//        System.out.println(ans(arr));

        System.out.println(8 == 1<<3);
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    static boolean isEven(int n){
        return (n & 1) != 1;
    }

    static int ans(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique = unique ^ n;
        }
        return unique;
    }

    static void check(int[] arr){

    }
}
