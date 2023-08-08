import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        //Program to find the exponent of 4 and 5.

        System.out.println("Hello !");

        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        input = scanner.nextInt();

        System.out.print("Exponents of 4 :");

        for (int i = 1 ; i <= input ; i *= 4){
            System.out.print(i + " ");
        }

        System.out.print("\nExponents of 5 :");

        for (int j = 1 ; j <= input ; j *=5){
            System.out.print(j + " ");
        }
    }
}