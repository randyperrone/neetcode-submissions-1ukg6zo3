class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> vals = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (vals.containsKey(remaining)) {
                int[] output = {vals.get(remaining), i};
                return output;
            } else {
                vals.put(nums[i], i);
            }
        }
        return null;
    }
}
