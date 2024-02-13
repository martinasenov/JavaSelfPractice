package replitTasks.String;

import java.util.Scanner;

public class ComputerBuilder {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double totalPrice=0;

        System.out.println("Select screen size:");
        String size=input.nextLine();

        totalPrice+=chooseScreenSize(size);



        System.out.println("Select CPU type:");

        String cpuType=input.nextLine();

        totalPrice+=chooseCPU(cpuType);



        System.out.println("Select RAM size:");



        int RAM=input.nextInt();


        totalPrice+=chooseRAM(RAM);

        input.nextLine();




        System.out.println("Select storage type:");
        String storageType=input.nextLine();


        System.out.println("Select storage size:");
        int storageSize=input.nextInt();
        input.nextLine();


        totalPrice+=storageType(storageType,storageSize);


        System.out.println("Select screen resolution:");
        String res=input.nextLine();

        totalPrice+=resolution(res);



        System.out.println("Final price is: $" + totalPrice);


    }


    public static int chooseScreenSize(String size) {

        Scanner input = new Scanner(System.in);
        int price=0;
        while (true) {

            if (!size.equals("13.3") && !size.equals("15.0") && !size.equals("17.3")) {
                System.out.println("invalid input. These are the options: \n\t13.3\n\t15.0\n\t17.3");
                size = input.nextLine();
                continue;
            }

            break;
        }

        switch (size) {

            case "13.3":
                price+=200;
                break;
            case "15.0":
                price+=300;
                break;
            case "17.3":
                price+=400;
                break;

        }

        return price;
    }

    public static int chooseRAM(int RAM){

        Scanner input = new Scanner(System.in);

        while (true) {

                if(RAM%4!=0){

                    System.out.println("The number must be 4 or a multiple of 4");
                    input.nextInt();
                    continue;
                }

            break;
        }

        return (RAM/4)*50;

    }

    public static int chooseCPU(String CPU){

        int price=0;
        Scanner input = new Scanner(System.in);

        while (true) {

            if (!CPU.equals("i3") && !CPU.equals("i5") && !CPU.equals("i7")) {
                System.out.println("invalid input. These are the options: \n\ti3\n\ti5\n\ti7");
                CPU = input.nextLine();
                continue;
            }

            break;
        }

        switch (CPU) {

            case "i3":
                price+= 150;
                break;
            case "i5":
                price+= 250;
                break;
            case "i7":
                price+= 350;
                break;

        }

        return price;

    }

    public static int storageType(String type, int size){
        Scanner input= new Scanner(System.in);
        int price=0;

        while (true){
            if(!type.equals("HDD") && !type.equals("SSD")) {
                System.out.println("Invalid entry. The option are HDD or SSD");
                type=input.nextLine();
                continue;
            }

            break;
        }

        switch (type){

            case "HDD":
                price+=(size/500)*50;
                break;
            case "SSD":
                price+=(size/500)*100;
                break;
        }

        return price;

    }

    public static int resolution(String res){
        Scanner input= new Scanner(System.in);
        int price = 0;
        while (true){
            if(!res.equals("4K") && !res.equals("FULLHD")) {
                System.out.println("Invalid entry. The option are FULLHD or 4K");
                res=input.nextLine();
                continue;
            }

            break;
        }

        switch (res){

            case "4K":
                price+=200;
                break;
            case "FULLHD":
                price+=100;
                break;
        }

        return price;
    }


}





/*
### Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:

        **First ask the user about the screen size**
        > Select screen size:
        > - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price

**Then ask the user about the CPU**
        > Select CPU type:
        > - For a CPU of `i3`, add `$150` to the total price
> - For a CPU of `i5`, add `$250` to the total price
> - For a CPU of `i7`, add `$350` to the total price

**Then ask the user about the RAM size**
        > Select RAM size:
        > - Add `$50` to the total price for every 4GB of ram.
        Assume the ram amounts will be divisible by 4

        **Then ask the user about the storage type and amount**

        > Select storage type:

        > Select storage size:

        > - For `HDD`, add `$50` to the total price for every 500GB
> - For `SSD`, add `$100` to the total price for every 500GB

**Then ask the user about the screen resolution**
        > Select screen resolution:
        > - For `FULLHD`, add `$100` to the total price
> - For `4K`, add `$200` to the total price

** At the end display the total price of the custom computer**
        > Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

**Example Flows:**

        ```
Select screen size:
        13.3
Select CPU type:
i7
Select RAM size:
        8
Select storage type:
SSD
Select storage size:
        1000
Select screen resolution:
        4K
Final price is: $1050.0
        ```

        ```
Select screen size:
        13.3
Select CPU type:
i3
Select RAM size:
        4
Select storage type:
HDD
Select storage size:
        500
Select screen resolution:
FULLHD
Final price is: $550.0
        ```*/
