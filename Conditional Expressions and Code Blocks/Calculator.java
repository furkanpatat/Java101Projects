import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");

        System.out.println("For The Collection => Enter : +\nFor the Extraction Enter : -");
        System.out.println("For The Multiplication => Enter : *\nFor The Splitting Enter : / ");

        int n1,n2;
        char point;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the calculation you want to do : ");
        point = scanner.next().charAt(0);

        System.out.print("Please enter the first number : ");
        n1 = scanner.nextInt();

        System.out.print("Please enter the second number : ");
        n2 = scanner.nextInt();

        switch (point){
            case '+' :
                System.out.println(n1 + " + " +  n2 + " = " + (n1 + n2 ));
                break;
            case '-' :
                System.out.println(n1 + " - " +  n2 +  "= " + (n1 - n2 ));
                break;
            case '*' :
                System.out.println(n1 + " * " +  n2 + " = " + (n1 * n2 ));
                break;
            case '/' :
                System.out.println(n1 + " / " +  n2 + " = " + (n1 / n2 ));
                break;
            default:
                System.out.println("You entered an incorrect calculation operation.");
                break;
        }

    }
}