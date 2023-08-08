import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        //It finds whether or not a number entered from the keyboard is a perfect number,
        // and if the number is a perfect number, "it is a perfect number." if not, "it's not a perfect number."
        // Write the program that writes the expressions to the screen in Java language.

        System.out.println("Hello !");

        int n,sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = scanner.nextInt();

        for (int i = 1 ; i < n ; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }
    }
}