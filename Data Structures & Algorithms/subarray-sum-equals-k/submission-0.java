class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1) {
            if (nums[0] == k) {
                return 1;
            }
            return 0;
        }

        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int val = nums[j] - ((i == 0) ? 0 : nums[i - 1]);
                if (val == k) {
                    total++;
                }
            }
        }
        return total;
    }
}