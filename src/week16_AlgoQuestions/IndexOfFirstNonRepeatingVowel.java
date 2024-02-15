package week16_AlgoQuestions;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class IndexOfFirstNonRepeatingVowel {


    public static void main(String[] args) {


        System.out.println(nonRepeatingVowelIndex("google"));
        System.out.println(nonRepeatingVowelIndex("mood"));
        System.out.println(nonRepeatingVowelIndex("responsible"));
        System.out.println(nonRepeatingVowelIndex(""));


    }


    public static String nonRepeatingVowelIndex(String word) {

        Map<Character,Integer> freqMap=new LinkedHashMap<>();
        char[] vowels={'a','e','i','o','u'};

        if(word==null){
            return "null";
        }
        if (word.isEmpty()) {
            return "the word is empty";
        }

        for (int i = 0; i < word.length(); i++) {
            int count=0;

            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            freqMap.put(word.charAt(i),count);
        }

        String result="";
        for (Map.Entry<Character, Integer> eachEntry : freqMap.entrySet()) {

            for (char vowel : vowels) {
               if ( eachEntry.getKey()==vowel && eachEntry.getValue()<2){
                   return result+=eachEntry.getKey()+":"+word.indexOf(eachEntry.getKey());
               }
            }
        }
        return "no non-repeating vowel";
    }



}




/*



Question-2.The Index of the first Non-repeating Vowel
Given a string, write a method to find the index of the first non-repeating vowel (a, e, i, o, u) in it and return it.
If it doesn't exist, return -1. Assume that string is not empty, and all the character of the String is lowercase.

Try to solve with Map data structure like using a Map<Character, Integer>.

Example-1:
Input: “google”
Output: 5
Explanation: only e is non-repeated vowel, and its index is 5

Example-2:
Input: “responsible”
Output: 4
Explanation: e is repeated, "o" and "i" are not repeated, o is the first non-repeating vowel

Example-3:
Input: “mood”
Output: -1
Explanation: o is repeated, no non-repeating vowel.















 */
