package replitTasks.String;

import java.util.Scanner;

public class BurgerOrChicken {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String order = s.next();


        if(order.equals("chicken")){

            System.out.println("Your total is $9.75");
        }


        if (order.equals("burger")){

            System.out.println("Your total is $12.55");
        }


    }


}


/*
Use `String methods` and `if statements` for the fast food company's menu. There is two main orders: A Burger meal or a Chicken meal.
 The cashier will have an input `order` that will be used to determine the price. Use the following information to determine the price of the order:

> - burger: $12.55
> - chicken: $9.75

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    chicken

  Output:
    Your total is $9.75
```

```
Ex:
  Input:
    burger

  Output:
    Your total is $12.55
 */
