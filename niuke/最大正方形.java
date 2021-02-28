class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) {
            return 0;
        }
        int max = 0;
        int[][] temp = new int[matrix.length + 1][matrix[0].length + 1];
        for(int i = 1;i <= matrix.length;i++) {
            for(int j = 1;j <= matrix[0].length;j++) {
                if(matrix[i - 1][j - 1] == '1') {
                    temp[i][j] = 1 + Math.min(temp[i - 1][j - 1],Math.min(temp[i - 1][j],temp[i][j - 1]));
                    if(temp[i][j] > max) {
                        max = temp[i][j];
                    }
                }
            }
        }
        return max * max;
    }
}