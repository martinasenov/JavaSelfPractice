package replitTasks.String;

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();


        if(word1.length()>word2.length()){

            System.out.println(word1);

        }else {

            System.out.println(word2);
        }





    }


}


/*
Use `String methods` and `if statements` to find which of the given words is the longest one. Compare the two inputs `word1` and `word2` and print the word with more characters.

#### Note: The two words will not have the same lengths

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    bill
    check

  Output:
    check
 */
