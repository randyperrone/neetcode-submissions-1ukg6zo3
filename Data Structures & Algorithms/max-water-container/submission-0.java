class Solution {
    public int maxArea(int[] heights) {
        int R = 0, L = (heights.length - 1);
        int max = 0;

        while (R < L) {
            int temp = (L - R) * Math.min(heights[L], heights[R]);
            max = Math.max(max, temp);
            if (heights[R] < heights[L]) {
                R++;
            } else {
                L--;
            }
        }
        return max;
    }
}
