package Arithmetic;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {

        int num1=20 , num2 = 30;

        System.out.println("Enter your operaton +,-,*,/,%");
        Scanner input =new Scanner(System.in);
        String operation = input.next();

        switch (operation){
            case "+" : System.out.println("ADD is : "+ (num1 + num2));
                      break;
            case "-" : System.out.println("sub is : "+ (num1 - num2));
                break;
            case "*" : System.out.println("mul is : "+ (num1 + num2));
                break;
            case "/" : System.out.println("div is : "+ (num1 + num2));
                break;
            case "%" : System.out.println("mod is : "+ (num1 + num2));
                break;
        }


//        if (operation.equals("+")){
//            System.out.println("ADD is : "+ (num1 + num2));
//        }
//        if (operation.equals("-")){
//            System.out.println("sub is : "+ (num1 - num2));
//        }
//        if (operation.equals("*")){
//            System.out.println("mul is : "+ (num1 * num2));
//        }
//        if (operation.equals("/")){
//            System.out.println("div is : "+ (num1 / num2));
//        }
//        if (operation.equals("%")){
//            System.out.println("Mod is : "+ (num1 % num2));
//        }

    }


}


