package recursion.Level1Questions;

public class sortedOrNot {
    public static void main(String[] args) {
        int[] array = {1, 2, 31, 4, 5};
        System.out.println(find(array,31,0));
//        System.out.println(checkSort(array, 0));
    }

    static boolean checkSort(int[] array, int i) {
        if (i == array.length - 1) {
            return true;
        }
        return array[i] < (array[i + 1]) && checkSort(array, i + 1);
    }

    static boolean find(int[] array, int target, int i) {
        if (i == array.length){
            return false;
        }
        return (array[i] == target) || find(array,target,i+1);
    }
}
