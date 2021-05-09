/*
*����˼·��
*1��������������ÿ����㣬�縴�ƽ��A�õ�A1�������A1�嵽���A���棻
*2�����±������������Ͻ������ָ����½�㣬��A1.random = A.random.next;
*3�����������������Ϊԭ����͸��ƺ������
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
        //1.����ÿ���ڵ㣬�縴�ƽڵ�A�õ�A1����A�ڵ����
        while(currNode != null) {
            RandomListNode cloneNode = new RandomListNode(currNode.label);
            RandomListNode nextNode = currNode.next;
            currNode.next = cloneNode;
            cloneNode.next = nextNode;
            currNode = nextNode;
        }
        currNode = pHead;
        //2.���±������������Ͻڵ�����ָ����½ڵ㣬��A1.random = A.random.next
        while(currNode != null) {
            currNode.next.random = currNode.random == null ? null : currNode.random.next;
            currNode = currNode.next.next;
        }
        //3.���������������Ϊԭ����͸��ƺ������
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