import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        System.out.println("Chinese Zodiac Calculator");

        Scanner scanner = new Scanner(System.in);
        int birthYear,value;

        System.out.print("Please enter your birth year : ");
        birthYear = scanner.nextInt();

        value = birthYear % 12;

        switch (value){
            case 0 :
                System.out.println("Your Chinese Zodiac : Monkey");
                break;
            case 1 :
                System.out.println("Your Chinese Zodiac : Cockerel");
                break;
            case 2 :
                System.out.println("Your Chinese Zodiac : Dog");
                break;
            case 3 :
                System.out.println("Your Chinese Zodiac : Pig");
                break;
            case 4 :
                System.out.println("Your Chinese Zodiac : Rat");
                break;
            case 5 :
                System.out.println("Your Chinese Zodiac : Ox");
                break;
            case 6 :
                System.out.println("Your Chinese Zodiac : Tiger");
                break;
            case 7 :
                System.out.println("Your Chinese Zodiac : Rabbit");
                break;
            case 8 :
                System.out.println("Your Chinese Zodiac : Dragon");
                break;
            case 9 :
                System.out.println("Your Chinese Zodiac : Snake");
                break;
            case 10 :
                System.out.println("Your Chinese Zodiac : Horse");
                break;
            case 11 :
                System.out.println("Your Chinese Zodiac : Sheep");
                break;
        }
    }
}