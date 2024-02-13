package replitTasks.String;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String prefix=str.substring(0,n);
        boolean result=false;

        if(str.substring(n).contains(prefix)){

            result=true;
        }else {

            result=false;
        }

        System.out.println(result);


    }
}

/*
### Use `String methods` to determine if the prefix is found again somewhere later in the String.
A prefix is the set of characters in the beginning of the String. To determine how long the prefix is,  use the given `n` value.
For example, if `n` is 2, the prefix is the first two characters, so you would check if the String from the 3rd character until the end has those two character repeating anywhere.
Output the result as a `boolean value, true or false`.

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    abXYabc
    1

  Output:
    true

  -> 'a' is the prefix because n is 1, and the character 'a' is found again in the String "bXYabc"
```

```
Ex:
  Input:
    abXYabc
    2

  Output:
    true

  -> 'ab' is the prefix because n is 2, and the characters 'ab' are found again in the String "XYabc"
```
```
Ex:
  Input:
    abXYabc
    3

  Output:
    false

  -> 'abX' is the prefix because n is 3, and the characters 'a' are NOT found again in the String "Yabc"
```


 */