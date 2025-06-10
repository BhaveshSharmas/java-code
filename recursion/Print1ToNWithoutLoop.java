package recursion;

public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
//        System.out.println(print1n(5));
        print1n(5);
    }

    static void print1n(int n){ //5

        if (n <= 0){
            return;
        }

        print1n(n-1);
        System.out.println(n);
    }

}
