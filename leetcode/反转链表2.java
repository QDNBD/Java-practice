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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode per = newHead;
        ListNode cur = head;
        for(int i = 1; i < left; i++) {
            per = per.next;
        }
        cur = per.next;//此时cur 为left节点
        for(int i = left; i < right; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = per.next;
            per.next = temp;
        }
        return newHead.next;
    }
}