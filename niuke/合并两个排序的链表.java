/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
//         if(list1 == null) {
//             return list2;
//         }
//         if(list2 == null) {
//             return list1;
//         }
//         ListNode cur1 = list1;
//         ListNode cur2 = list2;
//         ListNode pHead = new ListNode(-1);
//         ListNode pCur = pHead;
//         while(cur1 != null && cur2 != null) {
//             if(cur1.val <= cur2.val) {
//                 pCur.next = cur1;
//                 cur1 = cur1.next;
//             }else {
//                 pCur.next = cur2;
//                 cur2 = cur2.next;
//             }
//             pCur = pCur.next;
//         }
//         if(cur1 != null) {
//             pCur.next = cur1;
//         }else {
//             pCur.next = cur2;
//         }
//         return pHead.next;
        
        
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode newHead = null;
        ListNode cur = null;
        while(list1 != null && list2 != null) {
            ListNode p = list1.val > list2.val ? list2 : list1;
            if(p == list1) {
                list1 = list1.next;
            }else{
                list2 = list2.next;
            }
            if(newHead == null) {
                newHead = p;
                cur = p;
            }else {
                cur.next = p;
                cur = p;
            }
            
        }
        if(list1 != null) {
            cur.next = list1;
        }else {
            cur.next = list2;
        }
        return newHead;
        
    }
}