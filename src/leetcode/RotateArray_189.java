package leetcode;

import java.util.Arrays;

public class RotateArray_189 {


    public static void main(String[] args) {


        int [] arr1={1,2,3,4,5,6,7};
        int [] arr2={-1,-100,3,99};

        rotate(arr1,3);
        System.out.println(Arrays.toString(arr1));
    }


    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // In case k is greater than the length of the array
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}



/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



        Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */