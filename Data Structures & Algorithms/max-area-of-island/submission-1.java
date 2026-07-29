class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int greatestCount = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    int temp = dfs(grid, r, c);
                    if (temp > greatestCount) {
                        greatestCount = temp;
                    }
                }
            }
        }
        return greatestCount;
    }

    public int dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        grid[r][c] = 0;
        int count = 1;

        count += dfs(grid, r+1, c);
        count += dfs(grid, r-1, c);
        count += dfs(grid, r, c+1);
        count += dfs(grid, r, c-1);

        return count;
    }
}
