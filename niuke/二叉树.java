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
    private int max = 0;
    public void TreeDepthHelper(TreeNode root,int depth) {
        if(root == null) {
            if(max < depth) {
                max = depth;
            }
            return;
        }
        TreeDepthHelper(root.left,depth+1);
        TreeDepthHelper(root.right,depth+1);
    }
    
    public int TreeDepth(TreeNode root) {
        if(root == null) {
            return max;
        }
        int depth = 0;
        TreeDepthHelper(root,depth);
        return max;
    }
}




public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(TreeDepth(root.left),TreeDepth(root.right)) + 1;
    }
}


import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for(int i = 0;i < size;i++) {
                TreeNode cur = queue.poll();
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
        return depth;
    }
}