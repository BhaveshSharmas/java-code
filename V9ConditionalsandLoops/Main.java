package V9ConditionalsandLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }
//        whilell();
//        max();
//        chatfirst();
        Notfibonacci();
        reverceUsingTen();
        findCountOfNumer();
    }

    static void whilell() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 2) {
            System.out.println("Notoutenteragain");
            n = sc.nextInt();
        }
        System.out.println("Outoftheprograme");
    }

    static void max(){
        int a=10;
        int b=11;
        int c = 20;
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }

    static void chatfirst(){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
        System.out.println(ch);

    }

    static void Notfibonacci(){
        int num = 10;
        int ans = 0;
        for (int i = 0; i <=num ; i++) {
            ans = ans+i;
        }
        System.out.println(ans);
    }

    public static void reverceUsingTen() {
        int n = 34897;
        int nn = 0;
        while(n>0){
            int rem = n%10;
            nn = (nn*10)+rem;
            n = n/10;
        }
        System.out.println(nn);
    }

    static void findCountOfNumer(){
        int n = 222222; //findthecountof the number 3
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {     //logic
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }

}
