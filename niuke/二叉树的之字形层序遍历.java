import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 题目描述
给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
例如：
给定的二叉树是{3,9,20,#,#,15,7},

该二叉树之字形层序遍历的结果是
[
[3],
[20,9],
[15,7]
]
示例1
输入
复制
{1,#,2}
返回值
复制
[[1],[2]]
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        int count = 1;//表示层数
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while(!deque.isEmpty()) {
            int n = deque.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                TreeNode node = deque.pollFirst();
                list.add(node.val);
                if(node.left != null) deque.add(node.left);
                if(node.right != null) deque.add(node.right);
            }
            if(count % 2 == 1) {
                res.add(list);
                count++;
            }else {
                Collections.reverse(list);
                res.add(list);
                count++;
            }
        }
        return res;
    }
}