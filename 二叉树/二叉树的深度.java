public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftDepth = 0;
        int rightDepth = 0;
        leftDepth = 1 + TreeDepth(root.left);
        rightDepth = 1 + TreeDepth(root.right);
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}