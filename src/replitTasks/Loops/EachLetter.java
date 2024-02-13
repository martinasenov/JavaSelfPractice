package replitTasks.Loops;

import java.util.Scanner;

public class EachLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();


        for (int i = 0; i < word.length(); i++) {

            System.out.println(word.charAt(i));

        }




    }
}


/*
### Use a `loop` to print each letter of the given `word` on a separate line

Main topics: loops, primitive datatypes, operators, Scanner, String

```
Ex:
  Input:
    hello

  Output:
    h
    e
    l
    l
    o
```
```
Ex:
  Input:
    Zimbabwe

  Output:
    Z
    i
    m
    b
    a
    b
    w
    e
```
 */