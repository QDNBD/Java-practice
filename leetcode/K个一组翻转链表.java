/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = new ListNode(0);
        ListNode pre = newHead;
        ListNode cur = head;
        newHead.next = head;
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        head = newHead.next;
        for(int i = 0; i < len/k; i++) {
            for(int j = 0; j < k - 1; j++) {
                ListNode temp = cur.next;
                cur.next = temp.next;
                temp.next = pre.next;
                pre.next = temp;
            }
            pre = cur;
            cur = pre.next;
        }
        return newHead.next;
    }
}