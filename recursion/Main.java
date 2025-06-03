package recursion;
//Recursion its very easy
public class Main {
    public static void main(String[] args) {
        //write a funtion that prints hello worlds
        int i = 0;
        print(1);

    }

    static void print(int n){
        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //tail recursion
        print(n + 1);
    }

}
