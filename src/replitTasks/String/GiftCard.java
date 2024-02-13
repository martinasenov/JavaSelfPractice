package replitTasks.String;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int giftCardBalance=100,
                blanket=60,
                charger=5,
                hat=25,
                headphones=30,
                laptop=200,
                pants=50,
                pillow=40,
                smartphone=1000,
                socks=5,
                usbCable=10;


        boolean proceed=true;

        do {


        System.out.println("\nHello, which item would you like?\n");

        itemList();

        String chosenItem=input.nextLine().toLowerCase();



            switch (chosenItem){

                case "blanket":
                    giftCardBalance=purchaseVerifier(giftCardBalance,blanket);
                    break;

                case "charger":
                    giftCardBalance=purchaseVerifier(giftCardBalance,charger);
                    break;

                case "hat":
                    giftCardBalance=purchaseVerifier(giftCardBalance,hat);
                    break;
                case "headphones":
                    giftCardBalance=purchaseVerifier(giftCardBalance,headphones);
                    break;
                case "laptop":
                    giftCardBalance=purchaseVerifier(giftCardBalance,laptop);
                    break;
                case "pants":
                    giftCardBalance=purchaseVerifier(giftCardBalance,pants);
                    break;
                case "pillow":
                    giftCardBalance=purchaseVerifier(giftCardBalance,pillow);
                    break;
                case "smartphone":
                    giftCardBalance=purchaseVerifier(giftCardBalance,smartphone);
                    break;
                case "socks":
                    giftCardBalance=purchaseVerifier(giftCardBalance,socks);
                    break;
                case "usb cable":
                    giftCardBalance=purchaseVerifier(giftCardBalance,usbCable);
                    break;
                default:
                    invalidItem();
                    break;

            }

        if(giftCardBalance!=0) {

            System.out.println("Would you like to continue?(Yes/No)");
            String IfProceed = input.nextLine().toLowerCase();

            while (!IfProceed.equals("yes") && !IfProceed.equals("no")) {

                System.out.println("Invalid entry. Please type Y or N");
                IfProceed = input.nextLine().toLowerCase();

            }


            if (IfProceed.equals("no")) {
                System.out.println("Thanks for using the App!!!");
                proceed = false;

            }

        }else{

            System.out.println("You used up your giftcard. Thanks for using the App!!!");
            proceed = false;
        }

        }while (proceed);
    }


    public static void itemList(){

        System.out.println(
                "> - Blanket: $60\n" +
                        "> - Charger: $5\n" +
                        "> - Hat: $25\n" +
                        "> - Headphones: $30\n" +
                        "> - Laptop: $200\n" +
                        "> - Pants: $50\n" +
                        "> - Pillow: $40\n" +
                        "> - Smartphone: $1000\n" +
                        "> - Socks: $5\n" +
                        "> - USB cable: $10");

    }

    public static int purchaseVerifier(int balance,int item){


        if(balance>item || balance==item){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(balance-item)+"$");
            return balance-item;
        }else{

            System.out.println("Sorry, not enough funds on your gift card");

        }
        return balance;
    }

    public static void invalidItem(){

        System.out.println("Sorry, that is an invalid item");
    }

}



/*
### You got a $100 gift card for your birthday, but we can't use it yet. We need to build the application for the store in order to use our gift card.

        #### The program will ask the user to enter the item they want to buy. Then it will check if that item is in the store inventory.
        If the item is available there will be a confirmation message displayed and the remaining balance on the gift card will be output as well.
        In some cases that item may not be available in the store and in other cases we may not have enough money on the gift card to buy an item so
        we must handle both of these conditions as well. We can only make one purchase at a time.

** List of items, with prices, available in the store:**

> - Blanket: $60
> - Charger: $5
> - Hat: $25
> - Headphones: $30
> - Laptop: $200
> - Pants: $50
> - Pillow: $40
> - Smartphone: $1000
> - Socks: $5
> - USB cable: $10

- If the item is not in the list, display message: `Sorry, that is an invalid item`
        - If the price of the item we want is more than $100, display message: `Sorry, not enough funds on your gift card`

        #### Hint: Use a switch statement to avoid having to compare String values in if statements. Don't forget to create your Scanner object.

Main topics: switch statements, primitive variables, operators, Scanner

**Example Flows:**

        ```
Hello, which item would you like?
Hat
Thank you for your purchase!
Your current balance is: 75$
```

        ```
Hello, which item would you like?
Pants
Thank you for your purchase!
Your current balance is: 50$
```

        ```
Hello, which item would you like?
Laptop
Sorry, not enough funds on your gift card
```

        ```
Hello, which item would you like?
Cupcake
Sorry, that is an invalid item
```*/
