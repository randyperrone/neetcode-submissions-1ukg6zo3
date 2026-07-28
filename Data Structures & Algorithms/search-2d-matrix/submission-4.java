class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int LRow = 0, RRow = matrix.length - 1, MRow = 0;

        while (LRow <= RRow) {
            MRow = (LRow + RRow) / 2;
            if (target > matrix[MRow][matrix[0].length - 1]) {
                LRow = MRow + 1;
            } else if (target < matrix[MRow][0]) {
                RRow = MRow - 1;
            } else {
                break;
            }
        }
        int L = 0, M = 0, R = matrix[0].length - 1;
        while (L <= R) {
            M = (L + R) / 2;
            if (target > matrix[MRow][M]) {
                L = M + 1;
            } else if (target < matrix[MRow][M]) {
                R = M - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
