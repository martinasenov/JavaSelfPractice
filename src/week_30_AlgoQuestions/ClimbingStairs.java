package week_30_AlgoQuestions;

public class ClimbingStairs {

    public static void main(String[] args) {

        int maxTerms = 10;
        int previous = 0;
        int current = 1;

        System.out.print("Fibonacci Sequence up to " + maxTerms + " terms: ");

        for (int i = 1; i <= maxTerms; ++i) {
            System.out.print(previous + " ");

            // Compute the next term
            int next = previous + current;

            previous = current;
            current = next;
        }


        System.out.println(numberOfWaysToClimb(10));

    }



    public static int numberOfWaysToClimb(int stepNumber) {
        if (stepNumber == 0) {
            return 1; // There is one way to do nothing (i.e., not to climb any stair)
        } else if (stepNumber == 1) {
            return 1; // There is only one way to climb one stair
        }

        int[] ways = new int[stepNumber + 1];
        ways[0] = 1; // Base case: 1 way to stay at the ground
        ways[1] = 1; // Base case: 1 way to climb to the first stair

        for (int i = 2; i <= stepNumber; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[stepNumber];
    }

}


/*
Question-1 Climbing Stairs
Simba has a number of staircases in his house, and he likes to climb each staircase 1 or 2 steps at a time.
It takes n steps to reach the top. In how many distinct ways can he climb to the top?


Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps


Example 2:
Input: n = 3 Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:
•
1 <= n <= 45
Follow-up: What if he climbs each staircase 1, 2 or 3 steps at a time?
Please, try to test your solution via JUnit and also test your solution here:
https://leetcode.com/problems/climbing-stairs/
Hint: Think about Fibonacci numbers. How would you find the n’th number in Fibonacci series?
 */