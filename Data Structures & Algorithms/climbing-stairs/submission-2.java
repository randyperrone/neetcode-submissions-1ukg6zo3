class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n];


        return dfs(n, 0, cache);
    }

    public int dfs(int n, int i, int[] cache) {
        if (n == i) {
            return 1;
        }
        if (i > n) {
            return 0;
        }
        if (cache[i] != 0) {
            return cache[i];
        }

        cache[i] = dfs(n, i+1, cache) + dfs(n, i+2, cache);
        return cache[i];
    }
}
