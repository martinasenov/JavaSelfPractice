package week23_AlgoQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MoveZeros {

    public static void main(String[] args) {


        int [] nums ={0,1,0,3,12};


        System.out.println(Arrays.toString(moveZeros(nums)));


    }

    public static int [] moveZeros(int [] nums){

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array can not be null or empty");
        }
        int insertPos = 0; // This will keep track of the position where we need to insert the next non-zero number.
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num; // Place the non-zero number at the 'insertPos' and then increase 'insertPos'.
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0; // Fill the rest of the array with zeros.
        }

        return nums;
    }
}


/*
Question-1 Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0, 1, 0, 3, 12] Output: [1, 3, 12, 0, 0]
Example 2:
Input: nums = [0] Output: [0]
Constraints:
•
1 <= nums.length <= 104
•
-231 <= nums[i] <= 231 - 1
Follow up: Could you minimize the total number of operations done?
 */