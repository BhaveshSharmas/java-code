package recursion.subsetSequesceString;

import com.sun.source.doctree.EscapeTree;

import java.util.ArrayList;
import java.util.Arrays;

public class character {
    public static void main(String[] args) {
        String name = "bhaapplevesh";

//        System.out.println(name.substring(3));
        System.out.println(skipChar(name));

    }

    static void skipCharacter(String string, ArrayList<String> al, int i) {
        if (i == string.length()) {
            return;
        }

        if (string.charAt(i) == 'z') {
        } else {
            al.add(String.valueOf(string.charAt(i)));
        }

        skipCharacter(string, al, i + 1);
    }

    static String skipChar(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return skipChar(up.substring(5));
        }else {
            return up.charAt(0) + skipChar(up.substring(1));
        }
    }
}
