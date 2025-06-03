package V10switchStatementsNestedCases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
        String brandName = sc.nextLine();
        String bodyType = sc.nextLine();

        //below simple switch statements

//        switch (a) {
//            case "Mango":
//                System.out.println("yellow King");
//                break;
//
//            case "apple":
//                System.out.println("Red froot");
//                break;
//
//            case "banana":
//                System.out.println("peal it!");
//                break;
//
//            default:
//                System.out.println("Enter valid names");
//        }

        //below Enhanced switch statements
//        switch (a){
//            case "Mango" -> System.out.println("mango");
//            case "apple" -> System.out.println("apple");
//            case "banana" -> System.out.println("banana");
//        }

        //below nested switch statements

        switch (brandName){

            case "tata":
                switch (bodyType){
                    case "car":
                        System.out.println("Indica");
                        break;
                    case "suv":
                        System.out.println("Siera");
                        break;
                }
                break;

            case "Maruti":
                switch (bodyType){
                    case "car":
                        System.out.println("SS80;");
                        break;
                    case "suv":
                        System.out.println("Gypsy");
                        break;
                }
                break;

            case "ford":
                switch (bodyType){
                    case "car":
                        System.out.println("Mustang");
                        break;
                    case "suv":
                        System.out.println("Endeavor");
                        break;
                }
                break;

            default:
                System.out.println("Enter valid names");

        }
    }
}
