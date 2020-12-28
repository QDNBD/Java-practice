/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//采用双指针法
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(k > 0) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
            k--;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}