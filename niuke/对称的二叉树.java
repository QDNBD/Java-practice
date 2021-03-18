/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

import java.util.*;

public class Solution {
    //递归算法
    //1.只要pRoot.left和pRoot.right是否对称即可
    //2.左右节点的值相等且对称子树left.left， right.right ;left.rigth,right.left也对称
//     boolean isSymmetrical(TreeNode pRoot) {
//         if(pRoot == null) {
//             return true;
//         }
//         return isSymmetricalhelp(pRoot.left,pRoot.right);
//     }
    
//      boolean isSymmetricalhelp(TreeNode left,TreeNode right) {
//          if(left == null && right == null) {
//              return true;
//          }
//          if(left == null || right == null) {
//              return false;
//          }
//          return left.val == right.val 
//              && isSymmetricalhelp(left.left,right.right)
//              && isSymmetricalhelp(left.right,right.left);
//      }
    
    
    //非递归算法
    /*
    * DFS使用stack来保存成对的节点
    * 1.出栈的时候也是成对成对的 ，
    1.若都为空，继续；
    2.一个为空，返回false;
    3.不为空，比较当前值，值不等，返回false；
    * 2.确定入栈顺序，每次入栈都是成对成对的，如left.left， right.right ;left.rigth,right.left
    */
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot.left);
        stack.push(pRoot.right);
        while(!stack.isEmpty()) {
            TreeNode r = stack.pop();
            TreeNode l = stack.pop();
            if(l == null && r == null) {
                continue;
            }
            if(l == null || r == null) {
                return false;
            }
            if(l.val != r.val) {
                return false;
            }
            stack.push(l.left);
            stack.push(r.right);
            stack.push(l.right);
            stack.push(r.left);
        }
        return true;
    }
    
    /*
    * BFS使用Queue来保存成对的节点，代码和上面极其相似
    * 1.出队的时候也是成对成对的
    1.若都为空，继续；
    2.一个为空，返回false;
    3.不为空，比较当前值，值不等，返回false；
    * 2.确定入队顺序，每次入队都是成对成对的，如left.left， right.right ;left.rigth,right.left
    */
//      boolean isSymmetrical(TreeNode pRoot) {
//         if(pRoot == null) return true;
//         Queue<TreeNode> s = new LinkedList<>();
//         s.offer(pRoot.left);
//         s.offer(pRoot.right);
//         while(!s.isEmpty()) {
//             TreeNode left= s.poll();//成对取出
//             TreeNode right= s.poll();
//             if(left == null && right == null) continue;
//             if(left == null || right == null) return false;
//             if(left.val != right.val) return false;
//             //成对插入
//             s.offer(left.left);
//             s.offer(right.right);
//             s.offer(left.right);
//             s.offer(right.left);
//         }
//         return true;
//     }
    
    
}