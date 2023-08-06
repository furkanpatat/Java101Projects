import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Grocery Cashier Program-----");

        int pear,apple,tomatoes,banana,eggplant;
        double totalPrice;
        //Fruits and KG Prices
        // Pear: 2.14 TL
        // Apple : 3.67 TL
        // Tomatoes: 1.11 TL
        // Banana: 0.95 TL
        // Eggplant : 5.00 TL

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pears ? (KG) :");
        pear = scanner.nextInt();

        System.out.print("Apple ? (KG) :");
        apple = scanner.nextInt();

        System.out.print("Tomatoes ? (KG) :");
        tomatoes = scanner.nextInt();

        System.out.print("Banana ? (KG) :");
        banana = scanner.nextInt();

        System.out.print("Eggplant ? (KG) :");
        eggplant = scanner.nextInt();

        totalPrice = (pear * 2.14) + (apple * 3.67) + (tomatoes * 1.11) + (banana * 0.95) + (eggplant * 5);
        System.out.println("Total Amount : " +totalPrice + "TL");


    }
}