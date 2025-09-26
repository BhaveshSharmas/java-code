package MathsNumberSystem;

public class magicNumberBinary {
    public static void main(String[] args) {
        int n = 6; //110
        magicPro(6);
//        int lsst = n&1;
//        System.out.println(lsst);
    }

    static void magicPro(int n){
        int ans = 0;
        int base = 5;
        while (n>0){
            int last = n&1;
            ans = ans + last*base;
            base = base * 5;
            n = n>>1;
        }

        System.out.println(ans);
    }
}
//555
//110