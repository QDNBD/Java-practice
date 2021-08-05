143. 重排链表
给定一个单链表 L 的头节点 head ，单链表 L 表示为：

 L0 → L1 → … → Ln-1 → Ln 
请将其重新排列后变为：

L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …

不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 

示例 1:



输入: head = [1,2,3,4]
输出: [1,4,2,3]
示例 2:



输入: head = [1,2,3,4,5]
输出: [1,5,2,4,3]
 

提示：

链表的长度范围为 [1, 5 * 104]
1 <= node.val <= 1000

class Solution {
    public void reorderList(ListNode head) {
        LinkedList<ListNode> queue = new LinkedList<>();
        ListNode cur = head;
        while(cur != null) {
            queue.addLast(cur);
            cur = cur.next;
        }
        while(!queue.isEmpty()) {
            if(cur == null) {
                cur = queue.pollFirst();
            }else {
                cur.next = queue.pollFirst();
                cur = cur.next;
            }
            cur.next = queue.pollLast();
            cur = cur.next;
        }
        if(cur != null) {
            cur.next = null;
        }
    }
}

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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return ;
        }
        //找到链表中间节点
        ListNode mid = findMidNode(head);

        //将链表分成两个链表
        ListNode head1 = head;
        ListNode head2 = mid.next;
        mid.next = null;

        //将第二个链表反转
        head2 = revereList(head2);

        //合并两个链表
        mergeList(head1, head2);
    }

    // 返回链表的中间节点
    private ListNode findMidNode(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 反转链表，并返回新的头节点
    private ListNode revereList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    // 合并两个链表
    private void mergeList(ListNode head1, ListNode head2) {
        ListNode t1 = null, t2 = null;
        
        while (head1 != null && head2 != null) {
            // 防止链表断开
            t1 = head1.next;
            t2 = head2.next;

            head1.next = head2;
            head2.next = t1;

            head1 = t1;
            head2 = t2;
        }
    }

}