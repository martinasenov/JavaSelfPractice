package codeWars;

import java.util.Arrays;

public class IsNarcissistic {

    public static boolean isNarcissistic(int number) {

        int checkNum=0;

        String stringValue=String.valueOf(number);

        for (int i = 0; i < stringValue.length(); i++) {
            checkNum+=(int) Math.pow(Integer.parseInt(stringValue.charAt(i)+""),stringValue.length());
        }

        if (number==checkNum){
            return true;
        }

        return false;
    }


    public static boolean isNarcissistic2(int number) {
        int length = String.valueOf(number).length();
        return number == Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(m -> Math.pow(m, length))
                .sum();
    }


    public static void main(String[] args) {

        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1652));

    }




}


/*
A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits,
each raised to the power of the number of digits in a given base.
In this Kata, we will restrict ourselves to decimal (base 10).

For example, take 153 (3 digits), which is narcissistic:
 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153


 and 1652 (4 digits), which isn't:
  1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938

The Challenge:

Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic number in base 10.

 */