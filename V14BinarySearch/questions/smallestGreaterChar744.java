package V14BinarySearch.questions;

public class smallestGreaterChar744 {
    public static void main(String[] args) {
        char[] characterArray = {'a', 'b', 'c', 'd', 'e'};
        char st = greaterCharacter(characterArray, 'd');
        System.out.println(st);
    }

    static char greaterCharacter(char[] array, char target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return array[start % array.length];
    }
}
