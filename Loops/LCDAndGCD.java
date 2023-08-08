import java.util.Scanner;

public class LCMAndGCD {
    public static void main(String[] args) {

        //We are writing a program that finds the GCD
        // and LCM values of two numbers in Java.

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int n1, n2,i = 0,ebob = 1,ekok;


        System.out.print("Enter the first Number : ");
        n1 = scanner.nextInt();

        System.out.print("Enter the second Number  :");
        n2 = scanner.nextInt();

        while (i < n2){
            i++;
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Greatest Common Divisor : " + ebob);
        System.out.println("Lowest Common Multiple : "+ekok);
    }
}
