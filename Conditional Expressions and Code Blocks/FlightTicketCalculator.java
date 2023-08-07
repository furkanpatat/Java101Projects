import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        double total;
        int age,km;
        char type;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance : ");
        km = scanner.nextInt();

        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        System.out.print("Select the type of trip.\n1 => One Way / 2 => Round Trip : ");
        type = scanner.next().charAt(0);

        total = km * 0.10;

        if (age > 0 && km > 0 && (type == '1' || type == '2') ){
            switch (type){
                case '1' :
                    System.out.println("One Way");
                    if (age<12){
                        total = total * 0.50;
                        System.out.println("Total Price : "+total);
                    }
                    else if (age >= 12 && age <= 24) {
                        total = total * 0.90;
                        System.out.println("Total Price : "+total);
                    }
                    else if (age > 65 ) {
                        total = total * 0.70;
                        System.out.println("Total Price : "+total);
                    }
                    else {
                        System.out.println("Total Price : "+total);
                    }
                    break;
                case  '2' :
                    System.out.println("Round Trip");
                    total *= 2;
                    if (age<12){
                        total = total * 0.50;
                        total *=0.80;
                        System.out.println("Total Price : "+total);
                    }
                    else if (age >= 12 && age <= 24) {
                        total = total * 0.90;
                        total *=0.80;
                        System.out.println("Total Price : "+total);
                    }
                    else if (age > 65 ) {
                        total = total * 0.70;
                        total *=0.80;
                        System.out.println("Total Price : "+total);
                    }
                    else {
                        total *=0.80;
                        System.out.println("Total Price : "+total);
                    }
                    break;
                default:
                    System.out.println("Incorrect value entry. Please try again. ");
            }
        }
        else{
            System.out.println("Incorrect value entry. Please try again.");
        }


    }
}