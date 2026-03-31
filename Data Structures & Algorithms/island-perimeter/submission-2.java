class Solution {
    public int islandPerimeter(int[][] grid) {
        int ROW = grid.length, COL = grid[0].length;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j, ROW, COL);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int r, int c, int ROW, int COL) {
        if (r >= ROW || c >= COL || r < 0 || c < 0 || grid[r][c] == 0) {
            return 1;
        }
        if (grid[r][c] == -1) {
            return 0;
        }

        grid[r][c] = -1;
        return dfs(grid, r+1, c, ROW, COL) 
        + dfs(grid, r-1, c, ROW, COL)
        + dfs(grid, r, c+1, ROW, COL)
        + dfs(grid, r, c-1, ROW, COL);
    }
}