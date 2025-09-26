package recursion.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class mergingLT56 {
    public static void main(String[] args) {
        int[][] array = {{1, 3}, {2, 4}, {2, 6}, {8, 9}, {8, 10}, {15, 18}};

        int[][] cc = answer(array);
//        answer(array);

        for (int[] row : cc) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] answer(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> arrayList = new ArrayList<>();
        int n = intervals.length;

        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!arrayList.isEmpty() && end <= arrayList.get(arrayList.size() - 1)[1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            int[] merged = new int[]{start, end};
            arrayList.add(merged);
        }


        return arrayList.toArray(new int[arrayList.size()][]);
    }


    static ArrayList<int[]> damn(int[][] array) {
        ArrayList<int[]> al = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i][array[i].length - 1] >= array[i + 1][0]) {
//                mergex(array[i],array[i+1],true,al);
            } else {
//                mergex(array[i],array[i+1],false,al);
            }
        }
        return al;
    }

    static void mergex(int[] nums1, int[] nums2, boolean t, ArrayList<int[]> al) {
        int[] newArray = new int[nums1.length];

        if (t == true) {
            newArray[0] = nums1[0];
            newArray[newArray.length - 1] = nums2[nums1.length - 1];
            al.add(newArray);
        } else {
            al.add(nums1);
            al.add(nums2);
        }

    }

}
