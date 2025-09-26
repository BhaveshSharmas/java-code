package recursion.pattern;

public class reversePattern {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if (n==1){
            System.out.print("*");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        print(n-1);
    }
}
