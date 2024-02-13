package chatGPT_practice_Tasks;

public class TemperatureConverter {


    public static int celsiusToFahrenheitConverter(int celsius){

        return (celsius*9/5)+32;
    }


    public static void main(String[] args) {

        int celsius=5;
        int fahrenheit = celsiusToFahrenheitConverter(celsius);

        System.out.println(celsius+" Celsius = "+fahrenheit+" fahrenheit ");
    }




}
/*
Task: Implement a Temperature Converter
        Objective: Create a Java program with custom methods to convert temperatures between Celsius and Fahrenheit.

        Requirements:

        Method for Celsius to Fahrenheit:

        Create a method named celsiusToFahrenheit that takes a Celsius temperature as input and returns the equivalent Fahrenheit temperature.
        Method for Fahrenheit to Celsius:

        Create a method named fahrenheitToCelsius that takes a Fahrenheit temperature as input and returns the equivalent Celsius temperature.
        User Interaction:

        In the main method, prompt the user to enter a temperature and choose whether to convert from Celsius to Fahrenheit or vice versa.
        Use the appropriate method to perform the conversion and display the result.
        Formulas:

        Celsius to Fahrenheit: (Celsius * 9/5) + 32
        Fahrenheit to Celsius: (Fahrenheit - 32) * 5/9
        Guidelines:

        Ensure your methods have appropriate return types.
        Handle the user input in the main method.
        Feel free to add any additional features or validations as you see fit.*/
