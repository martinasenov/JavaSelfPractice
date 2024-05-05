package codeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public  static  String spinWords(String sentence) {

        String [] array=sentence.split(" ");
        String newString="";

        for (int i = 0; i < array.length; i++) {

            if (array[i].length()>4){

                 array[i]=ReverseWords.reverse(array[i]);

            }
            newString+=array[i]+" ";
        }
          return newString.trim();
    }

    public static void main(String[] args) {

        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));

    }


}


/*

Write a function that takes in a string of one or more words, and returns the same string,
but with all words that have five or more letters reversed (Just like the name of this Kata).
Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.


Examples:

"Hey fellow warriors"  --> "Hey wollef sroirraw"
"This is a test        --> "This is a test"
"This is another test" --> "This is rehtona test"

 */