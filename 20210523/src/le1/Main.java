package le1;

import java.util.*;

public class Main{
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            if(nums.length == 0) {
                System.out.println(nums.length);
                continue;
            }
            //建树
            int index = 1;
            TreeNode root = new TreeNode(nums[0]);
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while(index < nums.length) {
                int value = 0;
                TreeNode cur = null;
                cur = queue.poll();
                value = nums[index++];
                if(value == 1) {
                    cur.left = new TreeNode(value);
                    queue.offer(new TreeNode(value));
                }else {
                    cur.left = null;
                }
                if(index == nums.length) {
                    break;
                }
                value = nums[index++];
                if(value == 1) {
                    cur.right = new TreeNode(value);
                    queue.offer(new TreeNode(value));
                }else {
                    cur.right = null;
                }
            }
            //建树完成
            int res = minCount(root, 0);
            System.out.println(res + 1);
        }
        sc.close();
    }

    public static int minCount(TreeNode root, int res){
        if(root == null) {
            return 0;
        }
        if(dfs(root, res) == 0) {
            res++;
        }
        return res;
    }

    public static int dfs(TreeNode root, int res) {
        if(root == null) {
            return 2;
        }
        int leftValue = dfs(root.left,res);
        int rightValue = dfs(root.right,res);

        if(leftValue == 2 && rightValue == 2) {
            return 0;
        }
        if(leftValue == 0 || rightValue == 0) {
            res++;
            return 1;
        }
        if(leftValue == 1 || rightValue == 1) {
            return 2;
        }
        return -1;
    }

}