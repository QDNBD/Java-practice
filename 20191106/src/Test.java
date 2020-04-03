public class Test {
//将两个有序链表合并为一个新的有序链表并返回。
// 新链表是通过拼接给定的两个链表的所有节点组成的
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if (headA == null) {
            tmp.next = headB;
        }else  {
            tmp.next = headA;
        }
        return newHead.next;
    }

    public static  ListNode getIntersectionNode(ListNode headA,ListNode headB) {
        if (headA == null || headB == null) {
            return null;
      }
        ListNode pL = headA;
        ListNode pS = headB;

        int lenA = 0;
        int lenB = 0;

        //算长度
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;

        int len = lenA - lenB;
        if (len < 0) {
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        }

        //pL先走len步
        while ( len > 0) {
            pL = pL.next;
            len--;
        }
        //一人一步走
        while (pL != null && pS != null && pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        if (pL == pS && pL == null) {
            return null;
        }
        return pL;
    }

    public static void createCut(ListNode headA,ListNode headB) {
        headA.next.next = headB.next;

    }


    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        MySingleList mySingleList1 = new MySingleList();
//        mySingleList.addFirst(2);
//        mySingleList.addFirst(1);
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
        mySingleList1.addLast(0);
        mySingleList1.addLast(4);
        mySingleList1.addLast(5);
        mySingleList1.addLast(6);
        mySingleList1.addLast(9);
        mySingleList.diaplay();
        mySingleList1.diaplay();

        createCut(mySingleList.head,mySingleList1.head);
        ListNode node = getIntersectionNode(mySingleList.head,mySingleList1.head);
        System.out.println(node.data);
       // mySingleList.diaplay2( mergeTwoLists(mySingleList.head,mySingleList1.head));
//        mySingleList.addIndex(0,99);
//        mySingleList.addIndex(0,4);
//        mySingleList.addIndex(3,88);
//        mySingleList.diaplay();
//        System.out.println(mySingleList.contains(99));
//        System.out.println(mySingleList.contains(66));
//        System.out.println(mySingleList.contains(1));
//        System.out.println(mySingleList.contains(22));

//        mySingleList.remove(2);
//        mySingleList.remove(3);
//        mySingleList.diaplay();
//        mySingleList.removeAllkey(4);
//        mySingleList.diaplay();
//        mySingleList.diaplay2(mySingleList.reverseList());


//          mySingleList.diaplay2(mySingleList.reverseList1());
//        mySingleList.diaplay2(mySingleList.partition(5));
//        mySingleList.diaplay2(mySingleList.deleteDuplication());
//        boolean fig = mySingleList.chkPalindrome();
////        System.out.println(fig);
       // System.out.println(mySingleList.detectCycle().data);

      //  mySingleList.diaplay2( mySingleList.reverseList2());

    }


}
