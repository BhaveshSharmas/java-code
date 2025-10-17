package recursion.permutations;

import java.util.ArrayList;

public class mazeBacktrack {
    public static void main(String[] args) {
        int ans = backtrack(3, 3);
//        System.out.println(ans);
        ArrayList<String> ansList = track("", 3, 3);
        System.out.println(ansList);

        int diagon = diagonal(3, 3);
//        System.out.println(diagon);
    }

    static int backtrack(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = backtrack(r - 1, c);
        int right = backtrack(r, c - 1);

        return left + right;
    }

    static ArrayList<String> track(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(track(p + "d", r - 1, c));
        }

        if (c > 1) {
            list.addAll(track(p + "r", r, c - 1));
        }


        return list;
    }

    static int diagonal(int r, int c) {

        if (r == 1 || c == 1) {
//            if (r == 1 && c == 1) {
//                return 1;
//            }
            return 1;
        }

        int left = diagonal(r - 1, c);
//        int center = diagonal(r - 1, c - 1);
        int right = diagonal(r, c - 1);


//        return left + center + right;
        return left + right;
    }

}
