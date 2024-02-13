package PracticeTasks;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctUsername = "Cydeo";
        final String correctPassword = "WoodenSpoon";

        int attempt = 0;

        while (attempt < 4) {
            System.out.print("Please enter your username: ");
            String givenUsername = scanner.nextLine();
            System.out.print("Please enter your password: ");
            String givenPassword = scanner.nextLine();
            System.out.println();

            if (givenUsername.equals(correctUsername) && givenPassword.equals(correctPassword)) {
                System.out.println("Logged in");
                scanner.close();
                return;
            } else {
                attempt++;
                if (attempt < 4) {
                    System.out.println("Invalid password, please try again. Remaining attempt: " + (4 - attempt));
                }
            }
        }

        System.err.println("Your account is locked. Please contact customer support");
        scanner.close();
    }
}




/*    Warmup tasks:
        1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
        username: Cydeo
        password: WoodenSpoon

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."

        If the credentials are not matched, the program should allow
        the user to have three attempts to enter correct credentials

        if all three attempts are failed, then print "Your account is locked."*/





