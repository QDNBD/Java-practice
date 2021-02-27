class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0;j < matrix[0].length; j++) {
        //         if(matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        if(matrix.length <= 0 || matrix[matrix.length - 1][matrix[0].length - 1] < target) {
            return false;
        }
        int i = matrix.length - 1;
        int j = 0;
        while(i >= 0 && j < matrix[0].length) {
                if(matrix[i][j] == target) {
                    return true;
                }else if(matrix[i][j] > target) {
                    i--;
                }else {
                    j++;
                }
        }
        return false;
    }
}