package patterns;

public class pattern {
    public static void main(String[] args) {

//        pattern1(5);
//        pattern2(5);
        pattern3(5);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalCols = row > n ? 2 * n - row : row;

            for (int col = 0; col < totalCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int space = n - totalCols;
            for (int col = 0; col < space; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n){
        for (int row = 1; row < n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col2 = 2; col2 <= row; col2++) {
                System.out.print(col2+" ");
            }
            System.out.println("");
        }
    }
}
