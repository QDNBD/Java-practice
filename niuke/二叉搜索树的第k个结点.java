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
    //BST本身就是有序的，中序遍历即是升序
//要求第k小，即中序遍历时到达第k个元素(二叉搜索树，不存在两个相同的节点值)
//此处，我们不使用递归，我们采用循环中序遍历的方式
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
                //访问当前节点，中序
                k--;
                if(k == 0) {
                    return node;//找到当前第k小节点
                }
                node = node.right;
            }
            
        }while(node != null || !stack.isEmpty());//node有可能为空，但是只要stack不为空，就要继续pop求下一个。有没有可能st为空？有可能，这个时候就要检测node，如果node不为空，就要整体检测右子树
//走到这里，就说明没有找到
        return null;
    }


}