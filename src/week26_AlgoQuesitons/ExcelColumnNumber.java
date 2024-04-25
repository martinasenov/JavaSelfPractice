package week26_AlgoQuesitons;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExcelColumnNumber {


    public static int forLoopFromBeginning(String title) {
        int result = 0;
        int p = title.length() - 1;
        for (char c : title.toCharArray()) {
            result += (c - 'A' + 1) * Math.pow(26, p--);
        }
        return result;
    }


    public static void main(String[] args) {


        System.out.println(forLoopFromBeginning("A"));
        System.out.println(forLoopFromBeginning("AB"));
        System.out.println(forLoopFromBeginning("AC"));


    }



}



/*

Question-2 Excel Sheet Column Number Given a string columnTitle that represents the column title as appears in an Excel sheet,
return its corresponding column number.
For example: A -> 1
B -> 2
C -> 3 ...
Z -> 26
AA -> 27
AB -> 28 ...

Example 1: Input: columnTitle = "A"
Output: 1

Example 2: Input: columnTitle = "AB"
Output: 28

Example 3: Input: columnTitle = "ZY"

Output: 701 Constraints: 1 <= columnTitle.length <= 7 columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].


 */
