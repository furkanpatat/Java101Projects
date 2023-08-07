import javax.swing.*;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        System.out.println("Welcome to Your Social Media Account");

        String userName,password,reset,newPassword;
        Scanner scanner = new Scanner(System.in);

        System.out.print("User Name : ");
        userName = scanner.nextLine();

        System.out.print("Passowrd : ");
        password = scanner.nextLine();

        if (userName.equals("furkanpatat") && password.equals("java")){
            System.out.println("Logging into your account...");
            System.out.println("You are logged into your account, Welcome.");
        }
        else{
            System.out.println("Your username or password is incorrect.");
            System.out.print("Do you want to reset your password? (yes/no) : ");

            reset = scanner.nextLine();
            if (reset.equals("yes")){

                System.out.print("Please enter your new password : ");
                newPassword = scanner.nextLine();

                if (newPassword.equals(password)){
                    System.out.println("Your password cannot be the same as your old password.");
                }
                else{
                    password = newPassword;
                    System.out.println("Your password has been updated.");
                }

            }
            else {
                System.out.println("Please try logging in again.");
            }

        }

    }
}
