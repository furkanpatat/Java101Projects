import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrangement {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("How many elements will the array have? : ");
        n = scanner.nextInt();

        int array[] = new int[n];

        System.out.println("Size of the array : " + n);

        for (int i = 0 ; i < array.length ; i++){
            System.out.print((i+1) + ". Element : ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Arrangement : " + Arrays.toString(array));
    }
}