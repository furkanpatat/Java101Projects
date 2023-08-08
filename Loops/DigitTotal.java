import java.util.Scanner;

public class DigitTotal {
    public static void main(String[] args) {

        //Write a program that calculates the sum of the digits of a number.

        System.out.println("Hello !");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        System.out.println("The sum of the digits of the number: " + sum);
    }
}
