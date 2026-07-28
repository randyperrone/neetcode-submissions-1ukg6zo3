class Solution {
    public int search(int[] nums, int target) {
        int L = 0, R = nums.length - 1, M = 0;

        while (L <= R) {
            M = (L + R) / 2;

            if (target > nums[M]) {
                L = M + 1;
            } else if (target < nums[M]) {
                R = M - 1;
            } else {
                return M;
            }
        }
        return -1;
    }
}
