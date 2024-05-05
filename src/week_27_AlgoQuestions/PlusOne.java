package week_27_AlgoQuestions;

import java.util.Arrays;

public class PlusOne {

    public static int [] plusOne(int [] numbers){

        for (int i = numbers.length - 1; i >= 0; i--) {

         if (numbers[i]<9){
             numbers[i]=numbers[i]+1;
             return numbers;
         }

         numbers[i]=0;

        }

        int[] nums =new int[numbers.length+1];
        nums[0]=1;

       return nums;
    }


    public static void main(String[] args) {

        int [] nums ={9,7,9,8};
        int [] nums2 ={9,9,9,9};
        int [] nums3 ={9};

        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println(Arrays.toString(plusOne(nums2)));
        System.out.println(Arrays.toString(plusOne(nums3)));


    }

}
