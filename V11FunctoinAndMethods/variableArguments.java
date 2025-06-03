package V11FunctoinAndMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class variableArguments { //this is VARARGS that can take multiple arguments is method/function
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,6,7);
        samename(1);
        samename("ONE");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void samename(int a){
        System.out.println(a);
    }

    static void samename(String a){
        System.out.println(a);
    }
}
