import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****WELCOME TO THE PROGRAM THAT CALCULATES VAT AMOUNT*****");
        double amount,amountWVat,vatRatio=0.18;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the fee :");
        amount = scanner.nextDouble();
        if (!(amount >= 0) || !(amount <= 1000)) {
            vatRatio = 0.08;
        }
        amountWVat = amount + amount*vatRatio;
        System.out.println("Price without VAT :"+amount);
        System.out.println("Price with VAT: "+amountWVat);
        System.out.println("VAT Free Rate: "+vatRatio);
        System.out.println("VAT Amount : "+(amountWVat-amount));

    }
}