/*
*解题思路：
*1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
*2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
*3、拆分链表，将链表拆分为原链表和复制后的链表
*/

/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) {
            return null;
        }
        RandomListNode currNode = pHead;
        //1.复制每个节点，如复制节点A得到A1放在A节点后面
        while(currNode != null) {
            RandomListNode cloneNode = new RandomListNode(currNode.label);
            RandomListNode nextNode = currNode.next;
            currNode.next = cloneNode;
            cloneNode.next = nextNode;
            currNode = nextNode;
        }
        currNode = pHead;
        //2.重新遍历链表，复制老节点的随机指针给新节点，如A1.random = A.random.next
        while(currNode != null) {
            currNode.next.random = currNode.random == null ? null : currNode.random.next;
            currNode = currNode.next.next;
        }
        //3.拆分链表，将链表拆分为原链表和复制后的链表
        currNode = pHead;
        RandomListNode newHead = pHead.next;
        while(currNode != null) {
            RandomListNode cloneNode = currNode.next;
            currNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            currNode = currNode.next;
        }
        return newHead;
    }
}