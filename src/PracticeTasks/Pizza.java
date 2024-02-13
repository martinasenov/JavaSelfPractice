package PracticeTasks;


public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public void setInfo(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }

    public double calCost(String size, int numberOfCheeseTopping,int numberOfPepperoniTopping){

        double cost=0;

        switch (size){
            case "small":
                cost+=10;
                break;
            case "medium":
                cost+=12;
                break;
            case "large":
                cost+=14;
                break;
            case "extra-large":
                cost+=16;
                break;
        }

        cost+=numberOfCheeseTopping*1.5;

        cost+=numberOfPepperoniTopping*0.8;

      return cost;
    }


    public String toString() {
        double totalCost = calCost(this.size, this.numberOfCheeseTopping, this.numberOfPepperoniTopping);
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=$" + totalCost +
                '}';
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

