package codeWars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareDigit {


    public static void main(String[] args) {


        System.out.println(squareDigits(9119));




    }




        public static int squareDigitsWithStream(int n) {

            return Integer.parseInt(String.valueOf(n)
                    .chars()
                    .map(i -> Integer.parseInt(String.valueOf((char) i)))
                    .map(i -> i * i)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("")));
        }









    public static int squareDigits(int n) {

        StringBuilder result= new StringBuilder();
        String num=String.valueOf(n);

        for (int i = 0; i < num.length(); i++) {

            int integerNum = Integer.parseInt((num.charAt(i) + ""));
            integerNum= integerNum * integerNum;

            result.append(String.valueOf(integerNum));


        }

        return Integer.parseInt(String.valueOf(result));
    }
}


/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.
 */