package week_32_AlgoQuestions;

public class AlterCase {


    public static void main(String[] args) {


    String s= "We are the world";
        System.out.println(alterCase(s));

    }


    public static String alterCase(String word){

        StringBuilder result = new StringBuilder();
        boolean toUpperCase = true;

        for (char ch : word.toCharArray()) {

            if (Character.isAlphabetic(ch)) {

                if (toUpperCase) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(Character.toLowerCase(ch));
                }

                toUpperCase = !toUpperCase;

            } else {
                result.append(ch);
            }

        }

        return result.toString();
    }
    }







/*


Question-2 Alter Case
Given a path of input file which includes sentence(s), write a program that reads alternates the case of every alphabetic character,
starting with uppercase. Spaces and non-alphabetical characters should be added to the final output as is, i.e.
they should not be taken into account when alternating between upper/lowercase. Input: Your program should read lines from file as a standard input.
Each line contains a sentence. Assume all characters are ASCII. Output: For each sentence from standard input, return a string which contains a sentence in each
line such that the first character is uppercase, the next character is lowercase and so on.

Test 1
Test Input: We are the world
Expected Output: We ArE tHe WoRlD





 */