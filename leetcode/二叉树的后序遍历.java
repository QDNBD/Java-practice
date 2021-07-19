/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null ) {
            return res;
        }
        postorderHedler(root, res);
        return res;
    }
    public void postorderHedler(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        postorderHedler(root.left, list);
        postorderHedler(root.right, list);
        list.add(root.val);
    }
}