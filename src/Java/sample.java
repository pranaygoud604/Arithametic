package Java;
import java.util.Scanner;
public class sample {
    public static void main(String[] args){
        System.out.print("enter java marks :");
        Scanner java = new Scanner(System.in);
        int javam = java.nextInt();

        System.out.print("enter python marks :");
        Scanner python = new Scanner(System.in);
        int pythonm = python.nextInt();
        System.out.println("Your java marks is :"+ javam);
        System.out.println("Your python marks is :"+ pythonm);
        if (javam>pythonm){
            System.out.println("Your scored high marks in java \n");
        }else {
            System.out.println("Your scored high marks in python ");
        }













//        System.out.print("Enter a number :");
//       Scanner input = new Scanner(System.in);
//       String output = input.next();
//        System.out.print("number is : " + output);
//


    }
}
