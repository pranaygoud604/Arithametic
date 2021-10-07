package passwor_match;

import java.util.Scanner;

public class password_match {
    public static void main(String[] args) {

        String dusername = "pranay", dpassword = "motapothula", eusername, epassword;
        System.out.println("Enter a username : ");
        Scanner username = new Scanner(System.in);
        eusername = username.next();
        System.out.println("Enter a password : ");
        Scanner password = new Scanner(System.in);
        epassword = password.next();
        if (dusername.equals(eusername)) {
            if (dpassword.equals(epassword)) {
                System.out.print("Yey your account found");
            } else {
                System.out.print("password does not match");
            }
        }else {
            System.out.print("account not found");
        }

    }
}

