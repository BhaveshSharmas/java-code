package recursion;

public class recursionBinarySearch {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};

        System.out.println(revursiveBinary(array,3,0,array.length-1));

    }
    static int revursiveBinary(int[] array, int target, int start,int end){
        if (start > end){
            return -1;
        }
        int m = start + (end - start) / 2;
        if (target == array[m]){
            return m;
        }
        if (array[m] < target){
            return revursiveBinary(array,target,m+1,end);
        }
            return revursiveBinary(array,target,start,m-1);

    }
}
