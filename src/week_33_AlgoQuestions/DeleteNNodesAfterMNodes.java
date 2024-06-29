package week_33_AlgoQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DeleteNNodesAfterMNodes {

    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13));

        int m=2, n=3;

        System.out.println(list);

        System.out.println(deleteNNodesAfterMNodes(list, m, n));

    }


    public static LinkedList<Integer> deleteNNodesAfterMNodes(LinkedList<Integer> list,int m, int n){

        if (list == null || list.isEmpty() || m <= 0 || n <= 0) {
            return list;
        }

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            // Keep the first m nodes
            for (int i = 0; i < m && iterator.hasNext(); i++) {
                iterator.next();
            }

            // Remove the next n nodes
            for (int i = 0; i < n && iterator.hasNext(); i++) {
                iterator.next();
                iterator.remove();
            }
        }

        return list;
    }

}

/*
Question-2 Delete N Nodes After M Nodes
You are given the head of a linked list and two integers m and n. Traverse the linked list and remove some nodes in the following way:
•
Start with the head as the current node.
•
Keep the first m nodes starting with the current node.
•
Remove the next n nodes.
•
Keep repeating steps 2 and 3 until you reach the end of the list.
Return the head of the modified list after removing the mentioned nodes.

Constraints:
• The number of nodes in the list is in the range [1,10^4]
1 <= Node. val <= 10^6
1 <= m, n <= 1000


 */
