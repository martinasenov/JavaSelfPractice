package week09_AlgoQuestions.duplicateCharCount;

public class DuplicateCharCount {

    public static void main(String[] args) {



        countOfDuplicatedChars("aabBcde");


    }




    public static void countOfDuplicatedChars(String example) {

        example = example.toLowerCase();

        char[] array = example.toCharArray();

        boolean[] counted = new boolean[array.length];

        int duplicateCount = 0;

        for (int i = 0; i < array.length; i++) {

            if (counted[i]) {
                continue;
            }

            boolean isDuplicate = false;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !counted[j]) {
                    isDuplicate = true;
                    counted[j] = true;
                }
            }

            if (isDuplicate) {
                duplicateCount++;
                counted[i] = true;
            }
        }

        System.out.println(duplicateCount);
    }





    }



/*
Question-2 Count the number of Duplicated Chars
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Examples:
        "abcde" -> 0 # no characters repeat more than once.
        "aabbcde" -> 2 # 'a' and 'b'
        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice ('b' and 'B')
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
        "aA11" -> 2 # 'a' and '1'
        "ABBA" -> 2 # 'A' and 'B' each occur twice.*/
