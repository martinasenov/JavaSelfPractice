package chatGPT_practice_Tasks;

import java.util.Scanner;

public class SimpleBankAccountManager {


    public static void main(String[] args) throws InterruptedException {

        double account_balance=1000;
        double depositOrWithdrawAmount;
        int option;

        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat would you like to do? Please type 1, 2 or 3 to proceed.\n\t1.Deposit\n\t2.Withdraw\n\t3.Check Balance");


        while(true){

            if(!input.hasNextInt()){
                System.out.println("The input must be a NUMBER !");
                input.next();
                continue;
            }

            option=input.nextInt();

            if(option<1 || option>3){

                System.out.println("Please enter a number between 1-3");
                continue;
            }
            break;
        }



       switch (option){

           case 1:

               System.out.println("Please enter the amount you would like to deposit");

               while(true){

                   if(!input.hasNextDouble()){
                       System.out.println("Please enter a Number");
                       input.next();
                       continue;
                   }

                   depositOrWithdrawAmount=input.nextDouble();

                   if (depositOrWithdrawAmount<0 || depositOrWithdrawAmount==0) {
                       System.out.println("Amount can not be negative or zero. Please enter a Positive number" );
                       continue;
                   }

                   break;
               }

               account_balance= deposit(account_balance,depositOrWithdrawAmount);

               System.out.print("Depositing $" + depositOrWithdrawAmount+"  ");
               for (int z=3; z >=0 ;z--) {
                   System.out.print(".");
                   Thread.sleep(1000);
               }
               System.out.println();

               System.out.println("your current balance is $"+account_balance);
               break;


           case 2:
               System.out.println("Please enter the amount you would like to withdraw");

               while(true){

                   if(!input.hasNextDouble()){
                       System.out.println("Please enter a Number");
                       input.next();
                       continue;
                   }

                   depositOrWithdrawAmount=input.nextDouble();

                   if (depositOrWithdrawAmount<0 || depositOrWithdrawAmount==0) {
                       System.out.println("Amount can not be negative or zero. Please enter a Positive number" );
                       continue;
                   }

                   if(depositOrWithdrawAmount>account_balance){

                       System.out.println("Insufficient balance! Please try smaller amount");
                       continue;

                   }

                   break;
               }


               account_balance=withdraw(account_balance,depositOrWithdrawAmount);

               System.out.print("Withdrawing $" + depositOrWithdrawAmount+"  ");

               for (int z=3; z >=0 ;z--) {
                   Thread.sleep(1000);
                   System.out.print(".");
               }
               System.out.println();
               System.out.println("your current balance is $"+account_balance);

               break;

           default:
               checkBalance(account_balance);
               break;


       }



        input.close();

    }



    public static double deposit(double account_balance, double deposit_amount ){

        return account_balance+deposit_amount;


    }

    public static double withdraw(double account_balance, double deposit_amount ) {

    return account_balance-deposit_amount;

    }

    public static void checkBalance(double balance){

        System.out.println("Your balance is $"+balance);

    }


}



/*Task: Simple Bank Account Manager
        Objective: Create a Java program that simulates basic operations of a bank account: deposit, withdraw, and check balance.

        Requirements:

        Bank Account Details:

        Use variables to store the account balance. Initialize it with a starting balance, say $1000.
        Deposit Operation:

        Create a method named deposit that takes a double value as the deposit amount and adds it to the account balance.
        Withdraw Operation:

        Create a method named withdraw that takes a double value as the withdrawal amount and subtracts it from the account balance. Ensure the balance doesn't go below zero.
        Check Balance:

        Create a method named checkBalance that simply returns the current balance.
        User Interaction:

        In the main method, allow the user to choose an operation: deposit, withdraw, or check balance.
        Based on the user's choice, call the appropriate method and display the result.
        Input Validation:

        Validate user inputs for the deposit and withdrawal operations to ensure they are positive numbers.*/
