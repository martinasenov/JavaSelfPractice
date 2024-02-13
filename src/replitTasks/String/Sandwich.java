package replitTasks.String;

import java.util.Scanner;

public class Sandwich {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result="";

        if(str.indexOf("bread")!=str.lastIndexOf("bread")){

            result=str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
        }else {

            result="nothing";
        }

        System.out.println(result);




    }
}


/*
### Use `String methods` and `if statements` to find what is inside the sandwich.
A sandwich is two pieces of bread with something between them. We want to see what is between our bread pieces.
There will have only one input `str`. Inside the `str` String we will look for the first occurrence of the text 'bread' and the last occurrence of the text 'bread'.
Using those two points we will pull out the text between them.

> - If there is not two pieces of bread print the text: `nothing`

Main topics: String manipulation, Scanner, methods, primitive data types, concatenation, if statements

```
Ex:
  Input:
    breadjambread

  Output:
    jam
```
```
Ex:
  Input:
    xxbreadjambreadyy

  Output:
    jam
```
```
Ex:
  Input:
    xxbreadapple

  Output:
    nothing
```

(add edge case of multiple bread pieces, we want first and last occurrences, so everything in between is returned)
 */