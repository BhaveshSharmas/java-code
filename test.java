import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String name = "ba";
        String sub = name.substring(0,1);
        String edge = sub+"c"+name.substring(1,2);
//        String edge = sub+"c";
//        System.out.println(edge);
//        System.out.println();
        for (int i = 0; i <= 2; i++) {
            sub = name.substring(0,i);
            edge = sub+"c"+name.substring(i,2);
            System.out.println(edge);
        }
    }


}