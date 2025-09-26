package recursion.Level1Questions;

public class printBack {
    public static void main(String[] args) {
//        one2N(5);
//        N2One(5);
//        System.out.println(fun(5));
    }
    static void one2N(int n){
        if (n==0){ //Thisis base condition
            return;
        }
        one2N(n-1);
        System.out.println(n);
    }

    static void N2One(int n){
        if (n==0){ //Thisis base condition
            return;
        }
        System.out.println(n);
        one2N(n-1);
    }

    static int fun(int n){
        if (n==1){
            return 1;
        }
        return n*fun(n-1);
    }
}
