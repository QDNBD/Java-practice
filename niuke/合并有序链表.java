import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param l1 ListNode类 
     * @param l2 ListNode类 
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }else if(l2.val < l1.val) {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        while(l1 != null) {
            cur.next = l1;
            l1 = l1.next;
            cur = cur.next;
        }
        while(l2 != null) {
            cur.next = l2;
            l2 = l2.next;
            cur = cur.next;
        }
        return res.next;
    }
}