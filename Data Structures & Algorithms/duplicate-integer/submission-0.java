class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();
        for(int num: nums) {
            if (visited.contains(num)) {
                return true;
            } else {
                visited.add(num);
            }
        }
        return false;
    }
}