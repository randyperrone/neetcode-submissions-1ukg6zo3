class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int ROW = obstacleGrid.length, COL = obstacleGrid[0].length;
        if (obstacleGrid[ROW - 1][COL - 1] == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }

        int[] prevRow = new int[COL];
        boolean notFirstTime = false;
        for (int i = ROW - 1; i >= 0; i--) {
            System.out.println(i);
            int[] currRow = new int[COL];
            if (obstacleGrid[i][COL - 1] == 1 || (prevRow[COL - 1] == 0 && notFirstTime)){
                currRow[COL - 1] = 0;
            } else {
                currRow[COL - 1] = 1;
            }
            notFirstTime = true;
            for (int j = COL - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    currRow[j] = 0;
                } else {
                    currRow[j] = currRow[j+1] + prevRow[j];
                }
            }
            prevRow = currRow;
        }
        return prevRow[0];
    }
}