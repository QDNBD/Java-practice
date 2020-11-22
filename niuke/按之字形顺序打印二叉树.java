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
        int dir = 1;//1：代表left->right式入栈. 2: 代表right->left式入栈
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.empty()){
            int size = stack.size();
            for(int i = 0; i < size;i++) {//清空本层所有节点，将下层节点按照要求入栈，栈具有天然的逆序的能力
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
            //本层遍历完毕，入结果集
            result.add(new ArrayList(list));
            list.clear();
            //将所有节点入栈，进行逆序
            while(!queue.isEmpty()) {
                stack.add(queue.poll());
            }
            dir = (dir == 1) ? 2 : 1;
        }
        return result;
    }

}