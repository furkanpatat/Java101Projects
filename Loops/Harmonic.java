import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        System.out.println("Hello !");

        double n,sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = scanner.nextInt();

        for (double i = 1 ; i <= n ; i++ ){
            sum = sum + 1/i;
        }
        System.out.println("Harmonic : " + sum);
    }
}