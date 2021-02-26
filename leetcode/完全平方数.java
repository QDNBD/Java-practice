class Solution {
    public int numSquares(int n) {
        // if(n < 4) {
        //     return n;
        // }
        // int ans = 0;
        // Queue<Integer> queue = new LinkedList<>();
        // boolean[] visited = new boolean[n];

        // queue.add(n);
        // while(!queue.isEmpty()) {
        //     ans++;
        //     int size = queue.size();
        //     for(int i = 0; i < size; i++) {
        //         int cur = queue.remove();
        //         for(int j = 1; j * j <= cur; j++) {
        //             if(cur - j * j == 0) {
        //                 return ans;
        //             }
        //             if(!visited[cur - j * j]) {
        //                 visited[cur - j * j] = true;
        //                 queue.add(cur - j * j);
        //             }
        //         }
        //     }
        // }
        // return ans;

        if(n < 4) {
            return n;
        }
        int[] dp = new int[n + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j * j <= i; j++) {
                if(i >= j * j) {
                    dp[i] = Math.min(dp[i],dp[i - j * j] + 1);
                }
            }
        }
        return dp[n];


    }
}