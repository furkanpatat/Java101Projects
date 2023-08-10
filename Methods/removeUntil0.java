import java.util.Scanner;

public class removeUntil0 {
    static void hesaplaYazdir(int n){
        System.out.println("Girilen Sayi : "+n);
        System.out.print("Çıktısı : ");
        int gecici = n;
        System.out.print(n + " ");
        while (gecici>0){
            gecici = gecici - 5;
            System.out.print(gecici + " ");

        }
        while (gecici<n){
            gecici = gecici + 5;
            System.out.print(gecici + " ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Başlangıç sayısını giriniz : ");
        n = scanner.nextInt();

        hesaplaYazdir(n);
    }
}