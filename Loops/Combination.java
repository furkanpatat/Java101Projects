import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        //Write a program that calculates combinations in Java.

        System.out.println("Hello !");

        int n, r, factorial = 1, combination, factorial2= 1, factorial3 = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("C(N,R)");
        System.out.print("Enter N : ");
        n = scanner.nextInt();

        System.out.print("Enter R : ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        for (int i = 1; i <= r; i++) {
            factorial2 *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            factorial3 *= i;
        }

        combination = factorial / (factorial2 * factorial3);
        System.out.println("Combination : " +combination);



    }
}