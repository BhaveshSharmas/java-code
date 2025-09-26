package recursion.subsetSubsequence;

import java.util.ArrayList;

public class abcSubsequence {
    public static void main(String[] args) {

        String string = "abc";
//        abc("", string);
//        System.out.println(abcList("", string));

        System.out.println(subseqAsciiList("","abc"));
    }

    static void abc(String p, String string) {
        if (string.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = string.charAt(0);

        abc(p + ch, string.substring(1));
        abc(p, string.substring(1));
    }

    static ArrayList<String> abcList(String p, String string) {
        if (string.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = string.charAt(0);

        ArrayList<String> left = abcList(p + ch, string.substring(1));
        ArrayList<String> right = abcList(p, string.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p, String string) {
        if (string.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = string.charAt(0);

        subseqAscii(p + ch, string.substring(1));
        subseqAscii(p, string.substring(1));
        subseqAscii(p + (ch + 0), string.substring(1));
    }

    static ArrayList<String> subseqAsciiList(String p, String string) {
        if (string.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = string.charAt(0);

        ArrayList<String> first = subseqAsciiList(p + ch, string.substring(1));
        ArrayList<String> second = subseqAsciiList(p, string.substring(1));
        ArrayList<String> third = subseqAsciiList(p + (ch + 0), string.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
