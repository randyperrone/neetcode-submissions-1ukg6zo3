class Solution {
    public int maxArea(int[] heights) {
        int L = 0, R = heights.length - 1, max = 0;

        while(L < R) {
            int temp = (R - L) * Math.min(heights[L], heights[R]);
            if (temp > max) {
                max = temp;
            }
            if (heights[L] < heights[R]) {
                L++;
            } else {
                R--;
            }
        }
        return max;
    }
}
