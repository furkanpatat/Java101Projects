import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("***** Welcome to FurkanBank *****");
        // userName =>furkan
        //password =>patat

        String userName, password;
        int right = 3;
        char type;
        double balance = 0;
        double amount;
        Scanner scanner = new Scanner(System.in);

        while (right != 0) {
            System.out.print("User Name : ");
            userName = scanner.nextLine();

            System.out.println("\n");

            System.out.print("Password : ");
            password = scanner.nextLine();

            if (userName.equals("furkan") && password.equals("patat")) {

                System.out.println("You have logged into the system, Welcome Back.");


                do {
                    System.out.println("1)Withdraw Money \n2)Depositing Money \n3)Balance Inquiry\n4)Exit");

                    System.out.print("Please Select The Action You Want To Take : ");
                    type = scanner.next().charAt(0);

                    switch (type) {

                        case '1':
                            System.out.println("Enter the Amount You Want to Withdraw: ");
                            amount = scanner.nextDouble();

                            if (amount > balance) {
                                System.out.println("Insufficient Balance");
                            } else {
                                balance -= amount;
                                System.out.println("Withdrawal Successful, Your New Balance: " + balance);
                            }
                            break;

                        case '2':
                            System.out.print("Enter the Amount You Want to Deposit: ");
                            amount = scanner.nextDouble();

                            balance += amount;
                            System.out.println("Your New Balance: " + balance);
                            break;

                        case '3':
                            System.out.println("Your balance: " + balance);
                            break;

                        case '4':
                            break;

                    }
                } while (type != '4');
                System.out.println("See you again...");
                break;
            }
                else{
                    if (right == 0) {
                        System.out.println("Your account has been blocked. Connect to Customer Service.");
                        break;
                    } else {
                        System.out.println("Username or password is wrong. Please try again. Your Remaining Rights: " + --right);
                    }
                }

        }
    }
}
