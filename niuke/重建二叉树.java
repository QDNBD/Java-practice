public class Solution {
    public TreeNode reConstructBinaryTreeCore(int[] pre,int pre_star,int pre_end,int[] in,int in_star,int in_end){
        if(pre_star > pre_end || in_star > in_end) {
            return null;
        }
        TreeNode root = new TreeNode(pre[pre_star]);
        int i = in_star;
        for(;i <= in_end;i++) {//在中序序列中，找根节点，可以将数组划分为两部分
            if(in[i] == pre[pre_star]) {
            //前序的第一个节点，是root，能将中序划分为两部分
            //一棵树，无论前，中，后怎么遍历，元素的个数是不变的
            //在实际遍历的时候，前，中，后序遍历，各种遍历方式左右子树的节点都是在一起的
            //所以这里重点是要想清楚下标问题
            //根据中序，我们能确认左子树的节点个数是：i - inStart (没有从0开始哦)
            //所以，需要从preStart+1，连续i - inStart个元素，就是左子树的前序序列
                root.left = reConstructBinaryTreeCore(pre,pre_star+1,i-in_star+pre_star,in,in_star,i-1);
                root.right = reConstructBinaryTreeCore(pre,i-in_star+pre_star+1,pre_end,in,i+1,in_end);
                break;
            }
        }
        return root;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0){
            return null;
        }
        //理论上，可以新建数组，保存前序，中序子序列，但是就需要花费额外空间
        //所以，我们采取在原数组内进行操作
        //使用闭区间限定数组范围
        return reConstructBinaryTreeCore(pre,0,pre.length-1,in,0,in.length-1);
    }
}