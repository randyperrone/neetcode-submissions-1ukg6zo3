class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int count = 0;
        int maxJump = 0;
        int currentEnd = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxJump = Math.max(maxJump, i + nums[i]);
            if (i == currentEnd) {
                count++;
                currentEnd = maxJump;
            }
        }
        
        return count;
    }
}
