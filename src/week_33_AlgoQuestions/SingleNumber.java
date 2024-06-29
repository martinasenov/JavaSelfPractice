package week_33_AlgoQuestions;

import java.util.Arrays;

public class SingleNumber {


    public static void main(String[] args) {

       int[] nums = {4,1,2,1,2,4,7,8,8,9,9};
       int[] nums1={1};

        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums1));

    }


    public static int singleNumber(int [] nums){

        if (nums.length==1){
            return nums[0];
        }
        int result=0;
        for (int i = 0; i < nums.length; i++) {

            int count=0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count<2){

              return nums[i];
            }
        }
        return result;
    }



    public int singleNumber2(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }
        return result;
    }



}


/*

Question-1 Single Number Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1:
Input: nums = [2,2,1] Output: 1


Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1] Output: 1

Constraints: 1 <= nums.length <= 3 * 104 -3 * 104 <= nums[i] <= 3 * 104

Each element in the array appears twice except for one element which appears only once. Follow-up question: Can you implement a solution with a linear runtime complexity and use only constant extra space?
Please, try to test your solution via JUnit and also test your solution here: https://leetcode.com/problems/single-number/

 */