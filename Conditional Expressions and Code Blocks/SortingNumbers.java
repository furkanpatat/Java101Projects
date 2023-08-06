import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sorting Numbers");

        int n1,n2,n3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1 : ");
        n1 = scanner.nextInt();

        System.out.print("Number 2 : ");
        n2 = scanner.nextInt();

        System.out.print("Number 3 : ");
        n3 = scanner.nextInt();

        if (n1>n2 && n1>n3){
            if (n2>n3){
                System.out.println(n1 + " > " + n2 + " > " + n3);
            }
            else {
                System.out.println(n1 + " > " + n3 + " > " + n2);
            }
        }
        else if (n2>n1 && n2>n3){
            if (n1>n3){
                System.out.println(n2 + " > " + n1 + " > " + n3);
            }
            else {
                System.out.println(n2 + " > " + n3 + " > " + n1);
            }
        }
        else if (n3>n1 && n3>n2){
            if (n1>n2){
                System.out.println(n3 + " > " + n1 + " > " + n2);
            }
            else {
                System.out.println(n3 + " > " + n2 + " > " + n1);
            }
        }
    }
}