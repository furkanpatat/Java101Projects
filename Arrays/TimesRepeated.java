import java.util.Arrays;
import java.util.Scanner;

public class TimesRepeated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The size of the array : ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int k = 0 ; k < array.length ; k++){
            System.out.print((k+1) + ". Element : ");
            array[k] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int count = 1;

        for (int i = 0 ; i < array.length ; i++){
            if (i == 0){
                for (int j = 0 ; j < array.length ; j++){
                    if (i != j && array[i] == array[j]){
                        count++;
                    }
                }
                System.out.println(array[i] + "number " + count + "times repeated.");
            } else if (array[i] != array[i-1]) {
                for (int j = 0; j<array.length; j++){
                    if (i!=j && array[i] == array[j]){
                        count++;
                    }

                }
                System.out.println(array[i] + " number " + count + " times repeated.");
            }
            count = 1;


        }

    }
}