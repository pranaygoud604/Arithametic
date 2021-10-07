package StringHandling;

import java.util.Locale;
import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args){

        String data;
        int option;
        System.out.println("Enter a data: ");
        Scanner input = new Scanner(System.in);
        data = input.next();
        System.out.println("Enter 1.length , 2.uppercase, 3.lowercase");
        Scanner input2 = new Scanner(System.in);
        option = input2.nextInt();
        switch(option){
            case 1: System.out.println("Length of "+data+" is : "+data.length());
                        break;
            case 2: System.out.println("Coverting "+data+" to uppercase : "+data.toUpperCase());
                break;
            case 3: System.out.println("Coverting "+data+" to lowercase : "+data.toLowerCase());
                      break;


            default:
                System.out.println("Enter data not found");
        }
    }
}
