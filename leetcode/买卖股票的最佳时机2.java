 class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int maxProfits = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[i + 1] > prices[i]) {
                maxProfits += prices[i + 1] - prices[i];
            }
        }
        return maxProfits;
    }
}