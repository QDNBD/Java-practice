/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxLen = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxLen;
    }
    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftLen = depth(root.left);
        int rightLen = depth(root.right);
        maxLen = Math.max(leftLen + rightLen,maxLen);
        return Math.max(leftLen,rightLen) + 1;
    }
}