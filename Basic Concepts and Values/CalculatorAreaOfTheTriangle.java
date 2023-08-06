import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****THE PROGRAM TO CALCULATE THE AREA OF THE TRIANGLE*****");

        int a,b,c,length;
        double area,lengthUse;

        Scanner scanner = new Scanner(System.in);

        System.out.print("First side of triangle : ");
        a = scanner.nextInt();

        System.out.print("Second side of triangle : ");
        b = scanner.nextInt();

        System.out.print("Third side of triangle : ");
        c = scanner.nextInt();

        length = a+b+c;
        lengthUse=length/2;
        area = Math.sqrt(lengthUse*(lengthUse-a)*(lengthUse-b)*(lengthUse-c));

        System.out.println("The Area of The Triangle : " +area);
    }
}