import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    private int preIndex = 0,inIndex = 0,postIndex = 0;
    public int[][] threeOrders (TreeNode root) {
        int n = sum(root);
        int[][] res = new int[3][n];
        orders(root,res);
        return res;
    }
    public int sum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+sum(root.left)+sum(root.right);
    }
    public void orders(TreeNode root,int[][] res) {
        if(root == null) {
            return;
        }
        res[0][preIndex++] = root.val;
        orders(root.left,res);
        res[1][inIndex++] = root.val;
        orders(root.right,res);
        res[2][postIndex++] = root.val;
    }
}