package V14BinarySearch.questions;

public class searchInInfiniteArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int target = 5;

        System.out.println(boundaries(array,target));
    }

    public static int boundaries(int[] infinite_array,int target){
        int start = 0;
        int end = 1;

        while(target > infinite_array[end]){
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return search(infinite_array, target, start, end);
    }

    public static int search(int[] array, int t,int start,int end){

        while (start <= end) {
            int m = start + (end - start) / 2;
//            System.out.println(m);

            if (t < array[m]) {
                end = m - 1;
            } else if (t > array[m]) {
                start = m + 1;
            } else {
                return m;
            }

        }
        return -1;
    }
}
