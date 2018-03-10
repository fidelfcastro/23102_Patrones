import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Practica 02\n");
        System.out.println("Enter your email:");
        String email = scan.next();

        Email emailField = new Email(new EmailBehavior(), email);
        printResult(emailField.validate());

        System.out.println("Enter your phone number:");
        String phone = scan.next();

        Telephone telephoneField = new Telephone(new TelephoneBehavior(), phone);
        printResult(telephoneField.validate());

        System.out.println("Enter a numeric value:");
        String number = scan.next();

        Number numberField = new Number(new NumberBehavior(), number);
        printResult(numberField.validate());
    }

    public static void printResult(boolean result){
        if(result){
            System.out.println("Valid\n");
        }
        else{
            System.out.println("Invalid\n");
        }
    }
}
