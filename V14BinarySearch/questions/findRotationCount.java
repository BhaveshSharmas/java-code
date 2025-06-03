package V14BinarySearch.questions;

public class findRotationCount {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,7};

        System.out.println(rotationCount(array));
    }

    //same code ads pivot but plus one in the answer for the rotation count

    public static int rotationCount(int[] array){
        int pivot = pivot(array);
        return pivot+1;
    }

    private static int pivot(int[] array) {

        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int m = start + (end - start) / 2;

            //4 cases for find the pivot

            if (m<end && array[m] > array[m+1]){
                return m;
            }else if (m>start && array[m] < array[m-1]){
                return m-1;
            }else if (array[start] > array[m]){
                end = m-1;
            }
            else {
                start = m+1;
            }

        }
        return -1;
    }
}
