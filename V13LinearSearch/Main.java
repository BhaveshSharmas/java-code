package V13LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 6};
        int[][] D2arr = { {1,2,3},
                        {4,5,6},
                        {7,13,9} };
        int[] arrat = {22, 1, 32, 4, 52, 62,212,44};
        int[] ans = searchIn2D(D2arr,13);
        System.out.println(Arrays.toString(ans));

        String string = "string";
//        System.out.println(Arrays.toString(string.toCharArray()));
//        System.out.println(searchCh(string,'e'));
//        System.out.println(searchch(string,'t'));
        System.out.println("This =" + " " + searchInRange(string, 's', 1, 3));
        System.out.println("Min =" + " " + findMin(arr));
//        System.out.println("search in D 2 Array =" + " " + searchIn2D(D2arr,13));

        System.out.println("Max In 2Darray ="+" "+max(D2arr));
        System.out.println("Max In 2Darray with EnhancedLoop ="+" "+maxE(D2arr));
        System.out.println("Even Numbers elements is array ="+" "+findEvenNumbers(arrat));
    }

    static int searchTarget(int[] arr, int target) {
        int element = 0;
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
//            element = arr[i];
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static boolean searchCh(String str, char Target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean searchch(String str, char Target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == Target) {
                return true;
            }
        }
        return false;
    }

    static boolean searchInRange(String str, char target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static int findMin(int[] array) {

        int element = array[0];

        if (array.length == 0) {
            return -1;
        }

        for (int i : array) {
            if (element > i) {
                element = i;
            }
        }
        return element;
    }
    //arr = { {1,2,3},
    //        {1,2,3},
    //        {1,2,3} }
    static int[] searchIn2D(int[][] D2array,int target){
        for (int row = 0; row < D2array.length; row++) {
            for (int col = 0; col < D2array[row].length; col++) {
                if (D2array[row][col] == target){
//                    return D2array[row][col];
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max<arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    static int maxE(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] row:arr) {
            for (int col:row) {
                if (max<col){
                    max = col;
                }
            }
        }
        return max;
    }

    static int findNumbers(int[] array) {
        int count = 0;
        for (int num : array){
            if (num%2 == 0){
                count++;
            }
        }
        return count;
    }

    static int findEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int count = 0;
        while (num!=0){
            count++;
            num = num/10;
        }
        if (count%2==0){
            return true;
        }
        return false;
    }

}
