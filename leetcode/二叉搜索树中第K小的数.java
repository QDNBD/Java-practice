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
    /**
     * 查找左子树节点个数为leftN,如果K<=leftN,则所查找节点在左子树上.
     * 若K=leftN+1,则所查找节点为根节点
     * 若K>leftN+1,则所查找节点在右子树上,按照同样方法查找右子树第K-leftN个节点
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        int leftN = findChild(root.left);
        if(leftN + 1 == k) {
            return root.val;
        }else if(k <= leftN) {
            return kthSmallest(root.left,k);
        }else {
            return kthSmallest(root.right,k - leftN - 1);
        }
    }

    /**
     *查找子节点个数
     * @param root
     * @return
     */
    private int findChild(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return findChild(root.left) + findChild(root.right) + 1;
    }
}