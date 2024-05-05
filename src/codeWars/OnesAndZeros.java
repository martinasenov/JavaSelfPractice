package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {



    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code

        int num=0;
        int pwr=0;

        for (int i = binary.size()-1; i >= 0; i--) {

            num+=(int) (binary.get(i) * Math.pow(2,pwr));

            pwr++;
        }

        return num;

    }



    public static void main(String[] args) {

           List<Integer> binary1=new ArrayList<>(Arrays.asList(0, 0, 0, 1));
           List<Integer> binary2=new ArrayList<>(Arrays.asList(0, 1, 0, 1));
           List<Integer> binary3=new ArrayList<>(Arrays.asList(1, 0, 0, 1));
           List<Integer> binary4=new ArrayList<>(Arrays.asList(1, 1, 1, 1));



        System.out.println(ConvertBinaryArrayToInt(binary1));
        System.out.println(ConvertBinaryArrayToInt(binary2));
        System.out.println(ConvertBinaryArrayToInt(binary3));
        System.out.println(ConvertBinaryArrayToInt(binary4));


    }






}
    /*

     Given an array of ones and zeroes, convert the equivalent binary value to an integer.

     Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.


      Testing: [0, 0, 0, 1] ==> 1
      Testing: [0, 0, 1, 0] ==> 2
      Testing: [0, 1, 0, 1] ==> 5
      Testing: [1, 0, 0, 1] ==> 9
      Testing: [0, 0, 1, 0] ==> 2
      Testing: [0, 1, 1, 0] ==> 6
      Testing: [1, 1, 1, 1] ==> 15
      Testing: [1, 0, 1, 1] ==> 11

     */
