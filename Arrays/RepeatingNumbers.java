import java.util.Arrays;

public class RepeatingNumbers {
    public static void main(String[] args) {

        int[] array = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 1,1,1,7,8,4,23,5,46745,1234,123,1234,13,13};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.print("Repeating Numbers :");
        for (int i = 1 ; i < array.length ; i++){
            if (array[i] == array[i-1] ){
                if (array[i] != array[i+1] )
                System.out.print(" " + array[i] );
            }
        }
    }
}