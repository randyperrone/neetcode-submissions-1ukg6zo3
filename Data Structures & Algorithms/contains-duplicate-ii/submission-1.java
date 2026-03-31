class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (visited.containsKey(nums[i])) {
                Integer abs = Math.abs(i - visited.get(nums[i]));
                if (abs <= k) {
                    return true;
                } else {
                    visited.put(nums[i], i);
                }
            } else {
                visited.put(nums[i], i);
            }
        }
        return false;
    }
}