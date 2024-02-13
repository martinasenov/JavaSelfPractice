package chatGPT_practice_Tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2;


        System.out.println("Please enter first number");
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong input, please enter a NUMBER");
            scanner.next(); // Consume the invalid token
            System.out.println("Please enter first number");
        }
        num1 = scanner.nextDouble();


        char operator;
        do {

            System.out.println("Please choose an operator  +,-,*,/");
            operator = scanner.next().charAt(0);

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Invalid operator");
            }

        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/');


        System.out.println("Please enter second number");
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong input, please enter a NUMBER");
            scanner.next(); // Consume the invalid token
            System.out.println("Please enter first number");
        }
        num2 = scanner.nextDouble();



      switch (operator) {

          case '+':
              System.out.println("Addition = "+(num1+num2));
              break;
          case '-':
              System.out.println("Subtraction = "+(num1-num2));
              break;

          case '*':
              System.out.println("Multiplication  = "+(num1*num2));
              break;


          case '/':
              if (num2 == 0) {
                  System.out.println("Cannot divide by zero.");
              } else {
                  System.out.println("Division = " + (num1 / num2));
              }
              break;

      }


    }
}
/*
Task: Build a Simple Text-based Calculator
        Objective: Create a Java program that acts as a simple text-based calculator. It should take two numbers and an operator as input, then perform the corresponding calculation.

        Requirements:

        Input Handling:

        Prompt the user to enter two numbers. These should be stored in appropriate variables.
        Ask the user to choose an operation (addition, subtraction, multiplication, division).
        Handle any input errors gracefully using if-statements (e.g., entering non-numeric values, division by zero).
        Calculations:

        Perform the calculation based on the operator input. Use a switch statement to select the operation.
        Support at least four operations: addition, subtraction, multiplication, and division.
        Output:

        Display the result of the calculation with a meaningful message.
        Use String concatenation to create the output message.
        Extras:

        Include the use of ternary operators somewhere in your program, possibly in handling a specific condition or output formatting.
        Implement a loop that allows the user to perform multiple calculations without restarting the program.
        Add an 'exit' option in the loop for the user to quit the program.*/
