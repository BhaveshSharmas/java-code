package V14BinarySearch.questions;

import static V14BinarySearch.questions.IntersectionOfTwoArrays349.sortArray;

public class CheckNanditsDoucbleExistBinarySearch1346 {
    public static void main(String[] args) {

        int[] array = {10,2,5,3};
        int[] array2 = {3,1,7,11};

        System.out.println(checknAndDoubleExist(array));
//        System.out.println(binaryS(array,10));

    }

    public static boolean checknAndDoubleExist(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            int temp = binaryS(array,array[i]*2);
            if (temp != -1){
                return false;
            }
            else if (temp == array[i]*2){
                return true;
            }
        }
        return false;
    }

    static int binaryS(int[] array, int t) {

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]){
                array = sortArray(array);
            }}

        int s = 0;
        int e = array.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (t < array[m]) {
                e = m - 1;
            } else if (t > array[m]) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

}
