import java.util.Scanner;

public class FirstJava {
    public static void main(String[] args) {

//        whileloop();
//        forlop();
//        tempFtoCencious();

        INRtoUSD();
    }

    static void whileloop(){
                int a = 1;
        while (a != 5){
            System.out.println(a);
            a++;
        }
        System.out.println(a);//testing purpose
    }

    static void forlop(){
        for (int i = 1; i!=5; i++){
            System.out.println(i);
        }
    }

    static void tempFtoCencious(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temp in celcious");
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }

    static void INRtoUSD(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter inr");
        float INR = in.nextFloat();

        float USD = (INR/81.85f);//formula
        System.out.println(USD);
    }

}
