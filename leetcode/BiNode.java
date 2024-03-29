/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 二叉树数据结构TreeNode可用来表示单向链表（其中left置空，right为下一个链表节点）。实现一个方法，把二叉搜索树转换为单向链表，要求依然符合二叉搜索树的性质，转换操作应是原址的，也就是在原始的二叉搜索树上直接修改。

返回转换后的单向链表的头节点。

注意：本题相对原题稍作改动

 

示例：

输入： [4,2,5,1,3,null,6,0]
输出： [0,null,1,null,2,null,3,null,4,null,5,null,6]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binode-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * }
 */
class Solution {
    public TreeNode convertBiNode(TreeNode root) {
        TreeNode head = new TreeNode(-1);
        TreeNode cur = root;
        TreeNode pre = head;
        Deque<TreeNode> list = new LinkedList<>();
        //采取中序遍历
        while(cur != null || !list.isEmpty()) {
            if(cur != null) {
                list.add(cur);
                cur = cur.left;
            }else {
                cur = list.pollLast();
                //链表处理
                cur.left = null;
                pre.right = cur;
                pre = cur;
                
                cur = cur.right;
            }
        }
        return head.right;
    }
}