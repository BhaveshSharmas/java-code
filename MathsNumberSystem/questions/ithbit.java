package MathsNumberSystem.questions;

public class ithbit {
    public static void main(String[] args) {
        fintIthBit(21,4);
    }
    static void fintIthBit(int n,int i){
        n = n >> (i-1);
        int and = n&1;
        System.out.println(and);
    }
}
