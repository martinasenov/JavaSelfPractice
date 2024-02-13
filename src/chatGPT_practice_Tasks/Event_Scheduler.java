package chatGPT_practice_Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Event_Scheduler {


    public static void main(String[] args) {


        List<String> events = new ArrayList<>();
        events.add("Meeting - 15/12/2023");
        events.add("Trip to New York - 24/12/2023");
        events.add("Trip to Basel - 02/01/2023");
        events.add("Birthday Party - 25/01/2023");



        Scanner input=new Scanner(System.in);
        int option,eventNum;
        String addedEvent;
        String addedEventDescription;
        String addedEventDate;
        boolean isRunning=true;

        while(isRunning){



        System.out.println("\nWhat would you like to do? Please enter a number between 1-4\n\t1.View events\n\t2.Add an event\n\t3.Remove an event\n\t4.Edit an event\n\t5.Exit");

        while(true){

            if (!input.hasNextInt()){
                System.err.println("Invalid input.\nPlease enter a Number!");
                input.next();
                continue;
            }

            option=input.nextInt();

            if(option<1 || option>5){
                System.err.println("Invalid input!\nThe number must be 1 to 4");

                continue;
            }

            break;
        }


        input.nextLine();


        switch (option){

            case 1:
                if(events.size()>0) {
                    printEvents(events);
                }else {
                    System.out.println("There is no event in the Schedule");
                }
                break;


            case 2:
                System.out.println("Please enter description of the event");
                addedEventDescription=input.nextLine();
                System.out.println("Please enter the date of the event in DD/MM/YYYY format");
                addedEventDate=input.nextLine();

                addedEvent=addedEventDescription+" - "+addedEventDate;
                events.add(addedEvent);
                System.out.println(addedEvent + " is added to your Schedule");
                break;


            case 3:

                if(events.size()>0) {
                    System.out.println("Enter the index number of the event that you want to remove :\n");
                    printEvents(events);


                    while (true) {

                        if (!input.hasNextInt()) {
                            System.out.println("invalid index number. Please enter a number between 1-" + events.size());
                            input.next();
                            continue;
                        }

                        eventNum = input.nextInt() - 1;



                        String removedEvent = events.get(eventNum);
                        events.remove(eventNum);
                        System.out.println(removedEvent + " has been removed from the Schedule");
                        break;
                    }

                }else{

                    System.out.println("There is no event in the Schedule");
            }

                break;


            case 4:

                if(events.size()>0) {
                    System.out.println("Please enter the index number of the event that you want to edit :\n");
                    printEvents(events);

                    while (true) {

                        if (!input.hasNextInt()) {
                            System.err.println("Please enter a number!");
                            input.next();
                            continue;
                        }

                        eventNum = input.nextInt();

                        if(eventNum>events.size() || eventNum<=0){
                            System.err.println("Invalid input!\nThe number must be 1 to "+ events.size());
                            continue;
                        }

                        input.nextLine();
                        eventNum-=1;

                        System.out.println("Please enter description of the event");
                        addedEventDescription=input.nextLine();

                        System.out.println("Please enter the date of the event in DD/MM/YYYY format");
                        addedEventDate=input.nextLine();

                        addedEvent=addedEventDescription+" - "+addedEventDate;
                        String replacedEvent=events.remove(eventNum);

                        events.add(eventNum,addedEvent);

                        System.out.println("\""+replacedEvent+"\"" + " has been successfully updated by new the event:\n" +"\""+ addedEvent+"\"");

                        break;
                    }

                    break;

                }else {

                    System.out.println("There is no event in the Schedule");
                }
                break;

            default:
                System.out.println("See you next time!");
                System.exit(0);
        }


        System.out.println("Would you like to continue using the app (Y/N)");
        String response=input.next();
        if(!response.equalsIgnoreCase("Y")){

            isRunning=false;
        }

   }
        System.out.println("Thanks for using the Event Scheduler App, See you next time");

    }


    public static void printEvents(List<String> events) {
        for (int i = 0; i < events.size(); i++) {
            System.out.println((i + 1) + "." + events.get(i));
        }
    }


    }









/*
Task: Event Scheduler
        Objective: Create a Java program that allows a user to schedule and view events.

        Requirements:

        Event Details:
        Define a simple structure to hold an event's details. For simplicity, an event can have a name and a date. You can use a String to store both details (e.g., "Meeting - 15/11/2023").

        Adding Events:
        Allow the user to add new events. The user should be able to enter the event name and date.

        Storing Events:
        Use an array or similar data structure to store the list of events. You can start with a fixed-size array, and each new event is added to this array.

        Displaying Events:
        Implement a feature to display all scheduled events.

        User Interaction:
        Create a simple text-based user interface that lets users choose an action: add an event, view all events, or exit the program.

        Input Validation:
        Include basic validation for user inputs, ensuring that event details are entered correctly.*/
