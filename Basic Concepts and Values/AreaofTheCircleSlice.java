import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----A PROGRAM THAT FINDS THE AREA OF A CIRCLE SLICE------");

        int r,a;
        double pi=3.14,area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius : ");
        r = scanner.nextInt();

        System.out.print("Center Angle Measure : ");
        a = scanner.nextInt();

        area=(pi * (r*r) * a) / 360;
        System.out.println("Area : " +area);

    }
}