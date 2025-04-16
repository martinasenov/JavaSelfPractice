package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {


    public static void main(String[] args) {

        int [] arr1={3,2,3};
        int [] arr2={2,2,1,1,1,2,2};
        int [] arr3={1,2,3,4,5,6,7,8,9,9,2,4,5,17,17,17};


        System.out.println(majorityElement(arr1));
        System.out.println(majorityElement(arr2));
        System.out.println(majorityElement(arr3));
        System.out.println(majorityElement2(arr3));


    }




    public static int majorityElement(int [] array){

        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int count=0;

            for (int j = 0; j < array.length; j++) {

                if (array[i]==array[j]){

                    count++;
                }
            }
            result=Math.max(result,count);

            map.put(result,array[i]);
        }
        return map.get(result);
    }


    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

}


/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */