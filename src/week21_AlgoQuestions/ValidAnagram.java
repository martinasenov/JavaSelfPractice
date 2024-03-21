package week21_AlgoQuestions;

import java.util.Arrays;

public class ValidAnagram {


    public static void main(String[] args) {


        System.out.println(isAnagram("anagram", "nagaram"));


    }


    public static boolean isAnagram(String word1, String word2) {

        boolean isAnagram = false;

        if (word1.length() != word2.length()) {
            return isAnagram;
        }

        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();

        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);

        if (Arrays.equals(word1Chars, word2Chars)){
            isAnagram=true;
        }

        return isAnagram;
    }
}
