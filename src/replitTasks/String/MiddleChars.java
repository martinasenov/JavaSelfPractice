package replitTasks.String;

import java.util.Scanner;

public class MiddleChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result="";
        int mid=0;


        mid=word.length()/2;

        if(word.length()%2==0){
            result=word.substring(mid-1,mid+1);
        }else {
            result=word.charAt(mid)+"";
        }




        System.out.println(result);




    }
}

/*

### Use `String methods` and `if statements` to find the middle character/s of the given `word` variable. The value of the `word` will be input from a Scanner,
 but you only need to interact with the String variable. Output in the following format:

#### Note: Odd length words will have one middle character,
but even length words will have two middle character,
so use the length of the Strings to determine what the output should be.


Main topics: String manipulation, Scanner, methods, primitive data types, concatenation, if statements, operators

```
Ex:
  Input:
    oak

  Output:
    a
```
```
Ex:
  Input:
    java

  Output:
    av
```
```
Ex:
  Input:
    apples

  Output:
    pl
```


 */
