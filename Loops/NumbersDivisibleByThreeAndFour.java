import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //The average of the numbers
        // up to the number you entered, divisible by 3' and '4'.

        System.out.println("Hello !");

        int number,sum = 0,avg,numbers = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        number = scanner.nextInt();

        System.out.print("Numbers : ");

        for (int i = 0; i <= number ; i++){

            if (i % 3 == 0 || i % 4 == 0){
                System.out.print( i + " ");
                sum = sum +i;
                numbers++;
            }

        }

        avg = sum / numbers;

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average : " + avg);
    }
}