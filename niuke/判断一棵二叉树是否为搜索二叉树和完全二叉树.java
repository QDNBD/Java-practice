import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 给定一棵二叉树，已经其中没有重复值的节点，请判断该二叉树是否为搜索二叉树和完全二叉树。
示例1
输入
复制
{2,1,3}
返回值
复制
[true,true]
 */

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
     * @param root TreeNode类 the root
     * @return bool布尔型一维数组
     */
    public boolean[] judgeIt (TreeNode root) {
        // write code here
        boolean[] res = new boolean[2];
        if(root == null) {
            res[0] = true;
            res[1] = true;
            return res;
        }
        res[0] = selectTree(root);
        res[1] = entTree(root);
       return res;
    }
    public boolean selectTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left != null) {
            if(root.left.val > root.val) {
                return false;
            }
        }
        if(root.right != null) {
            if(root.right.val < root.val) {
                return false;
            }
        }
        return selectTree(root.left) && selectTree(root.right); 
    }
    
    public boolean entTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left != null && root.right == null) {
            return entTree(root.left);
        }
        if(root.left == null && root.right != null) {
            return false;
        }
        if(root.left != null && root.right != null) {
            return entTree(root.left) && entTree(root.right);
        }
        return true;
    }
}