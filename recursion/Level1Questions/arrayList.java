package recursion.Level1Questions;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 89};
        int[] array2 = {1, 4, 3, 4, 4, 6, 4, 8, 4};
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println(fun(array, list, 0));//this finds the target
        System.out.println(findIndex(array2, 4, list2, 0));//this finds the target indexs
    }

    static List<Integer> fun(int[] array, List list, int i) {
        if (i == array.length) {
            return list;
        }
        if (array[i] % 2 == 0) {
            list.add(array[i]);
        }
        return fun(array, list, i + 1);
    }

    static List<Integer> findIndex(int[] array, int target, List list, int i) {
        if (i == array.length) {
            return list;
        }
        if (array[i] == target) {
            list.add(i);
        }
        return findIndex(array, target, list, i + 1);
    }
}
