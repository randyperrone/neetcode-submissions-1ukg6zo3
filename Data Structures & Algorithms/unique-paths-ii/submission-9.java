class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int ROW = obstacleGrid.length, COL = obstacleGrid[0].length;
        if (obstacleGrid[ROW - 1][COL - 1] == 1) {
            return 0;
        } 

        int[] prevRow = new int[COL];
        prevRow[COL - 1] = 1;
        for (int r = ROW - 1; r >= 0; r--) {
            int[] currRow = new int[COL];
            currRow[COL - 1] = (obstacleGrid[r][COL - 1] == 1 || prevRow[COL - 1] == 0) ? 0 : 1;
            for (int c = COL - 2; c >= 0; c--) {
                currRow[c] = (obstacleGrid[r][c] == 0) ? (prevRow[c] + currRow[c+1]) : 0;
                System.out.println(currRow[c]);
            }
            prevRow = currRow;
        }
        return prevRow[0];
    }
}