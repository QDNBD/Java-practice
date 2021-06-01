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

/*
* 队列LinkedList完成层序遍历，用end记录每层结点数目
*/
public class Solution {
//     ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//      ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer>>();
//         if(pRoot == null) {
//             return result;
//         }
//         Queue<TreeNode> layer = new LinkedList<>();
//         ArrayList<Integer> layerList = new ArrayList<>();
//         layer.add(pRoot);
//         int star = 0;
//         int end = 1;
//         while(!layer.isEmpty()) {
//             TreeNode cur = layer.remove();
//             layerList.add(cur.val);
//             star++;
//             if(cur.left != null) {
//                 layer.add(cur.left);
//             }
//             if(cur.right != null) {
//                 layer.add(cur.right);
//             }
//             if(star == end) {
//                 end = layer.size();
//                 star = 0;
//                 result.add(layerList);
//                 layerList = new ArrayList<Integer>();
//             }
//         }
//         return result;
//     }
    
    
    //用递归
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
        depthPrint(pRoot,1,list);
        return list;
    }
    
    private void depthPrint(TreeNode root,int depth,ArrayList<ArrayList<Integer> > list) {
        if(root == null) {
            return;
        }
        if(depth > list.size()) {
            list.add(new ArrayList<Integer>());
        }
        list.get(depth - 1).add(root.val);
        depthPrint(root.left,depth + 1,list);
        depthPrint(root.right,depth + 1,list);
    }
}