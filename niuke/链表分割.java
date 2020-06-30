import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        } 
        ListNode cur = pHead;
//����2�������˴�Shead Bhead����ͷָ��
        ListNode Shead = new ListNode(-1);
        ListNode Bhead = new ListNode(-1);
        ListNode Stmp = Shead;
        ListNode Btmp = Bhead;
        while (cur != null) {
            if (cur.val < x) {//ֵС��x�Ľڵ�
            Stmp.next = new ListNode(cur.val);
            Stmp = Stmp.next;
            } else {//ֵ���ڵ���x�Ľڵ�
                Btmp.next = new ListNode(cur.val);
                Btmp = Btmp.next;
            } 
            cur = cur.next;
        } //��1�������ͷ
        cur = Shead;
        //ѭ�������ҵ���1�������β
        while (cur.next != null && cur.next.val != -1) {
            cur = cur.next;
        } //cur��nextָ���2���ڵ��next(��ͷ�ڵ�)
        //�൱�ڽ���1������͵�2����������
        cur.next = Bhead.next;
        return Shead.next;//���ص�1���ڵ�next(����ͷ�ڵ�)
    }
}