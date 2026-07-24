class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valsToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            valsToIndex.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (valsToIndex.containsKey(temp) && valsToIndex.get(temp) != i) {
                return new int[]{i, valsToIndex.get(temp)};
            }
        }
        return new int[]{0};
    }
}
