package week18_AlgoQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfDigits {


    public static void main(String[] args) {


        System.out.println(sumOfDigits(16));
        System.out.println(sumOfDigits(942));
        System.out.println(sumOfDigits(132189));
        System.out.println(sumOfDigits(493193));


    }

    public static int sumOfDigits(int number){

        int result=0;

        String str=String.valueOf(number);

        for (int i = 0; i < str.length(); i++) {
            result+=Integer.valueOf(str.charAt(i)+"");
        }
        return result;
    }


}
/*

Question-1 Sum of Digits
Given a number, write a method that finds the sum of its digits.
Examples :

Input: n = 687
Output: 21

Input: n = 12
Output: 3

 */