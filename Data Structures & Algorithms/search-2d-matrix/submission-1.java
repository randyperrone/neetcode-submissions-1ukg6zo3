class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        for (int i = 0; i < ROW; i++) {
            if ((matrix[i][0] <= target) && (matrix[i][COL - 1] >= target)) {
                for (int j = 0; j < COL; j++) {
                    if (target == matrix[i][j]) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
