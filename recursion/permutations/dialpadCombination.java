package recursion.permutations;

public class dialpadCombination {
    public static void main(String[] args) {
        int num = 65;
        char n = (char) num;
        String s = "23";
        int digit = s.charAt(0) - '0';
//        System.out.println(digit);

        function1("","89");

//        System.out.println((int)('a'));

//        for (int i = 0; i < 3; i++) {
//            System.out.println((char)('a'+i));
//        }

//        function(1,2);9
//        function1("","12");

    }

    static void function(int num, int num2) {
        int start = num * 3;
        for (int i = (num - 1) * 3; i < num * 3; i++) {
            for (int j = start; j < num2 * 3; j++) {
                System.out.println((char) ('a' + i) + "" + (char) ('a' + j));
            }
        }
    }

    static void function1(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            function1(p+((char)('a'+i)),up.substring(1));
        }

    }
}
