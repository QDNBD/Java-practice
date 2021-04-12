class Solution {
    //public int uniquePaths(int m, int n) {
        // int[][] dp = new int[m][n];
        // for(int i = 0;i < m;i++) {
        //     for(int j = 0;j < n;j++) {
        //         if(i == 0 || j == 0) {
        //             dp[i][j] = 1;
        //         }else {
        //             dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        //         }
        //     }
        // }
        // return dp[m-1][n-1]; 
   // }

    int[][] a = new int[105][105];
   public int uniquePaths(int m,int n) {
       return getUnique(m - 1,n - 1);
   }
   private int getUnique(int x,int y) {
       if(x < 0 || y < 0) {
           return 0;
       }
       if(x == 0 || y == 0) {
           return 1;
       }
       if(a[x][y] > 0) {
           return a[x][y];
       }
       a[x][y] = getUnique(x - 1,y) + getUnique(x,y - 1);
       return a[x][y];
   }
}