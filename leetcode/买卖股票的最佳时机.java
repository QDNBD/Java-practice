class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfits = 0;
        for(int i = 0; i < prices.length; i++) {
            if(minPrice >= prices[i]) {
                minPrice = prices[i];
            }else {
                maxProfits = Math.max(maxProfits, prices[i] - minPrice);
            }
        }
        return maxProfits;
    }
}