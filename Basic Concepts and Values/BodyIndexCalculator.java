import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Body Mass Index Calculator------");

        float height,weight,index;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height Exapmle : (1,83) : " );
        height = scanner.nextFloat();

        System.out.print("Please enter your weight : ");
        weight = scanner.nextFloat();

        index = weight / (height*height) ;
        System.out.println("Your Body Mass Index : " +index);

    }
}