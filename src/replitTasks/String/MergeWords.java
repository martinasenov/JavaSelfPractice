package replitTasks.String;

import java.util.Scanner;

public class MergeWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String result= "";

        if(word1.length()==3 && word2.length()==3){


            for (int i = 0; i <3 ; i++) {

                result+=""+word1.charAt(i) + word2.charAt(i);
            }


        }else {

            result = "cannot merge";
        }


        System.out.println(result);


    }

}


/*
### Use `String methods` and `if statements` to  combine the two given String variables, `word1` and `word2` together, but only combine them if the Strings are only three character long.
If either String is not three characters long, do not merge them together and instead print `cannot merge`.
If both Strings are three characters long then merge them together in the following format and print the merged String:

#### The Strings will be merged by taking the first character of the first word, then the first character of the second word, then the second character of the first word, etc...

#### Hint: Concatenating any type with a String, converts the type to a String

Main topics: String manipulation, Scanner, methods, primitive data types, concatenation, if statements

```
Ex:
  Input:
    aok
    lol

  Output:
    alookl
```

```
Ex:
  Input:
    ear
    pie

  Output:
    epaire
```
```
Ex:
  Input:
    java
    wow

  Output:
    cannot merge
```

 */