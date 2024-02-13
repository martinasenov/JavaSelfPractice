package PracticeTasks;

import java.util.Scanner;

public class PizzaOrderApp {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to Cydeo Pizza House\nWould you like to order a pizza?");
        String yesOrNo=input.nextLine();

        while (true){

            if(!yesOrNo.equals("yes") && !yesOrNo.equals("no")){
                System.out.println("invalid input.Please enter yes or no");
                yesOrNo=input.nextLine();
                continue;
            }

            if (yesOrNo.equals("no")){
                System.out.println("Thanks for using our service!");
                return;
            }

            break;
        }


        System.out.println("Please select the size of your pizza");
        String size=input.nextLine();

        while (true){
            if(!size.equals("small")
                    && !size.equals("medium")
                    && !size.equals("large")
                    && !size.equals("extra-large")){
                System.out.println("invalid entry. Please enter: small\n\tmedium\n\tlarge\n\textra-large");
                size=input.nextLine();
                continue;
            }

            break;
        }



        System.out.println("Please select number of cheese toppings");


        int numberOfCheeseTopping= validNumberChecker();

        System.out.println("Please select number of pepperoni toppings");

        int numberOfPepperoniTopping = validNumberChecker();


        input.close();


        Pizza pizza1=new Pizza();

        pizza1.setInfo(size,numberOfCheeseTopping,numberOfPepperoniTopping);


        System.out.println(pizza1);



    }




    public static int validNumberChecker() {
        Scanner input = new Scanner(System.in);
        int num;

        while (true) {
            String line = input.nextLine();

            try {
                num = Integer.parseInt(line);

                if (num < 0) {
                    System.out.println("Invalid input. Number cannot be negative.");
                    continue;
                }

                return num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a NUMBER!");
            }
        }
    }



}

/*
Create a custom Java class named Pizza with the following specifications:

Attributes:
size: Indicates the size of the pizza (small, medium, large, or extra-large).

numberOfCheeseTopping: Indicates the number of cheese toppings.

numberOfPepperoniTopping: Indicates the number of pepperoni toppings.

Actions:
setInfo: Sets all the fields of the pizza object.
calcCost(): Returns the total cost of the pizza.
toString(): Returns a string containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().


The pizza cost is determined by:
Small: Starts at $10.
        Medium: Starts at $12.
        Large: Starts at $14.

Per pepperoni topping: $1.5
Per cheese topping: $0.8


Create a class named `PizzaOrderApp` and write a program for pizza ordering applications with the following requirements:

        1. Display the following welcome message and ask the user if they want to order a pizza:

Welcome to Cydeo Pizza House

Would you like to order a pizza?

If they say "yes," proceed to the next step.

If they say "no," display "Thanks for using our service!".

For any other response, the application should ask the user to re-enter until the user provides a valid entry.

        2. Ask the user to select the size of the pizza. If the user enters an invalid entry, then the application should ask the user to re-enter until the user provides a valid entry.

        3. Ask the user to enter the number of cheese toppings and pepperoni toppings. If any entry is invalid, then the application should ask the user to re-enter until the user provides a valid entry.
        4. The application should create the pizza object for the pizza that the user ordered and display the total price at the end.
*/