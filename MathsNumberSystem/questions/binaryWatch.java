package MathsNumberSystem.questions;

import java.util.ArrayList;
import java.util.List;

public class binaryWatch {
    public static void main(String[] args) {
//        System.out.println(countBit(5));
        System.out.println(binaryWatch(1));
    }
    static List<String> binaryWatch(int turnedOn){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 59; j++) {
                if (countBit(i)+countBit(j) ==turnedOn){
                    String time = i+":"+""+(j<10?"0"+j:j);
                    list.add(time);
                }
            }
        }
        return list;
    }

    static int countBit(int n){
        int ans = 0;
        while (n>0){
            if ((n&1) == 1){
                ans++;
            }
            n = n>>1;
        }
        return ans;
    }
}
