import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        int add = 0;
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        ListNode acur = a;
        ListNode bcur = b;
        while(acur != null || bcur != null) {
            if(acur != null && bcur != null) {
                cur.next = new ListNode((acur.val + bcur.val + add) % 10);
                add = (acur.val + bcur.val + add) / 10;
                acur = acur.next;
                bcur = bcur.next;
            }else if(acur != null) {
                cur.next = new ListNode((acur.val + add) % 10);
                add = (acur.val + add) / 10;
                acur = acur.next;
            }else if(bcur != null) {
                cur.next = new ListNode((bcur.val + add) % 10);
                add = (bcur.val + add) / 10;
                bcur = bcur.next;
            }
            cur = cur.next;
        }
        if(add > 0) {
            cur.next = new ListNode(add);
            cur = cur.next;
        }
        return newHead.next;
    }
}