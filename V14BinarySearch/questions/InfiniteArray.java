package V14BinarySearch.questions;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        find(array,2);
    }

    static int find(int[] arr,int t){
        int s = 0;
        int e = 1;

        while(t>arr[e]){
            int ns = e+1;
            e =  e+(e - s + 1)*2;
            System.out.println(ns+","+e);
            s = ns;
        }

        return binaryS(arr,t);
    }
    static int binaryS(int[] array, int t) {
        int s = 0;
        int e = array.length - 1;



        while (s <= e) {
            int m = s + (e - s) / 2;
            System.out.println(m);

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
