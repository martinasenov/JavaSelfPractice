package week12_AlgoQuestions;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {

        System.out.println();


        String[] array = {"arrayList", "NestedLoop", "overloading", "java", "inheritance", "encapsulation", "Exception"};
        reverseArrayInPlace(array);

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArrayInPlace(array2);


        int[] array3 = {1};
        reverseArrayInPlace(array3);


        String[] array4 = {"arrayList"};
        reverseArrayInPlace(array4);


    }


    public static void reverseArrayInPlace(String[] array) {

        String temp = "";

        for (int i = array.length - 1; i >= 0; i--) {

            temp += array[i] + " ";
        }

        for (int i = 0; i < array.length; i++) {

            array[i] = temp.substring(0, temp.indexOf(" "));

            temp = temp.substring(temp.indexOf(" ") + 1);
        }

        System.out.println(Arrays.toString(array));
    }


    public static void reverseArrayInPlace(int[] array) {
        String temp = "";


        for (int i = array.length - 1; i >= 0; i--) {
            temp += array[i] + " ";
        }

        for (int i = 0; i < array.length; i++) {

            array[i] = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));

            temp = temp.substring(temp.indexOf(" ") + 1);
        }

        System.out.println(Arrays.toString(array));

    }


    public static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Swap elements from the outermost towards the center
        while (left < right) {
            // Swap the elements at left and right positions
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move the pointers closer to the center
            left++;
            right--;
        }


    }

}

/*

Question-1 Reverse Array in Place
Write a method that reverses an array of integers in place.
The reversion should be performed directly on the original array without using any additional arrays.
(Hint: not necessary to have a return type method since the modification is done in place and a swap algorithm might be a good approach)

Example 1 Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]

Example 2
Input: [150]
Output: [150]

Constraints The given array are not empty.
 1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6

 */