package week18_AlgoQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfDigits {


    public static void main(String[] args) {


        /*System.out.println(sumOfDigits(687));
        System.out.println(sumOfDigits(12));
        System.out.println(sumOfDigits(37));*/

        System.out.println(sumOfDigits2(687));
        System.out.println(sumOfDigits2(12));
        System.out.println(sumOfDigits2(37));
        System.out.println(sumOfDigits2(123456789));

        System.out.println(sumOfDigits2(213));


    }

    public static int sumOfDigits2(int number){

        int result=0;

        while (number>0){
            result+=number%10;
            number/=10;
        }
        return result;

    }

    public static int sumOfDigits(int number){

        int result=0;

        String str=String.valueOf(number);

        for (int i = 0; i < str.length(); i++) {
            result+=Integer.parseInt(str.charAt(i)+"");
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