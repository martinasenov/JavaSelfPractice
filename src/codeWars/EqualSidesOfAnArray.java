package codeWars;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {

        int leftSum=0;
        int totalSum=0;

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Iterate through the array to find the even index
        for (int i = 0; i < arr.length; i++) {
            // Subtract the current element from total sum to get the right sum
            totalSum -= arr[i];

            // Check if left sum is equal to the right sum
            if (leftSum == totalSum) {
                return i;
            }

            // Update the left sum to include the current element
            leftSum += arr[i];
        }

        // If no index found where the sums are equal, return -1
        return -1;
    }



    public static void main(String[] args) {


        int [] array={1,2,3,4,3,2,1};
        int [] array2={1,100,50,-51,1,1};

        System.out.println(findEvenIndex(array));
        System.out.println(findEvenIndex(array2));


    }


}


/*

You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the
integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.

For example:
Let's say you are given the array {1,2,3,4,3,2,1}:
Your function will return the index 3, because at the 3rd position of the array,
the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

Let's look at another one.
You are given the array {1,100,50,-51,1,1}:
Your function will return the index 1, because at the 1st position of the array,
the sum of left side of the index ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.

Last one:
You are given the array {20,10,-80,10,10,15,35}
At index 0 the left side is {}
The right side is {10,-80,10,10,15,35}
They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
Index 0 is the place where the left side and right side are equal.
 */