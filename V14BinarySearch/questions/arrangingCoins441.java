package V14BinarySearch.questions;

import jdk.swing.interop.DropTargetContextWrapper;

public class arrangingCoins441 {
    public static void main(String[] args) {
//        arrangecoind(5);
        System.out.println(ac(7));
    }

    public static void arrangecoind(int x){
        int rowsComplete = 0;
        int atRow = 1;
        int coins = x;

        while(coins >= atRow){
            coins = coins - atRow;
            rowsComplete++;
            atRow++;
        }
        System.out.println(rowsComplete);
    }

    public static int ac(int n){
        int coins = n;
        int l = 1;
        int r = n;
        int res = 0;

        while(l<=r){
            int rows = l+(r-l)/2;
            int coinsneed = (rows/2) * (rows+1);
            if (coinsneed>coins){
                r = rows-1;
            }else if (coinsneed<coins){
                l = rows+1;
                res = rows+1;
            }
            else {
                return rows;
            }
        }
        return res;
    }

}
