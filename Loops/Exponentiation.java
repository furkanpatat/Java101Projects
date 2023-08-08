import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {

        //Use the "For Loop" program that calculates exponential numbers
        // with the values entered by the user in Java.

        System.out.println("Hello !");

        Scanner scanner = new Scanner(System.in);
        int n, l, total = 1;

        System.out.print("Down number : ");
        n = scanner.nextInt();

        System.out.print("Up number : ");
        l = scanner.nextInt();

        for (int i = 1; i <= l; i++) {
            total *= n;
        }
        System.out.println(total);
    }
}