class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (valToIndex.containsKey(temp)) {
                return new int[]{valToIndex.get(temp), i};
            } else {
                valToIndex.put(nums[i], i);
            }
        }
        return new int[]{0};
    }
}
