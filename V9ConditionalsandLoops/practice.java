package V9ConditionalsandLoops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

//        AreaOfRect(10,20);
//        areaOfCircle(10);
//        areaOfTriangle(1.0F,20.5f);
//        factorsOfNumber();
//        sumTillZero();
//        compoundInt();
        lP();
    }

    static void AreaOfRect(float l, float b) {
        float AOR = l * b;
        System.out.println("Area of Rectangle = " + AOR);
    }

    static void areaOfCircle(float radius) {
        float r = radius;
        float pie = 3.14f;
        double areaOfCircle = pie * (r * r);
        System.out.println(areaOfCircle);
    }

    static void areaOfTriangle(float base, float height) {
        float area = (base * height) / 2; //working
        System.out.println(area);
    }

    static void factorsOfNumber() {
        int number = 12;
        ArrayList num = new ArrayList();

        for (int j = 1; j <= number/2; j++) {

            if (number % j == 0) {
                num.add(j);
            }
        }
        System.out.println(num);
    }
    static void sumTillZero(){//enterTill zero and print greatest.
        Scanner in = new Scanner(System.in);
        int num = 0;
        int a = in.nextInt();
        while (a!=0){
            if (a>num) {
                num = a;
            }
            a = in.nextInt();
        }
        System.out.println(num);
    }

    static void compoundInt(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter years");
        int years = in.nextInt();
        System.out.println("Enter amount");
        int amount = in.nextInt();
        System.out.println("Enter intrest");
        int intrest = in.nextInt();
        int afterIntrest = 0;
        for (int i = 1; i <= years; i++) {
            if (i==1){
                afterIntrest = afterIntrest + (amount*intrest/100) + amount;
            }
            else {
                afterIntrest = afterIntrest + (afterIntrest*intrest/100);
            }
        }
        System.out.println(afterIntrest);
    }

    static void lP(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = in.nextInt();

        if (year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
