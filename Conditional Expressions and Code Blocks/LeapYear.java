import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Leap Year");

        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the year : ");
        year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year+ " is a Leap Year.");
        }
        else {
            System.out.println(year + " is not a Leap Year.");
        }

    }
}