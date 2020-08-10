/**
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
    public void Mirror(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            return;
        }
        TreeNode pTemp = root.left;
        root.left = root.right;
        root.right = pTemp;
        if(root.left != null) {
            Mirror(root.left);
        }
        if(root.right != null) {
            Mirror(root.right);
        }
    }
}

import java.util.*;
public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(node.left != null || node.right != null) {
                TreeNode nodeLeft = node.left;
                TreeNode nodeRight = node.right;
                node.left = nodeRight;
                node.right = nodeLeft;
            }
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
    }
}