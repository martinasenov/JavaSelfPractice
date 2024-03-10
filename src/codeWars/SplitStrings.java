package codeWars;

import java.sql.Array;
import java.util.Arrays;

public class SplitStrings {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(splitStrings("abcdef")));
        System.out.println(Arrays.toString(splitStrings("abcde")));

    }

public static String [] splitStrings(String word){

    int arraySize = word.length() / 2 + word.length() % 2;

    String[] result = new String[arraySize];

     for (int i = 0, j = 0; i < word.length(); i += 2, j++) {

            if (i + 1 < word.length()) {
                result[j] = word.substring(i, i + 2);
            } else {

                result[j] = word.substring(i, i + 1) + "_";
            }
        }
    return result;

}

}


/*
Split Strings

Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']

 */