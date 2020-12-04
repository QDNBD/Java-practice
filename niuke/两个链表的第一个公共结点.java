/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public int LengthHelper(ListNode pHead) {
        int count = 0;
        while(pHead != null) {
            count++;
            pHead = pHead.next;
        }
        return count;
    }
    
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//         if(pHead1 == null || pHead2 == null) {
//             return null;
//         }
//         ListNode p1 = pHead1;
//         ListNode p2 = pHead2;
//         while(p1 != p2) {
//             p1 = p1.next;
//             p2 = p2.next;
//             if(p1 != p2) {
//                 if(p1 == null) {
//                     p1 = pHead2;
//                 }
//                 if(p2 == null) {
//                     p2 = pHead1;
//                 }
//             }
//         }
//         return p1;
        
        
        if(pHead1 == null || pHead2 == null) {
             return null;
         }
        int lens1 = LengthHelper(pHead1);
        int lens2 = LengthHelper(pHead2);
        int num = Math.abs(lens1 - lens2);
        if(lens1 > lens2) {
            while(num > 0) {
                pHead1 = pHead1.next;
                num--;
            }
        }else {
            while(num > 0) {
                pHead2 = pHead2.next;
                num--;
            }
        }
        while(pHead2 != null && pHead1 != null) {
            if(pHead1 == pHead2) {
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        } 
        
        return null;
        
        
    }
}