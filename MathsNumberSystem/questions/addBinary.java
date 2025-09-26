package MathsNumberSystem.questions;

public class addBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";

//        System.out.println(Integer.parseInt(a,2));

        System.out.println(addBinary(a, b));
    }

    static public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int total = digitA + digitB + carry;
            carry = total / 2;
            result.append(total % 2);

            i--;
            j--;

        }
        return result.reverse().toString();
    }
}
