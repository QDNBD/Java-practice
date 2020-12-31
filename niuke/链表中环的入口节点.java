/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/

//���ÿ���ָ�룬��������ͷ��������ָ��ÿ������������ָ��һ����һ����
//�����л���һ�������ڻ���ĳ�㡣
//����������ָ��ֱ�������������ͷ���������߶���Ϊÿ����һ�������������ڻ����
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead;
        ListNode low = pHead;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
            if(fast == low) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        low = pHead;
        while(fast != low) {
            fast = fast.next;
            low = low.next;
        }
        return low;
    }
}