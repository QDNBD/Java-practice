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
import java.util.Stack;

public class Solution {
    //BST�����������ģ����������������
//Ҫ���kС�����������ʱ�����k��Ԫ��(������������������������ͬ�Ľڵ�ֵ)
//�˴������ǲ�ʹ�õݹ飬���ǲ���ѭ����������ķ�ʽ
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null || k <= 0) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = pRoot;
        do{
            while(node != null) {
                stack.add(node);
                node = node.left;
            }
            if(!stack.isEmpty()) {
                node = stack.pop();
                //���ʵ�ǰ�ڵ㣬����
                k--;
                if(k == 0) {
                    return node;//�ҵ���ǰ��kС�ڵ�
                }
                node = node.right;
            }
            
        }while(node != null || !stack.isEmpty());//node�п���Ϊ�գ�����ֻҪstack��Ϊ�գ���Ҫ����pop����һ������û�п���stΪ�գ��п��ܣ����ʱ���Ҫ���node�����node��Ϊ�գ���Ҫ������������
//�ߵ������˵��û���ҵ�
        return null;
    }


}