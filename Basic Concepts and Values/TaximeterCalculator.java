import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----TAXIMETER CALCULATION PROGRAM-----");

        int km;
        double perKm = 2.20,total,startPrice=10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many KM will you travel? : ");
        km = scanner.nextInt();

        total = startPrice + (km*perKm);
        total = (total<20) ? 20 : total;

        System.out.println("The amount you will pay: " +total + "$");
    }
}