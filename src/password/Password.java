package password;

import java.util.Scanner;

public class Password {
    public static void main(String[] args){

        String password = "";
        System.out.println("Enter a password : ");
        Scanner input= new Scanner(System.in);
        password = input.next();
        if(password.length()>8){
            System.out.println("Password matched");
        }else{
            System.out.println("You must enter minimum 8 charaters");
        }

    }
}
