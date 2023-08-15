import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {

        String str;
        Scanner scanner = new Scanner(System.in);
        int end;
        System.out.println("Enter The Word :  ");
        str = scanner.nextLine();
        end = str.length()-1;
        boolean isPalindrom = false;

        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == str.charAt(end)){
                isPalindrom = true;
            }
            end--;
        }
        if (isPalindrom){
            System.out.println(str + " => The Word is Palindrome.");
        }
        else {
            System.out.println(str+" => The Word Is Not Palindrome.");
        }
    }
}