import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Hypotenuse Calculator Program*****");

        int a,b;
        double c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of the first side : ");
        a = scanner.nextInt();

        System.out.print("Enter the value of the second side : ");
        b = scanner.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse value: " +c);
    }
}