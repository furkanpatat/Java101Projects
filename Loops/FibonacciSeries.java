import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Fibonacci series: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series :");
        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++) {
            int sum = a + b;
            System.out.print(sum + " ");

            a = b;
            b = sum;
        }

        scanner.close();
    }
}
