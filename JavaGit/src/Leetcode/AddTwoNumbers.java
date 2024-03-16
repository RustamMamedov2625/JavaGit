package Leetcode;
//https://leetcode.com/problems/add-two-numbers/description/

public class AddTwoNumbers {
    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // —оздаем фиктивный узел, который будет началом результирующего списка
        ListNode result = new ListNode(0);
        // —оздаем указатель на текущий узел результирующего списка
        ListNode curr = result;
        // ѕеременна€ дл€ хранени€ остатка от сложени€ двух разр€дов
        int remainingUnit = 0;

        // ѕроходимс€ по всем узлам обоих списков
        while(l1 != null || l2 != null){
            // ѕолучаем значение текущего узла в первом списке, если он есть, иначе 0
            int l1Val = (l1 != null) ? l1.val : 0;
            // ѕолучаем значение текущего узла во втором списке, если он есть, иначе 0
            int l2Val = (l2 != null) ? l2.val : 0;
            // —кладываем значени€ узлов и остаток от предыдущего сложени€
            int sum = remainingUnit + l1Val + l2Val;
            // ¬ычисл€ем новый остаток от сложени€ двух разр€дов
            remainingUnit = sum / 10;
            // —оздаем новый узел в результирующем списке с остатком от делени€ суммы на 10
            curr.next = new ListNode(sum % 10);
            // ѕеремещаем указатель на следующий узел в результирующем списке
            curr = curr.next;
            // ѕеремещаем указатель на следующий узел в первом списке, если он есть
            if(l1 != null) l1 = l1.next;
            // ѕеремещаем указатель на следующий узел во втором списке, если он есть
            if(l2 != null) l2 = l2.next;
        }
        // ≈сли после прохода по всем узлам осталс€ остаток, добавл€ем его в конец результирующего списка
        if(remainingUnit > 0)
            curr.next = new ListNode(remainingUnit);
        // ¬озвращаем начало результирующего списка (пропуска€ фиктивный узел)
        return result.next;
    }
}

/*You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
 Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.*/









/* Runtime Error
32 / 1568 testcases passed
java.lang.NumberFormatException: For input string: "9999999991"
  at line 67, java.base/java.lang.NumberFormatException.forInputString
  at line 661, java.base/java.lang.Integer.parseInt
  at line 777, java.base/java.lang.Integer.parseInt
  at line 25, Solution.addTwoNumbers
  at line 56, __DriverSolution__.__helper__
  at line 89, __Driver__.main
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String sumL1 = "", sumL2 = "";
        ListNode result = new ListNode(0), curr = result;
        while (l1 != null){
            sumL1 = l1.val + sumL1;
            l1 = l1.next;
        }
        while(l2 != null){
            sumL2 = l2.val + sumL2;
            l2 = l2.next;
        }

        long sumL1Int = Long.parseLong(sumL1);
        long sumL2Int = Long.parseLong(sumL2);
        long sum = sumL1Int + sumL2Int;
        if(sum == 0)
            curr.next = new ListNode(0);
        while(sum / 10 != 0){
            curr.next = new ListNode((int) (sum % 10));
            sum /= 10;
            curr = curr.next;
        }

        return result.next;
    }*/

