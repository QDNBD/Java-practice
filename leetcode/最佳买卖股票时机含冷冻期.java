class Solution {
    public int maxProfit(int[] prices) {
        // if(prices.length == 0) {
        //     return 0;
        // }
        // int[][] f = new int[prices.length][3];
        // // f[i][0]: 手上持有股票的最大收益
        // // f[i][1]: 手上不持有股票，并且处于冷冻期中的累计最大收益
        // // f[i][2]: 手上不持有股票，并且不在冷冻期中的累计最大收益
        // f[0][0] = -prices[0];//边界情况，第0天买入就是负收益
        // f[0][1] = 0;
        // f[0][2] = 0;
        // for(int i = 1;i < prices.length;i++) {
        //      //第i天不持有股票的情况有两种
        //     //a.第i-1天也不持有股票
        //     //b.第i-1天是过渡期
        //     f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        //     //第i天持有股票有两种情况
        //     //a.第i-1天也持有股票，第i天不操作，
        //     //b.第i-1天不持有股票，在第i天买入
        //     f[i][0] = Math.max(f[i - 1][0],f[i - 1][2] - prices[i]);
        //     //第i天是冷冻期只有一种情况，第i-1天持有股票且卖出
        //     f[i][1] = f[i - 1][0] + prices[i];
        // }
        // //最后最大利润为最后一天，不持有股票或者进入冷冻期的情况
        // return Math.max(f[prices.length - 1][1], f[prices.length - 1][2]);

        //空间优化
        //发现只与前一天有关系
         if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        int f0 = -prices[0];
        int f1 = 0;
        int f2 = 0;
        for (int i = 1; i < n; ++i) {
            int newf0 = Math.max(f0, f2 - prices[i]);
            int newf1 = f0 + prices[i];
            int newf2 = Math.max(f1, f2);
            f0 = newf0;
            f1 = newf1;
            f2 = newf2;
        }

        return Math.max(f1, f2);

    }
}
