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
    public boolean isSymmetricChild(TreeNode leftroot,TreeNode rightroot) {
        if(leftroot == null && rightroot != null || leftroot != null && rightroot == null) {
            return false;
        }
        if(leftroot == null && rightroot == null) {
            return true;
        }
        
        return leftroot.val == rightroot.val
        && isSymmetricChild(leftroot.left,rightroot.right)
        && isSymmetricChild(leftroot.right,rightroot.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
}