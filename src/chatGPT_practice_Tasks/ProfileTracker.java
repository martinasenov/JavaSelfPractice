package chatGPT_practice_Tasks;

import java.util.Scanner;

public class ProfileTracker {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Input: Full Name
            System.out.println("Please enter your full name:");
            String fullName = scanner.nextLine();
            String firstName = extractFirstName(fullName);
            String lastName = extractLastName(fullName);

            // Input: Age
            int age = getValidAge(scanner);

            // Calculate Year of Birth
            int yearOfBirth = 2023 - age;

            // Input: Favorite Quote
            System.out.println("Please enter your favorite quote:");
            String favoriteQuote = scanner.next();

            // Output
            System.out.println("\nUser Profile:");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Year of Birth: " + yearOfBirth);
            System.out.println("Favorite Quote: \"" + favoriteQuote + "\"");
        }

        private static String extractFirstName(String fullName) {
            int spaceIndex = fullName.indexOf(' ');
            if (spaceIndex == -1) {
                return fullName; // Single word name
            }
            return fullName.substring(0, spaceIndex);
        }

        private static String extractLastName(String fullName) {
            int spaceIndex = fullName.lastIndexOf(' ');
            if (spaceIndex == -1) {
                return ""; // Single word name
            }
            return fullName.substring(spaceIndex + 1);
        }

        private static int getValidAge(Scanner scanner) {
            int age;
            while (true) {
                System.out.println("Please enter your age:");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    if (age >= 0) {
                        break;
                    } else {
                        System.out.println("Age cannot be negative.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // consume the invalid input
                }
            }
            return age;
        }
    }



/*
    Task: User Profile Data Formatter
            Objective: Create a Java program that formats and displays user profile data in a neat manner.

            Requirements:

            User Data Input:

            Prompt the user to enter their full name, age, and favorite quote.
            Store these inputs in appropriate variables.
            Data Processing:

            Extract the first name and last name from the full name input. Assume the last word entered is the last name.
            Calculate the year of birth from the age. Assume the current year is 2023.
            Output Formatting:

            Display the user's first name, last name, age, year of birth, and favorite quote in a well-formatted way.
            Use string concatenation or String.format to create the output.
            Extras:

            Implement error handling for the age input (ensure it's a valid number).
            If the user enters more than two words for their name, handle this gracefully.
            Guidelines:

            Focus on string manipulation techniques in Java.
            Make sure to handle different edge cases, such as invalid age input or unusual name inputs.
            Use methods to organize your code, especially for different stages like input, processing, and output.*/
