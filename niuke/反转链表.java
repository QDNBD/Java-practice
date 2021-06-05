/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.*;
public class Solution {
    public ListNode ReverseList(ListNode head) {
//         if(head == null) {
//             return head;
//         }
//         Stack<Integer> stack = new Stack<Integer>();
//         ListNode cur = head;
//         while(cur != null) {
//             stack.push(cur.val);
//             cur = cur.next;
//         }
//         cur = head;
//         while(cur != null) {
//             cur.val = stack.pop();
//             cur = cur.next;
//         }
//         return head;
        
        
//         if(head == null || head.next == null) {
//             return head;
//         }
//         ListNode left = head;
//         ListNode mid = left.next;
//         ListNode right = mid.next;
//         while(right != null) {
//             mid.next = left;
//             left = mid;
//             mid = right;
//             right = right.next;
//         }
//         mid.next = left;
//         head.next = null;
//         head = mid;
//         return head;
        
        
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        while(head != null) {
            ListNode cur = head;
            head = head.next;
            cur.next = newHead;
            newHead = cur;
        }
        head = newHead;
        return head;
    }
} 