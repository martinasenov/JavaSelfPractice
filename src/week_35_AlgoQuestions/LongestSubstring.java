package week_35_AlgoQuestions;

public class LongestSubstring {


    public static void main(String[] args) {

        String s1="abcabcbb";
        String s2="bbbbb";
        String s3="pwwkew";


        System.out.println(longestSubstring(s1));
        System.out.println(longestSubstring(s2));
        System.out.println(longestSubstring(s3));

    }


    public static int longestSubstring(String word){
        int result = 0;
        int helperPointer = 0;

        for (int i = 0; i < word.length(); i++) {

            if (!word.substring(helperPointer, i).contains(word.charAt(i) + "")) {

                result = Math.max(result, i - helperPointer + 1);

            } else {

                while (word.charAt(helperPointer) != word.charAt(i)) {
                    helperPointer++;
                }
                helperPointer++;
            }
        }

        return result;
    }



}


/*
Question-2 Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */