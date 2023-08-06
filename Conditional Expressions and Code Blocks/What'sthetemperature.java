import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Suggesting activities based on the weather.");

        int weather;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the temperature? (Celsius) : ");
        weather = scanner.nextInt();

        if (weather < 5){
            System.out.println("You can ski.");
        }
        else if (weather >= 5 && weather < 15) {
            System.out.println("You can go to the cinema.");
        }
        else if(weather >= 15 && weather < 25){
            System.out.println("You can have a picnic.");
        }
        else{
            System.out.println("You can go to the sea or the pool and swim.");
        }
    }
}