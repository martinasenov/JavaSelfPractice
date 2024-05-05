package codeWars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        String nums=String.valueOf(num);

        List<Integer> intArray = new ArrayList<>();

        for (int i=0; i <nums.length() ; i++){
            intArray.add(Integer.parseInt(nums.charAt(i)+""));
        }

        Collections.sort(intArray);
        Collections.reverse(intArray);
        nums="";

        for (int i = 0; i < intArray.size(); i++) {

            nums+=intArray.get(i);

        }


        return Integer.parseInt(nums);
    }



    public static int sortDesc2(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }


    public static void main(String[] args) {


        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
    }



}


/*

Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.


Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321


 */