package week_37_AlgoQuestions;

public class SumOfDigits {


    public static void main(String[] args) {


        int num1=16;
        int num2=132189;
        int num3=493193;


        System.out.println(sumOfDigits(num1));
        System.out.println(sumOfDigits(num2));
        System.out.println(sumOfDigits(num3));

    }


    public static int sumOfDigits(int num) {

        while (num >= 10) {

            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

}


/*
Question-2 Sum of Digits
Given n, take the sum of the digits of n, if that value has more than one digit, continue reducing in this way until a single-digit number is produced.

Examples:
16 → 1 + 6 = 7
942 → 9 + 4 + 2 = 15 → 1 + 5 → 6
132189 → 1 + 3 + 2 + 1 + 8 + 9 + 24 → 2 + 4 = 6
493193 → 4 + 9 + 3 + 1 + 9 + 3 = 29 → 2 + 9 = 11 → 1 + 1 = 2

Constraints: The input will be a non-negative integer.
 */