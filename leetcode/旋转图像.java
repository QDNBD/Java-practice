class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length <= 1 && matrix[0].length <= 1) {
            return ;
        }
        int row = matrix.length - 1;//行
        int rank = 0;//列
        while(rank < row) {
            int p1 = rank;
            int p2 = row;
            while(p1 != row) {
                int temp = matrix[rank][p1];
                matrix[rank][p1] = matrix[p2][rank];
                matrix[p2][rank] = matrix[row][p2];
                matrix[row][p2] = matrix[p1][row];
                matrix[p1][row] = temp;
                p1++;
                p2--;
            }
            rank++;
            row--;
        }
    }
}