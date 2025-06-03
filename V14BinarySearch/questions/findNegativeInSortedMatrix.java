package V14BinarySearch.questions;

public class findNegativeInSortedMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {4,3,-2,-1},
                {3,2,-1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };

//        System.out.println(array.length);
        System.out.println(findNegative(array));
    }

    static int findNegative (int[][] array){
//        int n = array.length-1;
        int row = array.length-1;
        int col = 0;
        int count = 0;
        int m = array[0].length;

        while(row >= 0 && col < array[0].length){
            if (array[row][col] < 0){
                row --;
                count += m - col;
            }else {
                col ++;
            }
        }

        return count;
    }

}
