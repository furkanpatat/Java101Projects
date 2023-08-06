import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program to Calculate Passing Grade");

        int math,turkish,chemistry,music,physics;
        double avg;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Math : ");
        math = scanner.nextInt();

        System.out.print("Turkish : ");
        turkish = scanner.nextInt();

        System.out.print("Chemistry : ");
        chemistry = scanner.nextInt();

        System.out.print("Physics : ");
        physics = scanner.nextInt();

        System.out.print("Music : ");
        music = scanner.nextInt();

        avg = (math+turkish+chemistry+physics+music)/5;
        if (avg>55){
            System.out.println("Congrats! You Passed!");
            System.out.println("Your Avarage : "+avg);
        }
        else{
            System.out.println("You Couldn't Pass");
            System.out.println("Your Average : "+avg);
        }
    }
}