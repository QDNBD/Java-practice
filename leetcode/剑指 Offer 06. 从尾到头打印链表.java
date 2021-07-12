/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        // Stack<Integer> stack = new Stack<>();
        // int len = 0;
        // while(head != null) {
        //     stack.add(head.val);
        //     head = head.next;
        //     len++;
        // }
        // int[] res = new int[len];
        // for(int i = 0; i < res.length; i++) {
        //         if(!stack.isEmpty()) {
        //         res[i] = stack.pop();
        //     }
        // }
        // return res;

        ListNode cur = head;
        int len = 0;
        while(cur != null) {
            len++;
            cur = cur.next;
        }
        int[] res = new int[len];
        while(head != null) {
            res[--len] = head.val;
            head = head.next;
        }
        return res;
    }
}