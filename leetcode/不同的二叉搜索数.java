class Solution {
    // public int numTrees(int n) {
    //    int[] dp = new int[n + 1];
    //    dp[0] = 1;
    //    for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             dp[i] += dp[j - 1] * dp[i - j];
    //         }
    //     }
    //     return dp[n];
    // }

    Map<Integer, Integer> memory = new HashMap<>();
    public int numTrees(int n) {
        return helper(1, n);
    }
    public int helper(int begin, int end) {
        //因为二叉搜索树的种类只与节点个数有关，那么建立备忘录，防止重复计算
        if (memory.containsKey(end - begin))
            return memory.get(end - begin);
        //空二叉树也是一棵搜索二叉树
        if (begin > end)
            return 1;
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            //以i为根节点时左，右子树的个数
            int leftSize = helper(begin, i - 1);
            int rightSize = helper(i + 1, end);
            sum += leftSize * rightSize;
        }
        memory.put(end - begin, sum);
        return sum;
    }
}