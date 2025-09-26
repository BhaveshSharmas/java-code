package recursion.Level1Questions;

public class sumRecursion {
    public static void main(String[] args) {
//        System.out.println((int)Math.log(8));
        System.out.println(printReverse(7231,0));
        System.out.println(isPalin(11191));
    }
    static int fun(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10)+fun(n/10);
    }

    static int printReverse(int n,int number){
        if (n<=0){
            return number;
        }
        number = number*10+(n%10);
        return printReverse(n/10,number);
    }

    static boolean isPalin(int n){
        if (n==printReverse(n,0)){
            return true;
        }
        return false;
    }
}
