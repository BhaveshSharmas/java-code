import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
//        int[] array = {37, 12, 89, 4, 23, 67, 15, 90, 1, 56};
        int[] array = {9,6,4,2,3,5,7,0,1};
        int missin = Missing(array);
        System.out.println(missin);
    }

    static int Missing(int[] array){
        int n = array.length;
        int i = 0;
        while (i < array.length){
            int correctIndex = array[i];
            if (array[i] != array.length && array[i] != array[correctIndex]){
                swap(array,i,correctIndex);
            }else {
                i++;
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] != j){
                return array[j];
            }
        }
        return array.length;
    }

    static void swap(int[] array, int first, int end){
        int temp = array[first];
        array[first] = array[end];
        array[end] = temp;
    }

    static int[] BubbleSort(int[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            boolean isSwap = false;
            for (int j = 1; j <= arr.length-i-1; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if (!isSwap) break;
        }
        return arr;
    }
    static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = findMax(arr,0,last);
                int temp = arr[last];
                arr[last] = arr[max];
                arr[max] = temp;

        }
        return arr;
    }

    private static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static int swap(int a, int b){
        int c = a;
        a = b;
        b = c;
        return a+b;
    }

    static int[] insertionSort(int[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                } else if (array[j] >= array[j - 1]) {
                    break;
                }
            }
        }
        return array;
    }

    static int[] cyclicSort(int[] array){
        int i = 0;
        while (i < array.length) {
            int correct = array[i] -1;
            if (array[i] == array[correct]) {
                i++;
            } else {
                swap(array,i,correct);
            }
        }
        return array;
    }
    //[3,0,1]

}
