class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int num: nums) {
            if (currSum < 0) {
                currSum = 0;
            } 
            currSum += num;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
