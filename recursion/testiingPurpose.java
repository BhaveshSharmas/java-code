package recursion;

public class testiingPurpose {
    public static void main(String[] args) {
        int ans = printNum(5,0);
        System.out.println(ans);
    }

    static int printNum(int num,int sum){
        if (num < 1){
            return sum;
        }
        sum = sum+num;
        return printNum(num-1,sum);
    }
}
