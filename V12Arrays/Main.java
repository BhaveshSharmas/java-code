package V12Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp[] = new int[5];
        D2Array();
        System.out.println("");
        Alist();
//        int arr[] = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//        for(int num : arr){
//            System.out.print(num);
//        }

        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(inp));

    }

    public static void D2Array(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("");
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }

    }

    public static void Alist(){
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(10);
        arrayList.add(23);
        arrayList.add(43);
        arrayList.add(12);
        arrayList.add(54);
        arrayList.add(58);

        System.out.println(arrayList);
     }

}
