import java.util.*;

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

//采用层序遍历，不需要将转化为完全二叉树的简单方法
// public class Solution {
//     String Serialize(TreeNode root) {
//         StringBuffer sb = new StringBuffer();
//         Queue<TreeNode> queue = new LinkedList<>();
//         if(root != null) {
//             queue.add(root);
//         }
//         while(!queue.isEmpty()) {
//             TreeNode node = queue.poll();
//             if(node != null) {
//                 queue.add(node.left);
//                 queue.add(node.right);
//                 sb.append(node.val + ",");
//             }else {
//                 sb.append("#,");
//             }
//         }
//         if(sb.length() != 0) {
//             sb.deleteCharAt(sb.length() - 1);
//         }
//         return sb.toString();
//   }
//     TreeNode Deserialize(String str) {
//         if(str == null || str.length() == 0) {
//             return null;
//         }
//         String[] nodes = str.split(",");
//         TreeNode[] cur = new TreeNode[nodes.length];
//         for(int i = 0;i < nodes.length;i++) {
//             if(!nodes[i].equals("#")) {
//                 cur[i] = new TreeNode(Integer.valueOf(nodes[i]));
//             }
//         }
//         for(int i = 0,j = 1;j < cur.length;i++) {
//             if(cur[i] != null) {
//                 cur[i].left = cur[j++];
//                 cur[i].right = cur[j++];
//             }
//         }
//         return cur[0];
//   }
// }

//前序遍历
public class Solution {
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
       getSerialize(root,sb);
        if(sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
    void getSerialize(TreeNode root,StringBuffer sb) {
         if(root == null) {
            sb.append("#,");
        }else {
            sb.append(root.val + ",");
             getSerialize(root.left,sb);
             getSerialize(root.right,sb);
        }
    }
    
    TreeNode Deserialize(String str) {
        if(str == null || str.length() == 0 || str.length() ==1) {
            return null;
        }
        String[] nodes = str.split(",");
        TreeNode[] treeNodes = new TreeNode[nodes.length];
        for(int i=0; i<nodes.length; i++){
            if(!nodes[i].equals("#"))
                treeNodes[i] = new TreeNode(Integer.valueOf(nodes[i]));
        }
         Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNodes[0]);
        int i = 1;
        while(treeNodes[i] != null){
            stack.peek().left = treeNodes[i];
            stack.push(treeNodes[i++]);
        }
        while(!stack.isEmpty()){
            stack.pop().right = treeNodes[++i];
            if(treeNodes[i] != null){
                stack.push(treeNodes[i++]);
                while(treeNodes[i] != null){
                    stack.peek().left = treeNodes[i];
                    stack.push(treeNodes[i++]);
                }
            }
        }
        return treeNodes[0];
      
    }
}








