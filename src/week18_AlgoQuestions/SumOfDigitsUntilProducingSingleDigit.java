package week18_AlgoQuestions;

public class SumOfDigitsUntilProducingSingleDigit {

    public static void main(String[] args) {


        System.out.println(sumOfDigits2(16));
        System.out.println(sumOfDigits2(942));
        System.out.println(sumOfDigits2(132189));
        System.out.println(sumOfDigits2(493193));



    }

    public static int sumOfDigits2(int number){

        int result=0;

        String str=String.valueOf(number);

        do {
            result=0;

            for (int i = 0; i < str.length(); i++) {
                result+=Integer.parseInt(str.charAt(i)+"");
            }

           str=(String.valueOf(result));

        }while (str.length()>1);


        return result;
    }
}

/*
Question-2 Sum of Digits Until Producing Single Digit

Digital root is the recursive sum of all the digits in a number.

Given n, write a method that returns the sum of the digits of n.

If that value has more than one digit, continue reducing in this way until a single-digit number is produced.

The input will be a non-negative integer.


Examples
16 --> 1 + 6 = 7
942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2



 */