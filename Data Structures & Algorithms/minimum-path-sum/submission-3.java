class Solution {
    public int minPathSum(int[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        int[] prevRow = new int[COL];
        prevRow[COL-1] = grid[ROW-1][COL-1];
        for(int i = COL - 2; i >= 0; i--) {
            prevRow[i] = grid[ROW-1][i] + prevRow[i + 1];
        }

        for (int i = ROW - 2; i >= 0; i--) {
            int[] currRow = new int[COL];
            currRow[COL-1] = grid[i][COL-1] + prevRow[COL-1];
            for (int j = COL - 2; j >= 0; j--) {
                if (currRow[j+1] > prevRow[j]){
                    currRow[j] = grid[i][j] + prevRow[j];
                } else {
                    currRow[j] = grid[i][j] + currRow[j+1];
                }
            }
            prevRow = currRow;
        }
        return prevRow[0];
    }
}