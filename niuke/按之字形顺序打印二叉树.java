import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        if(pRoot == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(pRoot);
        int dir = 1;//1������left->rightʽ��ջ. 2: ����right->leftʽ��ջ
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.empty()){
            int size = stack.size();
            for(int i = 0; i < size;i++) {//��ձ������нڵ㣬���²�ڵ㰴��Ҫ����ջ��ջ������Ȼ�����������
                TreeNode cur = stack.pop();
                list.add(cur.val);
                TreeNode first = (dir == 1) ? cur.left : cur.right;
                TreeNode second = (dir == 1) ? cur.right : cur.left;
                if(first != null) {
                    queue.offer(first);
                }
                if(second != null) {
                    queue.offer(second);
                }
            }
            //���������ϣ�������
            result.add(new ArrayList(list));
            list.clear();
            //�����нڵ���ջ����������
            while(!queue.isEmpty()) {
                stack.add(queue.poll());
            }
            dir = (dir == 1) ? 2 : 1;
        }
        return result;
    }

}