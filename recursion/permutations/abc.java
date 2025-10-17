package recursion.permutations;

import java.util.ArrayList;

public class abc {
    public static void main(String[] args) {
        String abc = "abc";
        abc("", abc);
        ArrayList<String> ar = abcAL("", abc);
        System.out.println(ar);
    }

    static void abc(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            abc(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> abcAL(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            arrayList.addAll(abcAL(f + ch + s, up.substring(1)));
        }

        return arrayList;

    }
}
