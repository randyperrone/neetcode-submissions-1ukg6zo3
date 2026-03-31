class Solution {
    public int[] getConcatenation(int[] nums) {
        int numLength = nums.length;
        int ansLength = numLength * 2;
        int[] ans = new int[ansLength]; 
        for(int i = 0; i < ansLength; i++) {
            ans[i] = nums[i%numLength];
        }
        return ans;
    }
}