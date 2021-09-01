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
    // int count = 0;
    // public int pathSum(TreeNode root, int sum) {
    //     if(root == null) {
    //         return 0;
    //     }
    //     getPath(root,sum);
    //     pathSum(root.left,sum);
    //     pathSum(root.right,sum);
    //     return count;
    // }
    // public void getPath(TreeNode root,int sum) {
    //     if(root == null) {
    //         return;
    //     }
    //     sum -= root.val;
    //     if(sum == 0) {
    //         count++;
    //     }
    //     getPath(root.left,sum);
    //     getPath(root.right,sum);
    // }

    int[] arr = new int[1000];
    int sum;
    public int pathSum(TreeNode root, int sum) {
        this.sum = sum;
        return dfs(root,0);
    }

    private int dfs(TreeNode root,int index){
        int count = 0;
        if(root == null) {
            return count;
        }
        arr[index] = root.val;
        int temp=0;
        for(int i = index;i >= 0;i--){
            temp += arr[i];
            if(temp == sum) {
                count++;
            }
        }
        return count + dfs(root.left,index+1) + dfs(root.right,index+1);
    }
}