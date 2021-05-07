输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。

 

参考以下这颗二叉搜索树：

     5
    / \
   2   6
  / \
 1   3
示例 1：

输入: [1,6,3,2,5]
输出: false
示例 2：

输入: [1,3,2,6,5]
输出: true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


class Solution {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int perValue = Integer.MAX_VALUE;
        for(int i = postorder.length - 1; i >= 0; i--) {
            if(postorder[i] > perValue) {
                return false;
            }
            while(!stack.isEmpty() && postorder[i] < stack.peek()) {
                perValue = stack.pop();
            }
            stack.push(postorder[i]);
        }
        return true;
    }
}
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length < 2) {
            return true;
        }
        return dfs(postorder, 0, postorder.length - 1);
    }
    private boolean dfs(int[] postorder, int left, int right) {
        if(left >= right) {
            return true;
        }
        int root = postorder[right];//根节点
        int k = left;
        while(k < right && postorder[k] < root) {
            k++;//找出来的都是左子树
        }
        for(int i = k; i < right; i++) {
            if(postorder[i] < root) {
                return false;
            }
        }
        return dfs(postorder, left, k - 1) && dfs(postorder,k, right - 1);

    }
}