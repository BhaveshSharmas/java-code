package V11FunctoinAndMethods;

public class Main { //you can initialise one variable only once in a method and you can not use things out of scope; only modified.
    public static void main(String[] args) {

        int a = 10;
        boolean ans = PrimeNum(31);
        System.out.println("Prime ="+" "+ans);
//        armStrong(407);
        isArmStrong();
        {
//            int a = 9;//this will give error
            a = 9;
            int c = 10;
            System.out.println(a);
        }
        System.out.println(a);
//        System.out.println(c); //this will give not found error; because c ican not be accesseble outside the block;

    }

    static boolean PrimeNum(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while(c<n){
            if (n%c==0){
                return false;
            }
            c++;

        }

        return true;
    }

    static void isArmStrong(){
        for (int i = 0; i < 1000; i++) {
            if (armStrong(i)){
                System.out.print(i+",");
            }
        }
    }

    static boolean armStrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum+rem*rem*rem;
        }
        if (sum == original){
            return true;
        }else {
            return false;
        }

    }


}
