package replitTasks.String;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result="";

        if(word.length()<5){
            result="Too short!";
        }else if (word.length()>5){
            result="Too long!";
        }else {

            for (int i = word.length()-1; i >= 0; i--) {

                result+=word.charAt(i);
            }
        }

        System.out.println(result);

    }
}


/*
### Use `String methods` and `if statements` to reverse a String that is five characters long. If the given `word` is not five characters long, it will not be reversed. Use the following to output a value:

> - If the `word` is less than 5 characters: print `Too short!`
> - If the `word` is more than 5 characters: print `Too long!`
> - If the `word` is 5 characters: print the `reversed version` of the String. Reading characters from the end to the beginning.


Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    cat

  Output:
    Too short!
```

```
Ex:
  Input:
    singularity

  Output:
    Too long!
```
```
Ex:
  Input:
    apple

  Output:
    elppa
```
 */