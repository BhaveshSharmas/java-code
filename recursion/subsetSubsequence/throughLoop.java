package recursion.subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class throughLoop {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
//        System.out.println(subset(array));
        List<List<Integer>> list = subset(array);

        for (List<Integer> l : list) {
            System.out.println(l);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }
}
