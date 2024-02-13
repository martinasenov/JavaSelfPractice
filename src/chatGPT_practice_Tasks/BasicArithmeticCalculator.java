package chatGPT_practice_Tasks;

import java.util.Scanner;

public class BasicArithmeticCalculator {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        double firstNum, secondNum;
        String proceed;

        do{

        System.out.println("Please enter first number");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input please enter a number");
            scanner.next();
        }

        firstNum=scanner.nextDouble();


        String operator;
        do {

            System.out.println("Please choose an operator  +,-,*,/");
            operator = scanner.next();

            if ((!operator.equals("+")) && (!operator.equals("-")) && (!operator.equals("*")) && (!operator.equals("/"))) {
                System.out.println("Invalid operator");
            }

        } while ((!operator.equals("+")) && (!operator.equals("-")) && (!operator.equals("*")) && (!operator.equals("/")));



        System.out.println("Please enter second number");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input please enter a number");
            scanner.next();
        }

        secondNum= scanner.nextDouble();

        String result=firstNum+" "+operator+" "+secondNum+ " = ";

        switch(operator){

            case "+":
                System.out.println(result+add(firstNum,secondNum));
                break;

            case "-":
                System.out.println(result+subtract(firstNum,secondNum));
                break;

            case "*":
                System.out.println(result+multiply(firstNum,secondNum));
                break;

            case "/":
                System.out.println(result+divide(firstNum,secondNum));
                break;

        }



            System.out.println("Would you like to continue?  (Y/N)");

            proceed=scanner.next();


        }while(proceed.equals("Y") || proceed.equals(("y")));





    }


    public static double add(double num1, double num2){

        return num1+num2;
    }


    public static double subtract(double num1, double num2){

        return num1-num2;
    }

    public static double multiply(double num1, double num2){

        return num1*num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN; // Not a Number to indicate an undefined result
        }
        return num1 / num2;
    }




}



/*
Task: Basic Arithmetic Calculator
        Objective: Create a Java program with custom methods to perform basic arithmetic operations: addition, subtraction, multiplication, and division.

        Requirements:

        Arithmetic Methods:

        Create four methods named add, subtract, multiply, and divide. Each method should take two double values as parameters and return the result of the respective arithmetic operation.
        Handling Division by Zero:

        In the divide method, handle the case where the second parameter (the divisor) is zero. Return some indicative value or message in this case.
        User Interaction:

        In the main method, prompt the user to enter two numbers and choose an operation (addition, subtraction, multiplication, or division).
        Based on the user's choice, call the appropriate method and display the result.
        Input Validation:

        Include basic validation for user inputs to ensure they are numeric values. Handle any input errors gracefully.*/
