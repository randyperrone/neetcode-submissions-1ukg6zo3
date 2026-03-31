class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        int[][] visited = new int[ROW][COL];
        Queue<int[]> queue = new LinkedList<>();

        if (grid[0][0] == 1 || grid[ROW-1][COL-1] == 1) {
            return -1;
        }

        queue.add(new int[2]);
        visited[0][0] = 1;

        int length = 1;
        while(!queue.isEmpty()) {
            int queueLength = queue.size();
            for(int i = 0; i < queueLength; i++){
                int[] pair = queue.poll();
                int r = pair[0], c = pair[1];
                if (r == ROW - 1 && c == COL - 1) {
                    return length;
                }
                int[][] neighbors = {{r, c+1}, {r, c-1}, {r+1, c}, {r-1, c}, {r-1, c-1},
                {r-1, c+1,}, {r+1, c+1}, {r+1, c-1}};
                for (int j = 0; j < 8; j++) {
                    int newR = neighbors[j][0];
                    int newC = neighbors[j][1];
                    if(Math.min(newR, newC) < 0 || newR == ROW || newC == COL 
                        || visited[newR][newC] == 1 || grid[newR][newC] == 1) {
                            continue;
                    }
                    visited[newR][newC] = 1;
                    queue.add(neighbors[j]);
                }
                
            }
            length++;
        }
        return -1;
    }
}