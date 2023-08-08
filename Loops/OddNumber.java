import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        //With Java loops, we write a program that accepts input from the user until
        // an odd number is entered and adds even and multiples of 4
        // from the entered values and prints it on the screen.

        System.out.println("Hello !");

        int number,sum = 0;
        Scanner scanner = new Scanner(System.in);

       do {
           System.out.print("Please enter the number : ");
           number = scanner.nextInt();
            if (number % 4 == 0 ){
                sum = sum + number;
            }

       }while ((number % 2) == 0);

        System.out.println("Sum of Numbers : "+sum);

    }
}