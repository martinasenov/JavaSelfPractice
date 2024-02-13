package week16_AlgoQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfChars {

    public static void main(String[] args) {


        System.out.println(freqOfChars("irresponsible"));


    }



public static Map<Character,Integer> freqOfChars(String word){

    Map<Character,Integer> map=new LinkedHashMap<>();

    if(word==null){
        return null;
    }
    if (word.isEmpty()) {
        return map;
    }

    for (int i = 0; i < word.length(); i++) {
        int count=0;

        for (int j = 0; j < word.length(); j++) {

            if (word.charAt(i)==word.charAt(j)){
                count++;
            }
        }
        map.put(word.charAt(i),count);
    }

    return map;

}

}





/*

Question-1-Frequency of Characters
Write a method that returns the frequency of each character of a given String parameter.
If the given String is null, then return null If the given String is empty return an empty map

Example-1

input: “”
output: empty map
explanation: input is empty

Example-2

input: null
output: null
explanation: input is null.

Example-3

input: responsible
output: {r=1, e=2, s=2, p=1, o=1, n=1, i=1, b=1, l=1}
explanation: characters are keys and occurrences are values

 */