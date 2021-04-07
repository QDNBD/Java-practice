/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/

//1.������Ϊ�գ��򷵻ؿգ�
//2.�ڵ��Һ��Ӵ��ڣ�������һ��ָ��Ӹýڵ���Һ��ӳ�����
//һֱ����ָ�����ӽ���ָ���ҵ���Ҷ�ӽڵ㼴Ϊ��һ���ڵ㣻
//3.�ڵ㲻�Ǹ��ڵ㡣����ýڵ����丸�ڵ�����ӣ��򷵻ظ��ڵ㣻
//����������ϱ����丸�ڵ�ĸ��ڵ㣬�ظ�֮ǰ���жϣ����ؽ����
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null) {
            return null;
        }
        if(pNode.right != null) {
            pNode = pNode.right;
            while(pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        while(pNode.next != null) {
            TreeLinkNode pRoot = pNode.next;
            if(pRoot.left == pNode) {
                return pRoot;
            }
            pNode = pNode.next;
        }
        return null;
    }
}