package week16_AlgoQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndexOfFirstNonRepeatingVowel {


    public static void main(String[] args) {


        System.out.println(nonRepeatingVowelIndex("google"));


    }


    public static int nonRepeatingVowelIndex(String word) {

        Map<Character, int[]> map = new LinkedHashMap<>();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};


        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            for (char vowel : vowels) {
                if (ch == vowel) {
                    if (!map.containsKey(ch)) {
                        map.put(ch, new int[]{1, i});
                    } else {
                        map.get(ch)[0]++;
                    }
                    break;
                }
            }
        }


        for (Map.Entry<Character, int[]> entry : map.entrySet()) {
            if (entry.getValue()[0] == 1) {
                return entry.getValue()[1];
            }
        }

        return -1;

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
