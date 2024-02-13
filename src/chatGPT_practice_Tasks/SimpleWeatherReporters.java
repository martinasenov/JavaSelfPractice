package chatGPT_practice_Tasks;

import java.util.Scanner;

public class SimpleWeatherReporters {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int weatherInCelsius;
        String weatherDescription="";

        System.out.println("How is the weather today ? Please enter the value in Celsius");

        while(!scanner.hasNextInt()){
            System.out.println("Please enter an integer number");
            scanner.next(); // Consume the non-integer input
        }

        weatherInCelsius = scanner.nextInt();

        if (weatherInCelsius < 0) {
            weatherDescription = "Freezing weather.";
        } else if (weatherInCelsius <= 10) { // Ranges are exclusive
            weatherDescription = "Very Cold weather.";
        } else if (weatherInCelsius <= 20) {
            weatherDescription = "Cold weather.";
        } else if (weatherInCelsius <= 30) {
            weatherDescription = "Normal in Temp.";
        } else if (weatherInCelsius <= 40) {
            weatherDescription = "It's Hot.";
        } else {
            weatherDescription = "It's Very Hot.";
        }

        System.out.println("The weather is: " + weatherDescription);
    }

    }

/*
Task: Simple Weather Reporter
        Objective: Create a Java program that simulates a basic weather reporter. The user will input a temperature value, and the program will give a simple weather description based on the temperature.

        Requirements:

        Temperature Input:

        Prompt the user to input a temperature value in Celsius.
        Weather Description Logic:

        Based on the input temperature, determine the weather description:
        Below 0°C: "Freezing weather."
        0°C to 10°C: "Very Cold weather."
        11°C to 20°C: "Cold weather."
        21°C to 30°C: "Normal in Temp."
        31°C to 40°C: "It's Hot."
        Above 40°C: "It's Very Hot."
        Use if-else statements or a switch-case structure to handle these conditions.
        Output:

        Display the temperature and the corresponding weather description.
        Use of Ternary Operator:

        Implement at least one ternary operator in your program, possibly for a specific condition or output enhancement.
        Error Handling:

        Include basic error handling for non-numeric inputs.*/
