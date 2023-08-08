import java.util.Scanner;

public class StarTree {
    public static void main(String[] args) {
        System.out.println("Hello !");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int numberOfLines = scanner.nextInt();

        for (int i = 1; i <= numberOfLines; i++) {

            for (int j = 1; j <= numberOfLines - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}