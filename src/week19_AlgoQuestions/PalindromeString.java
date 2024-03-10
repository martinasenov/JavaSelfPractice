package week19_AlgoQuestions;

public class PalindromeString {

    public static void main(String[] args) {


        System.out.println(isPalindrome("Radar"));
        System.out.println(isPalindrome("Summer"));
        System.out.println(isPalindrome("Was it a car or a cat I saw"));
        System.out.println(isPalindrome(""));


    }


    public static boolean isPalindrome(String input) {

        if (input == null) {

            throw new IllegalArgumentException("String can not be null or empty");
        }

        input = input.toLowerCase().replaceAll(" ","");
        String reversedInput = "";



        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != reversedInput.charAt(i)) {
                return false;
            }
        }

        return true;
    }


}


/*
Question-1 Palindrome String
A string is said to be palindrome after converting all uppercase letters into lowercase letters and removing all spaces it reads the same backward as forward.
For e.g. civic, radar, level, rotor, race car are palindromes because if we try to read it from backward, it is same as forward.
Write a method that accepts a String as argument and return true if it is a palindrome, or false otherwise.
Assume that string has only alphanumeric characters including letters and numbers and spaces, ignore upper-lowercase characters and spaces.

Examples:
Radar → true
rotator → true
Summer→ false

Was it a car or a cat I saw → true
“” → true
“ ” → true
 */