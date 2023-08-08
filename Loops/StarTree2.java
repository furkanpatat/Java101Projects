import java.util.Scanner;

public class StarTree2 {
    public static void main(String[] args) {

        int line;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Satır");
        line = scanner.nextInt();

        System.out.println("Hello world!");

        for (int i = line ; i >= 1 ; i--){
            for (int j = 1 ; j <= line - i ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= 2 * i - 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


