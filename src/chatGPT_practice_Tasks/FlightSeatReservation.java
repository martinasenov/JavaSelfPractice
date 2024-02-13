package chatGPT_practice_Tasks;

import java.util.Scanner;

public class FlightSeatReservation {

    public static void main(String[] args) {


        Boolean [] seats={true,false,true,true,false,false,true,false,false,true};


        Scanner scanner=new Scanner(System.in);

        int reserve;
        String proceed;


        do{
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Please enter seat number between 1-10 to reserve");

          do {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a NUMBER between 1-10");
                scanner.next(); // Consume the non-integer input
            }

            reserve = scanner.nextInt();

            if (reserve < 1 || reserve > 10) {
                System.out.println("Wrong input, please enter a NUMBER between 1-10");
            }

         } while (reserve < 1 || reserve > 10); // Repeat if input is not in the range 1-10


        reserve-=1;

        Boolean selectedSeat=seats[reserve];

            if(selectedSeat==true){

                System.out.println("You successfully reserved the seat number "+(reserve+1));
            }else {

                System.out.println("The seat number "+(reserve+1)+" is taken");
            }

            System.out.println("Would you like to reserve another seat ? (Y/N)");


            proceed=scanner.next();


        }while(proceed.equals("Y") || proceed.equals(("y")));



        System.out.println("Thank you for traveling with us !");


    }
}
/*
Task: Flight Seat Reservation System
        Objective: Create a Java program that simulates a simple flight seat reservation system. The program should allow users to choose seats on a hypothetical flight.

        Requirements:

        Seat Initialization:

        Initialize an array representing seats on the flight. Assume the flight has 10 seats.
        Seats can be represented as booleans in an array, where true indicates the seat is taken and false means it is available.
        Seat Reservation:

        Prompt the user to reserve a seat by entering a seat number (1-10).
        Check if the seat is available. If it is, reserve it (set to true), and confirm the reservation to the user.
        If the seat is already taken, inform the user and let them try again.
        Multiple Reservations:

        Allow multiple reservations until the user decides to quit or until the flight is fully booked.
        Include an option for the user to exit the reservation process.
        Flight Full Check:

        If all seats are booked, inform the user that the flight is fully booked and exit the program.
        Extras:

        Implement a feature to display all available seats to the user.
        Consider using methods to handle different parts of the program, like checking seat availability, handling reservations, and displaying seat status.
        Guidelines:

        Use arrays effectively to manage the seats.
        Make sure to handle invalid inputs (like non-numeric inputs or seat numbers out of range).
        Keep your code well-organized and commented.*/
