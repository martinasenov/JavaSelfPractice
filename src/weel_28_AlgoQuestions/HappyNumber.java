package weel_28_AlgoQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class HappyNumber {

    public static boolean happyNumber(int num){

        String stringValue= String.valueOf(num);
        int checkNum;

        do {
            checkNum=0;
            char [] numsArray=stringValue.toCharArray();

            for (int i = 0; i < numsArray.length; i++) {
                int a= Integer.parseInt(String.valueOf(numsArray[i]));
                checkNum+= a * a;
            }

            if (checkNum!=1) {
                stringValue = String.valueOf(checkNum);
            }else {
                return true;
            }


        }while (checkNum!=1);


        return false;
    }





    public static void main(String[] args) {


       LinkedList<Integer> numbers=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));


        numbers.removeIf(n->n==6);

        System.out.println(numbers);


        //System.out.println(happyNumber(20));
    }


}


/*


Question-2 Happy Number

Write a function that returns true if a number is a happy number, and false if it is an unhappy number.
A happy number is a number defined by the following process:
1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 3.
Those numbers for which this process ends in 1 are happy.

Example 1:
Input: n = 19
Output: True


Explanation:
19 is Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.

 Example 2: Input: n = 20 Output: False

 */