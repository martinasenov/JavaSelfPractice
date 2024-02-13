package replitTasks.Loops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result=1;

        for (int i = n; i >= 1 ; i--) {

            result*=i;
        }

        System.out.println(result);

    }

}

/*
### Use a `loop` to calculate the factorial of the given number `n`.
In mathematics a `factorial` number is a positive integer that is the product of all the positive integers less than or equal to the `n` number.
It is commonly written as `n!` In other words, a factorial value is the number multiplied to the number less than it, multiplied by the number less than it, repeating until 1.

See the examples for clarification.

Main topics: loops, primitive datatypes, operators, Scanner

```
Ex:
  Input:
    5

  Output:
    120

  -> The calculation would be:
    5 * 4 * 3 * 2 * 1 = 120
```
```
Ex:
  Input:
    8

  Output:
    40320

  -> The calculation would be:
    8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 40320
```
 */