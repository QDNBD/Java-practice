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
    //�ݹ��㷨
    //1.ֻҪpRoot.left��pRoot.right�Ƿ�ԳƼ���
    //2.���ҽڵ��ֵ����ҶԳ�����left.left�� right.right ;left.rigth,right.leftҲ�Գ�
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
    
    
    //�ǵݹ��㷨
    /*
    * DFSʹ��stack������ɶԵĽڵ�
    * 1.��ջ��ʱ��Ҳ�ǳɶԳɶԵ� ��
    1.����Ϊ�գ�������
    2.һ��Ϊ�գ�����false;
    3.��Ϊ�գ��Ƚϵ�ǰֵ��ֵ���ȣ�����false��
    * 2.ȷ����ջ˳��ÿ����ջ���ǳɶԳɶԵģ���left.left�� right.right ;left.rigth,right.left
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
    * BFSʹ��Queue������ɶԵĽڵ㣬��������漫������
    * 1.���ӵ�ʱ��Ҳ�ǳɶԳɶԵ�
    1.����Ϊ�գ�������
    2.һ��Ϊ�գ�����false;
    3.��Ϊ�գ��Ƚϵ�ǰֵ��ֵ���ȣ�����false��
    * 2.ȷ�����˳��ÿ����Ӷ��ǳɶԳɶԵģ���left.left�� right.right ;left.rigth,right.left
    */
//      boolean isSymmetrical(TreeNode pRoot) {
//         if(pRoot == null) return true;
//         Queue<TreeNode> s = new LinkedList<>();
//         s.offer(pRoot.left);
//         s.offer(pRoot.right);
//         while(!s.isEmpty()) {
//             TreeNode left= s.poll();//�ɶ�ȡ��
//             TreeNode right= s.poll();
//             if(left == null && right == null) continue;
//             if(left == null || right == null) return false;
//             if(left.val != right.val) return false;
//             //�ɶԲ���
//             s.offer(left.left);
//             s.offer(right.right);
//             s.offer(left.right);
//             s.offer(right.left);
//         }
//         return true;
//     }
    
    
}